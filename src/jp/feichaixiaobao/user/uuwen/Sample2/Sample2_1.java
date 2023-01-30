package jp.feichaixiaobao.user.uuwen.Sample2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 練習問題 2 - 1
 * String 型の変数 s に文字列を入力し、s の値を表示するプログラムを作成しなさい。
 */

public class Sample2_1 {

	public static void main(String[] args) throws IOException {
		 /*BufferedReaderクラス */
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );// System.in -> キーボード入力を受け付けるための引数
        System.out.print("入力:");
        
        String str = br.readLine();// キーボード入力を受け付ける
        //数値ならInteger.parseInt(br.readLine())を使う

        System.out.println("受け付ける文字: " + str);

        /*Scannerクラス (数値も直接受け取れる)*/
        /* 
        Scanner scanner = new Scanner(System.in);// System.in -> キーボード入力を受け付けるための引数
        System.out.print("名前を入力してください：");
        
        String name = scanner.next();// キーボード入力を受け付ける
        System.out.println("こんにちは、" + name + "さん");
        */

	}

}
