package jp.feichaixiaobao.user.uuwen;

import java.util.Scanner;

/*練習問題 3 - 11
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
public class sample3_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("月を入力してください:");
        int month = scanner.nextInt();

        switch(month){
            case 1 :
                System.out.print("元日、成人の日");
                break;
            case 2 :
                System.out.print("建国記念の日");
                break;
            case 3 :
                System.out.print("春分の日");
                break;
            case 4 :
                System.out.print("昭和の日");
                break;
            case 5 :
                System.out.print("憲法記念日、みどりの日、こどもの日");
                break;
            case 6 :
                
                break;
            case 7 :
                System.out.print("海の日");
                break;
            case 8 :
                
                break;
            case 9 :
                System.out.print("敬老の日、秋分の日");
                break;
            case 10 :
                System.out.print("体育の日");
                break;
            case 11 :
                System.out.print("文化の日、勤労感謝の日");
                break;
            case 12 :
                System.out.print("天皇誕生日");
                break;

        }

    }
}
