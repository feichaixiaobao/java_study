package jp.feichaixiaobao.user.li;
import java.util.Scanner;
//練習問題 4 - 20
//        サイズを示す数値を入力し、何等かの文字で例のような三角形を表示するプログラムを作成しなさい。
//        サイズ 4 の例
//        ------------------------------------
//        $
//        $$
//        $$$
//        $$$$
//        ------------------------------------
public class sample4_20 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("サイズを示す数値を入力してください：");
        int num = sc.nextInt();
        for(int i = 1;i <= num ; i++){
            for (int j = 1;j <= i;j++){
                System.out.print("$");
            }
            System.out.println("");
        }
    }
}
