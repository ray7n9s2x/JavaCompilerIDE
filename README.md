# Java Compiler IDE

一个轻量级的 Java 集成开发环境，内置 OpenJDK 21，真正开箱即用！

## ✨ 特性

- ✅ **内置 OpenJDK 21** - 无需安装任何 Java 环境
- ✅ **完整的 UTF-8 支持** - 完美支持中文和特殊字符
- ✅ **语法高亮** - 基于 RSyntaxTextArea 的专业代码编辑
- ✅ **代码折叠** - 支持方法和大纲折叠
- ✅ **一键编译运行** - F9 快速编译并运行
- ✅ **深色主题** - 护眼的深色代码编辑器
- ✅ **实时错误提示** - 详细的编译错误信息
- ✅ **文件管理** - 新建、打开、保存 Java 文件

## 🚀 快速开始

### 方法一：使用分发包（推荐）
1. 下载 `JavaCompilerIDE-1.0.0-with-jdk.zip`
2. 解压到任意目录
3. 运行 `JavaCompilerIDE.exe`
4. 开始编写 Java 代码！

### 方法二：从源码构建
```bash
# 1. 克隆或下载源码
# 2. 运行构建脚本
./build-with-jdk.bat

# 3. 运行程序
./build/launch4j/JavaCompilerIDE.exe
```
## 📁 项目结构
````text
JavaCompilerIDE/
├── JavaCompilerIDE.exe          # 主程序
├── jdk/                        # 内置 OpenJDK 21
│   ├── bin/
│   │   ├── javac.exe          # Java 编译器
│   │   ├── java.exe           # Java 运行时
│   │   └── ...
│   ├── lib/                   # Java 类库
│   └── ...
├── examples/                  # 示例代码
│   ├── HelloWorld.java
│   ├── Calculator.java
│   └── ArrayExample.java
└── README.md
````

## ⌨️ 快捷键
| 功能                            | 快捷键                        | 说明           |
|-------------------------------|----------------------------|--------------|
| 新建文件                          | Ctrl + N                   | 创建新的 Java 文件 |
| 打开文件                          | Ctrl + O                   | 打开现有 Java 文件 |
| 保存文件                          | Ctrl + S                   | 保存当前文件       |
| 另存为|  Ctrl + Shift + S |  另存为其他文件     |
|  编译                           | F7                         | 编译当前代码       |
| 运行                            | F5                         | 运行已编译的程序     |

## 💡 使用示例
### 1. 基础 Hello World
````java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java! 你好，Java！");
        System.out.println("欢迎使用 Java Compiler IDE");
    }
}
````
### 2. 中文支持测试
````java
public class ChineseTest {
    public static void main(String[] args) {
        String 中文变量 = "中文测试";
        System.out.println("变量值: " + 中文变量);
        System.out.println("UTF-8 编码正常 ✓");
        System.out.println("特殊字符: © ® ™ € ¥");
    }
}
````

## 🛠️ 开发信息
### 技术栈

- SDK: OpenJDK
- 构建工具: Gradle 8.14
- 打包工具: Launch4j
- GUI 框架: Java Swing
- 代码编辑器: RSyntaxTextArea
- 界面主题: FlatLaf

### 构建要求

- Windows 10/11 (64位)
- OpenJDK 21 或 Oracle JDK 21
- 至少 500MB 磁盘空间

### 构建命令
````bash
# 清理项目
./gradlew clean

# 编译项目
./gradlew build

# 创建可执行文件（包含 JDK）
./gradlew buildExe

# 创建完整分发包
./gradlew dist
````

## 🔧 故障排除
### 常见问题
- Q: 程序无法启动
- A: 确保解压了整个分发包，不要单独移动 .exe 文件
- Q: 中文显示乱码
- A: 程序已配置完整的 UTF-8 支持，如果仍有问题请检查系统区域设置
- Q: 编译失败
- A: 确保代码语法正确，查看输出面板的错误信息
- Q: 运行时报错
- A: 检查 main 方法是否存在且语法正确

### 系统要求
- 操作系统: Windows 7/8/10/11 (64位)
- 内存: 至少 2GB RAM
- 磁盘空间: 至少 200MB 可用空间
- 无需预先安装 Java

## 📄 许可证
MIT License

## 🤝 贡献
欢迎提交 Issue 和 Pull Request！

## 📞 支持
如果您遇到任何问题，请：

1. 查看本 README 的故障排除部分
2. 检查输出面板的错误信息
3. 确认代码语法正确

#### 享受编程的乐趣！ 🎉
##### 最后更新： 2025-11-22