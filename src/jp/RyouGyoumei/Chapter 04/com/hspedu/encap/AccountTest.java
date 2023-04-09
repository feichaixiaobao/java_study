package com.hspedu.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("Tom");
        account.setBalance(50.0);
        account.setPassword("123456");

        System.out.println("姓名：" + account.getName());
        System.out.println("余额：" + account.getBalance());
        System.out.println("密码：" + account.getPassword());
    }
}
