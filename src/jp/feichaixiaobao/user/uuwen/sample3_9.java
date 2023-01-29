package jp.feichaixiaobao.user.uuwen;

import java.util.Scanner;

/*
練習問題 3 - 9
曜日と、午前、午後、夜間の区別を入力し、病院が開いているか、休診であるかを表示するプログラムを作成しなさい。
・開いているか、休診であるかは、次の表に従います。
--------------------------------------------------------
        日曜	月曜	火曜	水曜	木曜	金曜	土曜
--------------------------------------------------------
午前	休診      ○	    休診     ○	    ○	  休診	   ○
--------------------------------------------------------
午後	休診	  ○	     ○	    ○	   ○	   ○	 休診
--------------------------------------------------------
夜間	休診	  ○	     ○	  休診	    ○	   ○	  休診
--------------------------------------------------------

※曜日の入力、午前、午後の入力は、次のようなガイドを表示して数値で行います。
--------------------------------------------------------
>0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜
>0=午前、1=午後、2=夜間
--------------------------------------------------------
 */

public class sample3_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("曜日を入力(0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜):");
        int x = scanner.nextInt();
        if(x < 0 || x > 6){
            System.out.println("正しい数値を入力してください");
            return;
        }

        System.out.print("午前、午後を入力(0=午前、1=午後、2=夜間):");
        int y = scanner.nextInt();
        if(y < 0 || y > 2){
            System.out.println("正しい数値を入力してください");
            return;
        }

        boolean isClosed = true;
        if ((x == 1 && y == 0 && y == 1 && y == 2) || 
            (x == 2 && y == 1 && y ==2 ) || 
            (x == 3 && y == 0 && y == 1) || 
            (x == 4 && y == 0 && y == 1 && y == 2) ||
            (x == 5 && y == 1 && y ==2 ) ||
            (x == 6 && y == 0 )
        ){
            isClosed = false;
        }

        if(isClosed){
            System.out.println("休診");
        }else{
            System.out.println("開いている");
        }
    }
}
