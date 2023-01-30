package jp.feichaixiaobao.user.uuwen;

import java.util.Scanner;

/*練習問題 3 - 12
好きな鮨（すし）を選択させ、それに対応したメッセージを表示する、鮨占いプログラムを作成しなさい。
※switch 文を使用する。
※選択は、“1：まぐろ　2：えび　3：こはだ．．．”のようなガイドを表示し数字で入力させる。
※題材は鮨でなくても良い。
 */

public class sample3_12 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println( "【お好きな寿司を選んでください】" );
        System.out.print( "1:まぐろ 2:えび 3:こはだ 4:あなご 5:いくら : " );

        int sushi = scanner.nextInt();

        switch(sushi){
            case 1:
                System.out.println( "何か良いことがあります。" );
                break;
            case 2:
                System.out.println( "驚くほど良いことがあります。" );
                break;
            case 3:
                System.out.println( "ちょっと良いことがあります。" );
                break;
            case 4:
                System.out.println( "とても良いことがあります。" );
                break;
            case 5:
                System.out.println( "そこそこ良いことがあります。" );
                break;
        }
    }
}
