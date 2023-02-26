package jp.feichaixiaobao.user.li;

import java.util.Scanner;

//練習問題 4 - 6
//        整数、0 か 1 を 10 回入力する。これを対戦成績と考え、0 を負け、1 を勝ちとして、勝ちの総数、負けの総数を表示するプログラムを作成しなさい。
public class sample4_6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int count_0 =0;
        int count_1 =0;
        for(int i = 0;i < 10;i++) {
            System.out.println("第" + (i + 1) + "個数を入力してください：");
            int value = sc.nextInt();
            if(value == 0){
                count_0++;
            }else {
                count_1++;
            }
        }
        System.out.println("勝ちの総数:" + count_1 +"、負けの総数:" + count_0);
    }
}
