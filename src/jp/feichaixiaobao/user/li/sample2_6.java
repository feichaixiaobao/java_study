package jp.feichaixiaobao.user.li;
//練習問題 2 - 6
//年齢を訊ね、生まれてから現在までの、おおよその日数を表示するプログラムを作成しなさい。
// ※日数の計算は閏年等を考慮せず、年齢×365とする。
import java.util.Scanner;
public class sample2_6 {
    public static void main(String[] args) {
        System.out.println("君の年齢を教えてください：");
        Scanner sc = new Scanner(System.in);
        System.out.println("生きていた日数：" + (365 * sc.nextInt()));
    }
}
