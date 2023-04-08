package com.hspedu.encap;

import javax.swing.*;

public class HelloWorldSwing {
    private static void createAndShowGUI() {
        // 创建窗口
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 创建标签
        JLabel label = new JLabel("Hello World!");

        // 创建按钮
        JButton button = new JButton("Click me!");
        button.addActionListener(e -> {
            // 显示消息对话框
            JOptionPane.showMessageDialog(frame, "Hello World!");
        });

        // 添加标签和按钮到窗口
        frame.getContentPane().add(label);
        frame.getContentPane().add(button);

        // 显示窗口
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // 显示用户界面
        javax.swing.SwingUtilities.invokeLater(HelloWorldSwing::createAndShowGUI);
    }
}
