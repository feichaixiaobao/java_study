package jp.feichaixiaobao.user.li;

import java.util.Scanner;

//練習問題 3 - 9
//        曜日と、午前、午後、夜間の区別を入力し、病院が開いているか、休診であるかを表示するプログラムを作成しなさい。
//        ・開いているか、休診であるかは、次の表に従います。
//        --------------------------------------------------
//              日曜	  月曜	火曜	  水曜	木曜	  金曜	 土曜
//        --------------------------------------------------
//        午前	休診   ○	休診   ○	 ○	  休診	   ○
//        --------------------------------------------------
//        午後	休診	  ○	 ○	  ○	 ○	   ○	  休診
//        --------------------------------------------------
//        夜間	休診	  ○	 ○	 休診	 ○	   ○	  休診
//        --------------------------------------------------
//
//        ※曜日の入力、午前、午後の入力は、次のようなガイドを表示して数値で行います。
//        --------------------------------------------------
//        >0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜
//        >0=午前、1=午後、2=夜間
//        --------------------------------------------------
public class sample3_9 {
    public static void main(String[] args) {
        System.out.println("曜日を入力してください：");
        Scanner sc =new Scanner(System.in);
        int week = sc.nextInt();
        System.out.println("時間帯（午前、午後、夜間）を入力してください：");
        int time = sc.nextInt();
        if(week < 0 || week > 6 || time < 0 || time > 2){
            System.out.println("曜日或いは時間帯が間違えた");
        }else {
            if (week == 0){
                System.out.println("休診");
            } else if (week == 1 || week == 4) {
                System.out.println("営業");
            } else if (week == 2) {
                if (time == 0){
                    System.out.println("休診");
                } else if (time == 1) {
                    System.out.println("営業");
                }else {
                    System.out.println("営業");
                }
            } else if (week == 3) {
                if (time == 0){
                    System.out.println("営業");
                } else if (time == 1) {
                    System.out.println("営業");
                }else {
                    System.out.println("休診");
                }
            } else if (week == 5) {
                if (time == 0){
                    System.out.println("休診");
                } else if (time == 1) {
                    System.out.println("営業");
                }else {
                    System.out.println("営業");
                }
            }else{
                if (time == 0){
                    System.out.println("営業");
                } else if (time == 1) {
                    System.out.println("休診");
                }else {
                    System.out.println("休診");
                }
            }
        }
    }
}
