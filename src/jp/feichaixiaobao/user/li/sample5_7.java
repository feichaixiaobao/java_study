package jp.feichaixiaobao.user.li;
//練習問題 5 - 7
//        1 桁の数値（ 1 ～ 9 に限定）を２つ入力し、その積を表示するプログラムを作成しなさい。ただし、九九の計算結果が入った配列を予め作成して利用すること。（前問を参考に）

import java.util.Scanner;

public class sample5_7 {
    public static void main(String[] args) {

        int kuku[][] = new int[9][9];
        for(int i = 0;i < 9 ;i++){
            for (int j = 0;j < 9 ;j++){
                kuku[i][j] = (i + 1) * (j + 1);
            }
        }
        Scanner sc =new Scanner(System.in);
        System.out.println("第１番目の数値を入力してください：");
        int  a = sc.nextInt();
        System.out.println("第2番目の数値を入力してください：");
        int  b = sc.nextInt();
        System.out.println(kuku[a-1][b-1]);
    }
}
