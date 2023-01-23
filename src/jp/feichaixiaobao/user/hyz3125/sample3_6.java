package jp.feichaixiaobao.user.hyz3125;

import java.util.Scanner;
public class sample3_6 {
    public static void main(String[] args) {
        
    
        Scanner scan = new Scanner(System.in);
        System.out.println("整数値を入力");
        int x = scan.nextInt();
        if(x >= 0){
            if((x % 2) == 0){
                System.out.println("正の偶数");
            }else{
                System.out.println("正の奇数");
            }
        }else{
            if((x % 2) == 0){
            System.out.println("負の偶数");
            }else{
                System.out.println("負の奇数");
            }
        }
    }
}
