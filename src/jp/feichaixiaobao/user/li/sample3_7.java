package jp.feichaixiaobao.user.li;
import java.util.Scanner;
//練習問題 3 - 7
//        試験の点数を入力し、対応する成績を表示するプログラムを３種類作成しなさい。
//        試験は 100 点満点（ 0 点～ 100 点）とし、点数と成績の対応を以下のようにします。
//        ・ケース1
//        60 点以上：“合格”
//        60 点未満：“不合格”
//        ・ケース2
//        80 点以上：“たいへんよくできました。”
//        60 点以上、80 点未満：“よくできました。”
//        60 点未満：“ざんねんでした。”
//        ・ケース3
//        80 点以上：“優”
//        70 点以上、80 点未満：“良”
//        60 点以上、70 点未満：“可”
//        60 点未満：“不可”
public class sample3_7 {
    public static void main(String[] args) {
        System.out.println("試験の点数を入力してください：");
        Scanner sc = new Scanner(System.in);
        int point =sc.nextInt();
        if(point >100 || point <0){
            System.out.println("入力が間違えた、点数は0 点～ 100 点です。");
            System.exit(1);
        }
        System.out.println("1.ケース1");
        System.out.println("2.ケース２");
        System.out.println("3.ケース3");
        System.out.println("評価ケース番号を選んでください：");
        Scanner sc2 = new Scanner(System.in);
        int  case_select = sc.nextInt();
        switch (case_select){
            case 1:
                if(point >= 60){
                    System.out.println("合格");
                }
                else {
                    System.out.println("不合格");
                }
                break;
            case 2:
                if (point >= 80){
                    System.out.println("たいへんよくできました。");
                } else if (point >=60 && point<80) {
                    System.out.println("よくできました。");
                }
                else {
                    System.out.println("ざんねんでした。");
                }
                break;
            case 3:
                if (point >= 80){
                    System.out.println("優");
                } else if (point > 70) {
                    System.out.println("良");
                } else if (point > 60) {
                    System.out.println("可");
                }
                else {
                    System.out.println("不可");
                }
                break;
            default:
                System.out.println("ケース番号は不存在");
        }
        /*ケース1*/

    }
}
