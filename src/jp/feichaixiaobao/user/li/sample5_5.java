package jp.feichaixiaobao.user.li;

import java.util.Scanner;

//練習問題 5 - 5
//        次のコードに追加し、入力された数値を 16 桁の２進数で表示するプログラムを完成させなさい。
//        ------------------------------------
//        BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
//        int value = Integer.parseInt( br.readLine() );
//
//        int binary[] = new int[16];
//
//// 配列 binaryに0か1を代入する
//
//        for( int i = 0 ; i < 16 ; i++ )
//        System.out.print( binary[i] );
//        ------------------------------------
public class sample5_5 {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("数値を入力してください：");
    int value = sc.nextInt();
    int binary[] = new int[16];
    int index =15;
    while(value / 2 != 0){
        binary[index] = value % 2;
        value /=2;
        index--;
    }
        binary[index] = value % 2;
    for(int a:binary){
        System.out.print(a);
    }
    }
}
