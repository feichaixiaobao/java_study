package jp.feichaixiaobao.user.hyz3125;

import java.util.Scanner;
public class sample3_7 {
    public static void main(String[] args) {
        System.out.println("試験の点数を入力");
        Scanner scan = new Scanner(System.in);
        int point = scan.nextInt();
        if(point < 0 || point > 100){
            System.out.println("Wrong point");
        }
        System.out.println("1.ケース1");
        System.out.println("2.ケース2");
        System.out.println("3.ケース3");
        System.out.println("評価ケース番号を選んでください：");
        int casenumber = scan.nextInt();
            switch(casenumber){
                case 1:
                    if(point < 60){
                        System.out.println("不合格");
                    }else{
                        System.out.println("合格");
                    }
                break;
                case 2:
                    if(point >= 80){
                        System.out.println("たいへんよくできました");
                    }else if(point < 60){
                        System.out.println("ざんねんでした。");
                    }else{
                        System.out.println("よくできました。");
                    }
                break;
                case 3:
                    if(point >= 80){
                        System.out.println("優");
                    }else if(point < 60){
                        System.out.println("不可");
                    }else{
                        System.out.println("可");
                    }
                    break;
            }
    
    }
}