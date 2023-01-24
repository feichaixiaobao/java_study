
/*
練習問題 2 - 4
int 型の変数 x、y にそれぞれ数値を入力し、
x と y の和、差（x－y）、積、商と余り(x÷y)、を表示するプログラムを作成しなさい。
*/

package jp.feichaixiaobao.user.vina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample2_4 {
    public static void main(String[] args) throws IOException {
        System.out.println("int 型の変数 x、y にそれぞれ数値を入力してください");
        BufferedReader bufferInt = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufferInt.readLine());
        int y = Integer.parseInt(bufferInt.readLine());
        System.out.println("x と y の和:" + ( x + y ));
        System.out.println("x と y の差:" + ( x - y ));
        System.out.println("x と y の積:" + ( x * y ));
        System.out.println("x と y の商:" + ( x / y ));
        System.out.println("x と y の余り:" + ( x % y ));
    }
}

