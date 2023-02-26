package jp.feichaixiaobao.user.li;

import java.util.Scanner;

//練習問題 4 - 7
//        次のプログラムを作成しなさい。
//        ・巨人、阪神戦で毎回の得点を入力する。（１回～９回）
//        ・入力が終わったら、それぞれの得点とどちらが勝ったかを表示する。
//        ※試合は巨人の先行とする。
//        ------------------------------------
//        1回表、巨人の得点は？ 0
//        1回裏、阪神の得点は？ 0
//        2回表、巨人の得点は？ 0
//        2回裏、阪神の得点は？ 1
//        ：
//        ：
//        ：
//        9回表、巨人の得点は？ 0
//        9回裏、阪神の得点は？ 1
//
//        巨人：5点, 阪神：6点
//        阪神の勝ち
public class sample4_7 {
    public static void main(String[] args) {
        int kyo_p = 0;
        int hann_p = 0;
        Scanner sc =new Scanner(System.in);
        for (int i = 1; i < 10 ; i++){
            System.out.println(i + "回表、巨人の得点は？");
            kyo_p +=sc.nextInt();
            System.out.println(i + "回裏、阪神の得点は？");
            hann_p += sc.nextInt();
        }
        System.out.println("巨人：" + kyo_p + "点, 阪神：" +  hann_p + "点");
        if (kyo_p > hann_p){
            System.out.println("巨人の勝ち");
        } else if (kyo_p < hann_p) {
            System.out.println("阪神の勝ち");
        }else {
            System.out.println("一緒的な実力");
        }
    }
}
