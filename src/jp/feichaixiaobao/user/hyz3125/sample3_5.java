package jp.feichaixiaobao.user.hyz3125;

import java.util.Scanner;
public class sample3_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("正の整数値を入力");
        int x = scan.nextInt();
        if((x % 2) == 0){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }
    }
    
}
