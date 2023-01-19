package jp.feichaixiaobao.user.li;
//練習問題 1 - 11
//int 型の変数 x に任意の数値を代入し、x を x より小さい任意の数値で割った商と余りを表示するプログラムを作成しなさい。
import java.util.Scanner;
public class sample1_11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ｘの値を入力してください。");
        int x=sc.nextInt();
        for(int i = x-1;i>0;i--){
            System.out.println("xを"+i+"で割った商=" + x / i+",余り=" + x % i);
        }
    }
}
