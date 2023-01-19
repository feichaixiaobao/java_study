package jp.feichaixiaobao.user.li;
import java.util.Scanner;
//練習問題 3 - 6
//整数値を入力し、以下の４つの分類から該当するものを表示するプログラムを作成しなさい。
//“正の偶数”、“正の奇数”、“負の偶数”、“負の奇数”
//※負の数であっても、2 で割り切れれば偶数、そうでなければ奇数とする。
//※0 は“正の偶数”であるとする。
public class sample3_6 {
    public static void main(String[] args) {
        System.out.println("整数値を入力してください：");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x >= 0 ){
            if (x % 2 == 0){
                System.out.println("入力する値が正の偶数");
            }
            else {
                System.out.println("入力する値が正の奇数");
            }
        }
        else {
            if (x % 2 == 0){
                System.out.println("入力する値が負の偶数");
            }
            else {
                System.out.println("入力する値が負の奇数");
            }
        }
    }
}
