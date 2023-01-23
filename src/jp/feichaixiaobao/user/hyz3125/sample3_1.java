package jp.feichaixiaobao.user.hyz3125;

import java.util.Scanner;

public class sample3_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("xを入力");
        int x = scan.nextInt();
        System.out.println("yを入力");
        int y = scan.nextInt();
        if(x > y){
            System.out.println("xはyより大きい");
        }else if (x < y) {
            System.out.println("xはyより小さい");
        } else {
            System.out.println("xはyと等しい");
        }

    }
}

