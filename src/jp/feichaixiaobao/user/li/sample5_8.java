package jp.feichaixiaobao.user.li;

import java.util.Scanner;

//練習問題 5 - 8
//        整数を 10 回入力し、小さい順に並べ替えて表示するプログラムを作成しなさい。
public class sample5_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []a = new int[10];
        int temp ;
        for(int i = 0;i < 10;i++){
            System.out.println("第" + (i + 1) + "番目の数を入力してください：" );
            a[i] = sc.nextInt();
        }
        for (int i = 0;i < 10;i++){
            for(int j = i+1;j < 10;j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i :a)
        System.out.println(i);
    }
}
