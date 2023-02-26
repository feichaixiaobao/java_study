package jp.feichaixiaobao.user.li;

import java.util.Scanner;

//練習問題 4 - 11
//        個数を示す数値を入力し、その個数分だけ 0 ～ 9 の数字を表示するプログラムを作成しなさい。数字は 0, 1, 2, 3, , の順に表示し、9 の次は 0 に戻るものとします。
//        例：
//        14
//        01234567890123
public class sample4_11 {
    public static void main(String[] args) {
        System.out.println("個数を示す数値を入力してください");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int i = 0;
        while (num > 0){
            System.out.print(i);
            num--;
            i++;
            if(i > 9){
                i = 0;
            }
        }
    }
}
