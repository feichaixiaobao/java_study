package com.hspedu.encap;

public class Account {
    private String name; // 姓名
    private double balance; // 余额
    private String password; // 密码

    public Account() {
        this.name = "default";
        this.balance = 20.0;
        this.password = "000000";
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("姓名长度必须为2位到4位，默认值为default");
        }
    }

    public void setBalance(double balance) {
        if (balance > 20.0) {
            this.balance = balance;
        } else {
            System.out.println("余额必须大于20，默认值为20");
        }
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            System.out.println("密码长度必须为6位，默认值为000000");
        }
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }
}
