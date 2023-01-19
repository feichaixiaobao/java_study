package jp.feichaixiaobao.user.hyz3125;

import java.util.Scanner;
public class sample2_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("x に数値を入力");
        int x = scan.nextInt();
        System.out.println("y に数値を入力");
        int y = scan.nextInt();
        System.out.println("x と y の和=" + (x + y));
        System.out.println("x と y の差=" + (x - y));
        System.out.println("x と y の積=" + x * y);
        System.out.println("x と y の商=" + x / y);
        System.out.println("x と y の余り=" + x % y);
    }
}
