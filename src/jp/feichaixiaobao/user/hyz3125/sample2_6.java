package jp.feichaixiaobao.user.hyz3125;

import java.util.Scanner;
public class sample2_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("年齢に数値を入力");
        int x = scan.nextInt();
        System.out.print("生まれてから現在までおおよそ" + (x * 365) + "日");        
    }
}
