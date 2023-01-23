package jp.feichaixiaobao.user.hyz3125;

import java.util.Scanner;

public class sample3_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("月を表す数値を入力");
        int month = scan.nextInt();
        if(month < 1 || month > 12){
            System.out.println("入力が間違っています");
        }else{
            switch(month){
                case 1 :
                System.out.println("31日");
                break;
                case 2 :
                System.out.println("28日");
                break;
                case 3 :
                System.out.println("・31日");
                break;
                case 4 :
                System.out.println("30日");
                break;
                case 5 :
                System.out.println("31日");
                break;
                case 6 :
                System.out.println("30日");
                break;
                case 7 :
                System.out.println("31日");
                break;
                case 8 :
                System.out.println("31日");
                break;
                case 9 :
                System.out.println("30日");
                break;
                case 10 :
                System.out.println("31日");
                break;
                case 11 :
                System.out.println("30日");
                break;
                case 12 :
                System.out.println("31日");
                break;
            }    
        }
    }
}