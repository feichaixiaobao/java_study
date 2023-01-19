package jp.feichaixiaobao.user.hyz3125;

import java.util.Scanner;
public class sample2_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("x に数値を入力");
        int x = scan.nextInt();
        System.out.println("y に数値を入力");
        int y = scan.nextInt();
        System.out.print("x と y の平均値=" + ((x + y) / 2));        
    }
    
}
