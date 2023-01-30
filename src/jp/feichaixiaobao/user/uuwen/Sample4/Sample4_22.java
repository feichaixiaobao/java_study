package jp.feichaixiaobao.user.uuwen.Sample4;

/*
練習問題 4 - 22
フィボナッチ数列を表示するプログラムを作成しなさい。
最初の２つの項を 0、1 とし、1000 まで（ 1000 以下の項）を表示するものとします。

※フィボナッチ数列：
それぞれの項がその直前の 2 つの項の和になっている数列のこと。
例：0, 1, 1, 2, 3, 5, 8, 13, 21, ...
 */
public class Sample4_22 {
    public static void main(String[] args) {
        int n = 0 ;
        int n1 = 1;
        
        for(int i = 1 ; i <= 10 ; i++){
			int n2 = n + n1;
			System.out.print(n + " ");
			n=n1;
			n1=n2;
		}
    }
}

