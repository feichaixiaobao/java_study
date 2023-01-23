package jp.feichaixiaobao.user.hyz3125;

import java.util.Scanner;
public class sample3_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("２つの整数値を入力");
        int x = scan.nextInt();
        int y = scan.nextInt();
        if(x > y){
            System.out.println(x);
        }else if(x < y){
            System.out.println(y);
        }else{
            System.out.println("same number");
        }
    }
}
