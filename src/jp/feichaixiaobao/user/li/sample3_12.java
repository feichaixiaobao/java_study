package jp.feichaixiaobao.user.li;
import java.util.Scanner;

//練習問題 3 - 12
//        好きな鮨（すし）を選択させ、それに対応したメッセージを表示する、鮨占いプログラムを作成しなさい。
//        ※switch 文を使用する。
//        ※選択は、“1：まぐろ　2：えび　3：こはだ．．．”のようなガイドを表示し数字で入力させる。
//        ※題材は鮨でなくても良い。
public class sample3_12 {
    public static void main(String[] args) {
        System.out.println("welcome 鮨占い");
        System.out.println("1：まぐろ　2：えび　3：こはだ 4：サーモン　５：鯛");
        System.out.println("寿司名を選んでください：");
        Scanner sc =new Scanner(System.in);
        int number =sc.nextInt();
        switch (number){
            case 1:
                System.out.println("大凶");
                break;
            case 2:
                System.out.println("凶");
                break;
            case 3:
                System.out.println("大吉");
                break;
            case 4:
                System.out.println("吉");
                break;
            case 5:
                System.out.println("平");
                break;
        }
    }
}
