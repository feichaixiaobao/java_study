
/*
練習問題 3 - 9
曜日と、午前、午後、夜間の区別を入力し、病院が開いているか、休診であるかを表示するプログラムを作成しなさい。
・開いているか、休診であるかは、次の表に従います。
--------------------------------------------------
      日曜	月曜	火曜	水曜	木曜	金曜	土曜
--------------------------------------------------
午前	休診  ○	    休診   ○	   ○	  休診	 ○
--------------------------------------------------
午後	休診	○	     ○	   ○	   ○	   ○	  休診
--------------------------------------------------
夜間	休診	○	     ○	  休診	 ○	   ○	  休診
--------------------------------------------------

※曜日の入力、午前、午後の入力は、次のようなガイドを表示して数値で行います。
--------------------------------------------------
>0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜
>0=午前、1=午後、2=夜間
--------------------------------------------------
*/

package jp.feichaixiaobao.user.vina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample3_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferInt = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("曜日を選択してください（0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜）:");
        int day = Integer.parseInt(bufferInt.readLine());
        System.out.println("午前、午後、夜間を選択してください（0=午前、1=午後、2=夜間）:");
        int time = Integer.parseInt(bufferInt.readLine());

        //假定为真-判断假的情况-假的情况较少
        boolean opeaning = true;

        if ( day == 0 )
            opeaning = false;
        else if ( time == 0 && ( day == 2 || day == 5 ) )
            opeaning = false;
        else if ( time == 1 && day == 6 )
            opeaning = false;
        else if ( time == 2 && ( day == 3 || day == 6 ) )
            opeaning = false;

        if ( opeaning )
            System.out.println("病院が開いている");
        else
            System.out.println("病院が休診である");
    }
}



