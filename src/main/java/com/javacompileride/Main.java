package com.javacompileride;

import com.javacompileride.ui.MainFrame;
import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // 简单设置编码
        System.setProperty("file.encoding", "UTF-8");

        // 设置外观
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            // 如果 FlatLaf 失败，使用跨平台外观
            try {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } catch (Exception e) {
                // 忽略外观错误，使用默认外观
            }
        }

        // 创建并显示GUI
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }
}
