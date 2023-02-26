package jp.feichaixiaobao.user.li;

import java.util.Scanner;

//2つの整数の大きい方を選ぶメソッドを作成しなさい。２つの int 型引数を取り、大きい方の数値を戻り値として返すこと。
//        また、このメソッドを使用して、int 型の変数 x、y、z にそれぞれ数値を入力し、最も大きい数値を表示するプログラムを作成しなさい。
public class sample6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("xを入力してください：");
        int x = sc.nextInt();
        System.out.print("xを入力してください：");
        int y = sc.nextInt();
        System.out.print("xを入力してください：");
        int z = sc.nextInt();

        System.out.println(maxvalue(x,y) > maxvalue(x,z) ? maxvalue(x,y): maxvalue(x,z));
    }
    static int maxvalue(int x,int y){
        return x > y ? x:y;
    }
}
