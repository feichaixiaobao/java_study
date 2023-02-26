package jp.feichaixiaobao.user.li;
//練習問題 6 - 6
//        九九のひとつの段を表示するメソッドを作成しなさい。何の段（ 1 ～ 9 ）であるかを引数とします。
//        このメソッドを使用して、九九表を作成しなさい。

public class sample6_6 {
    public static void main(String[] args) {
        for (int i = 1;i < 10;i++){
            print_1(i);
            System.out.println();
        }
    }
    static void  print_1(int line){
        for(int i = 1;i <= line;i++){
            System.out.printf(line + "*" + i + "=" +line * i +" ");
        }
    }
}
