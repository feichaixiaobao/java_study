package com.hspedu.encap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Encapsulation01GUI extends JFrame implements ActionListener {
    private JLabel nameLabel, ageLabel, salaryLabel;
    private JTextField nameField, ageField, salaryField;
    private JButton saveButton, historyButton;
    private JTextArea historyArea;
    private ArrayList<String> historyList;

    public Encapsulation01GUI() {
        // 设置窗口标题和大小
        setTitle("Encapsulation01 GUI");
        setSize(400, 300);

        // 创建组件和布局管理器
        nameLabel = new JLabel("Name:");
        nameField = new JTextField(10);
        ageLabel = new JLabel("Age:");
        ageField = new JTextField(3);
        salaryLabel = new JLabel("Salary:");
        salaryField = new JTextField(10);
        saveButton = new JButton("Save");
        saveButton.addActionListener(this);
        historyButton = new JButton("History");
        historyButton.addActionListener(this);
        historyArea = new JTextArea(10, 30);
        historyList = new ArrayList<>();

        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(ageLabel);
        inputPanel.add(ageField);
        inputPanel.add(salaryLabel);
        inputPanel.add(salaryField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(saveButton);
        buttonPanel.add(historyButton);

        JPanel historyPanel = new JPanel(new BorderLayout());
        historyPanel.setBorder(BorderFactory.createTitledBorder("History"));
        historyPanel.add(new JScrollPane(historyArea), BorderLayout.CENTER);

        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        add(historyPanel, BorderLayout.EAST);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveButton) {
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            double salary = Double.parseDouble(salaryField.getText());

            Encapsulation01 person = new Encapsulation01();
            person.setName(name);
            person.setAge(age);
            person.setSalary(salary);

            String historyItem = "Name: " + person.getName() +
                                 ", Age: " + person.getAge() +
                                 ", Salary: " + person.getSalary();
            historyList.add(historyItem);
            historyArea.append(historyItem + "\n");
            JOptionPane.showMessageDialog(this, "Person information saved.");
        } else if (e.getSource() == historyButton) {
            int historyCount = historyList.size();
            String historyText = "";
            for (String historyItem : historyList) {
                historyText += historyItem + "\n";
            }
            JOptionPane.showMessageDialog(this, historyCount + " items saved in history.\n\n" + historyText);
        }
    }

    public static void main(String[] args) {
        Encapsulation01GUI gui = new Encapsulation01GUI();
    }
}
