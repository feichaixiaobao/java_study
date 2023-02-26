package jp.feichaixiaobao.user.li;
//練習問題 4 - 22
//        フィボナッチ数列を表示するプログラムを作成しなさい。
//        最初の２つの項を 0、1 とし、1000 まで（ 1000 以下の項）を表示するものとします。
//
//        ※フィボナッチ数列：
//        それぞれの項がその直前の 2 つの項の和になっている数列のこと。
//        例：0, 1, 1, 2, 3, 5, 8, 13, 21, ...
public class sample4_22 {
    public static void main(String[] args) {
        int a1 = 0;
        int a2 = 1;
        int a3 = a1 + a2;
        while(a1 < 1000){
            System.out.print( a1 + "," );
            a1 = a2;
            a2 = a3;
            a3 = a1 +a2;
        }
    }
}



