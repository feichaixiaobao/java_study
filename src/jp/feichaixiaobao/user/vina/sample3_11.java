
/*
練習問題 3 - 11
月を表す数値を入力し、その月の初めから年末までにある祝日を表示するプログラムを作成しなさい。
表示する祝日は以下の日とします。
・１月：元日、成人の日
・２月：建国記念の日
・３月：春分の日
・４月：昭和の日
・５月：憲法記念日、みどりの日、こどもの日
・７月：海の日
・９月：敬老の日、秋分の日
・１０月：体育の日
・１１月：文化の日、勤労感謝の日
・１２月：天皇誕生日
※switch 文を使用すること。
*/

package jp.feichaixiaobao.user.vina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample3_11 {
    public static void main(String[] args) throws IOException {
        System.out.println("月を入力してください：");
        BufferedReader bufferMonth = new BufferedReader(new InputStreamReader(System.in));
        int month = Integer.parseInt(bufferMonth.readLine());
        switch( month )
        {
            case 1:
                System.out.println("元日" );
                System.out.println("成人の日");
            case 2:
                System.out.println("建国記念の日");
            case 3:
                System.out.println("春分の日");
            case 4:
                System.out.println("昭和の日");
            case 5:
                System.out.println("憲法記念日");
                System.out.println("みどりの日");
                System.out.println("こどもの日");
            case 6:
                System.out.print("祝日がない");
            case 7:
                System.out.println("海の日");
            case 8:
                System.out.print("祝日がない");
            case 9:
                System.out.println("敬老の日");
                System.out.println("秋分の日");
            case 10:
                System.out.println("体育の日");
            case 11:
                System.out.println("文化の日" );
                System.out.println("勤労感謝の日");
            case 12:
                System.out.println("天皇誕生日");
        }
    }
}



