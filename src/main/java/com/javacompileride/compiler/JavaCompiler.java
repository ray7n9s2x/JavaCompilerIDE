package com.javacompileride.compiler;

import javax.tools.*;
import java.io.File;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class JavaCompiler {
    private String currentClassName = "Main";
    private Path tempDir;

    public JavaCompiler() {
        try {
            tempDir = Files.createTempDirectory("java_compile_");
            tempDir.toFile().deleteOnExit();
            System.out.println("创建临时目录: " + tempDir);
        } catch (Exception e) {
            throw new RuntimeException("无法创建临时目录", e);
        }
    }

    public void compile(String code) throws Exception {
        // 提取类名
        String className = extractClassName(code);
        if (className != null) {
            currentClassName = className;
        }
        System.out.println("编译类: " + currentClassName);

        // 检查代码是否为空
        if (code == null || code.trim().isEmpty()) {
            throw new RuntimeException("代码为空，请输入 Java 代码");
        }

        // 保存源代码到临时文件，使用 UTF-8 编码
        Path sourceFile = tempDir.resolve(currentClassName + ".java");
        Files.writeString(sourceFile, code, StandardCharsets.UTF_8);
        System.out.println("源代码保存到: " + sourceFile);

        // 首先尝试使用系统编译器 API
        javax.tools.JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        if (compiler != null) {
            System.out.println("使用系统编译器 API");
            compileWithSystemCompiler(compiler, sourceFile);
        } else {
            // 如果系统编译器不可用，使用外部 javac
            System.out.println("系统编译器不可用，使用外部 javac");
            compileWithExternalCompiler(sourceFile);
        }

        System.out.println("编译完成");
    }

    private void compileWithSystemCompiler(javax.tools.JavaCompiler compiler, Path sourceFile) throws Exception {
        DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<>();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(diagnostics, null, null);

        Iterable<? extends JavaFileObject> compilationUnits =
                fileManager.getJavaFileObjectsFromFiles(Arrays.asList(sourceFile.toFile()));

        StringWriter output = new StringWriter();

        // 设置编译选项，包括编码
        Iterable<String> options = Arrays.asList(
                "-encoding", "UTF-8",
                "-source", "21",
                "-target", "21",
                "-Xlint:unchecked"
        );

        javax.tools.JavaCompiler.CompilationTask task = compiler.getTask(
                output, fileManager, diagnostics, options, null, compilationUnits);

        boolean success = task.call();
        fileManager.close();

        if (!success) {
            StringBuilder errorMsg = new StringBuilder();
            errorMsg.append("编译失败:\n");
            for (Diagnostic<?> diagnostic : diagnostics.getDiagnostics()) {
                String message = String.format("行 %d, 列 %d: %s",
                        diagnostic.getLineNumber(),
                        diagnostic.getColumnNumber(),
                        diagnostic.getMessage(null));
                errorMsg.append(message).append("\n");
                System.err.println("编译错误: " + message);
            }
            throw new RuntimeException(errorMsg.toString());
        }

        // 检查编译输出
        String compileOutput = output.toString();
        if (!compileOutput.trim().isEmpty()) {
            System.out.println("编译输出: " + compileOutput);
        }
    }

    private void compileWithExternalCompiler(Path sourceFile) throws Exception {
        String javacPath = JDKManager.getJavaCompilerPath();
        String classpath = tempDir.toString();

        System.out.println("使用编译器: " + javacPath);
        System.out.println("类路径: " + classpath);
        System.out.println("源文件: " + sourceFile.toAbsolutePath());

        String[] command = {
                javacPath,
                "-encoding", "UTF-8",           // 源代码使用 UTF-8 编码
                "-J-Dfile.encoding=UTF-8",      // 编译器本身使用 UTF-8
                "-source", "21",
                "-target", "21",
                "-d", classpath,
                sourceFile.toAbsolutePath().toString()
        };

        // 打印命令用于调试
        System.out.println("执行命令: " + String.join(" ", command));

        ProcessRunner runner = new ProcessRunner();
        String output = runner.runProcess(command);

        // 如果有输出，记录但不抛出异常（可能是警告）
        if (!output.trim().isEmpty()) {
            System.out.println("编译输出: " + output);
            // 如果是警告信息，不抛出异常
            if (output.toLowerCase().contains("warning")) {
                System.out.println("编译警告: " + output);
            } else if (output.toLowerCase().contains("error")) {
                throw new RuntimeException("编译错误:\n" + output);
            }
        }

        // 检查是否生成了 class 文件
        Path classFile = tempDir.resolve(currentClassName + ".class");
        if (!Files.exists(classFile)) {
            throw new RuntimeException("编译失败：未生成 class 文件");
        }
        System.out.println("生成 class 文件: " + classFile);
    }

    public String run() throws Exception {
        System.out.println("运行类: " + currentClassName);

        // 检查 class 文件是否存在
        Path classFile = tempDir.resolve(currentClassName + ".class");
        if (!Files.exists(classFile)) {
            throw new RuntimeException("类文件不存在，请先编译: " + classFile);
        }

        ProcessRunner runner = new ProcessRunner();
        String classpath = tempDir.toString();
        String javaPath = JDKManager.getJavaRuntimePath();

        System.out.println("使用运行时: " + javaPath);
        System.out.println("类路径: " + classpath);

        // 使用捆绑的 JDK 运行，设置编码参数
        String[] command = {
                javaPath,
                "-Dfile.encoding=UTF-8",        // 设置运行时编码
                "-Dconsole.encoding=UTF-8",     // 控制台编码
                "-Dsun.jnu.encoding=UTF-8",     // JNU 编码
                "-cp", classpath,
                currentClassName
        };

        // 打印命令用于调试
        System.out.println("执行命令: " + String.join(" ", command));

        String output = runner.runProcess(command);
        System.out.println("运行输出: " + output);

        return output;
    }

    public String getJdkInfo() {
        try {
            String jdkPath = JDKManager.findJdkPath();
            boolean isBundled = JDKManager.isBundledJdk();
            String version = JDKManager.getJdkVersion();
            String compilerPath = JDKManager.getJavaCompilerPath();
            String runtimePath = JDKManager.getJavaRuntimePath();

            return String.format(
                    "JDK 信息:\n" +
                            "路径: %s\n" +
                            "版本: %s\n" +
                            "类型: %s\n" +
                            "编译器: %s\n" +
                            "运行时: %s\n" +
                            "临时目录: %s",
                    jdkPath,
                    version,
                    isBundled ? "捆绑 JDK" : "系统 JDK",
                    compilerPath,
                    runtimePath,
                    tempDir
            );
        } catch (Exception e) {
            return "无法获取 JDK 信息: " + e.getMessage();
        }
    }

    private String extractClassName(String code) {
        if (code == null || code.trim().isEmpty()) {
            return null;
        }

        // 简单的类名提取逻辑
        String[] lines = code.split("\n");
        for (String line : lines) {
            line = line.trim();
            // 匹配 public class ClassName {
            if (line.startsWith("public class ") && line.endsWith("{")) {
                String className = line.substring("public class ".length(), line.length() - 1).trim();
                // 处理可能的泛型等情况
                if (className.contains("<")) {
                    className = className.substring(0, className.indexOf('<'));
                }
                System.out.println("提取到类名: " + className);
                return className;
            }
            // 匹配 class ClassName {
            else if (line.startsWith("class ") && line.endsWith("{")) {
                String className = line.substring("class ".length(), line.length() - 1).trim();
                if (className.contains("<")) {
                    className = className.substring(0, className.indexOf('<'));
                }
                System.out.println("提取到类名: " + className);
                return className;
            }
        }

        System.out.println("未找到明确的类名，使用默认: Main");
        return null;
    }

    public void cleanup() {
        try {
            // 清理临时目录
            if (tempDir != null && Files.exists(tempDir)) {
                System.out.println("清理临时目录: " + tempDir);
                Files.walk(tempDir)
                        .sorted(java.util.Comparator.reverseOrder())
                        .map(Path::toFile)
                        .forEach(File::delete);
            }
        } catch (Exception e) {
            System.err.println("清理临时目录时出错: " + e.getMessage());
        }
    }

    // 获取当前正在编译/运行的类名
    public String getCurrentClassName() {
        return currentClassName;
    }

    // 获取临时目录路径（用于调试）
    public String getTempDirPath() {
        return tempDir != null ? tempDir.toString() : "未初始化";
    }

    // 检查是否已编译
    public boolean isCompiled() {
        if (tempDir == null) return false;
        Path classFile = tempDir.resolve(currentClassName + ".class");
        return Files.exists(classFile);
    }

    // 手动设置类名（用于特殊情况）
    public void setCurrentClassName(String className) {
        if (className != null && !className.trim().isEmpty()) {
            this.currentClassName = className.trim();
            System.out.println("手动设置类名为: " + this.currentClassName);
        }
    }
}
