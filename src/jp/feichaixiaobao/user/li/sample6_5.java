package jp.feichaixiaobao.user.li;
//練習問題 6 - 5
//        サイズを示す数値と、表示する文字を引数とし、三角形を表示するメソッドを作成しなさい。
//        このメソッドを使用して、サイズと文字の異なる３つの三角形を表示しなさい。
//        ※サイズを示す引数は int 型、表示する文字の引数は char 型にする。
public class sample6_5 {
    public static void main(String[] args) {
        print_$(3,'#');
        print_$(4,'#');
        print_$(5,'#');

    }
    static  void  print_$(int size,char word){
        for(int i = 1;i <= size;i++){
            for (int j =1;j <= i;j++){
                System.out.print(word);
            }
            System.out.println();
        }
    }
}
