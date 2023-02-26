package jp.feichaixiaobao.user.li;
//練習問題 6 - 8
//        メソッドを再帰的に呼び出すことによって、フィボナッチ数列の n 番目の項を計算するメソッドを作成しなさい。
//        最初の２つの項、0 番目を 0、1 番目を 1 とします。
//        このメソッドを使用して、11 番目から 20 番目までの項を表示するプログラムを作成しなさい。
//        ※フィボナッチ数列：
//        それぞれの項がその直前の２つの項の和になっている数列のこと。
//        例：0, 1, 1, 2, 3, 5, 8, 13, 21, ...
public class sample6_8 {
    public static void main(String[] args) {
        for(int i = 11;i <= 20;i++){
            System.out.println(febo(i));
        }

    }
    static int febo(int i){
        if(i == 1){
            return 0;
        }
        if(i == 2){
            return 1;
        }
        return  febo(i-1) +febo(i-2);
    }
}
