package jp.feichaixiaobao.user.li;
//練習問題 6 - 4
//        サイズを示す数値（int）を引数とし、何等かの文字で例のような三角形を表示するメソッドを作成しなさい。
//        また、このメソッドを使用してサイズ 3、4、5 の３つの三角形を表示するプログラムを作成しなさい。
//        例：
//        ------------------------------------
//        $
//        $$
//        $$$
//
//        $
//        $$
//        $$$
//        $$$$
//
//        $
//        $$
//        $$$
//        $$$$
//        $$$$$
//        ------------------------------------
public class sample6_4 {
    public static void main(String[] args) {
        print_$(3);
        print_$(4);
        print_$(5);

    }
    static  void  print_$(int size){
        for(int i = 1;i <= size;i++){
            for (int j =1;j <= i;j++){
                System.out.print("$");
            }
            System.out.println();
        }
    }
}
