package jp.feichaixiaobao.user.li;

import java.util.Scanner;

//練習問題 7 - 5
//        硬貨の入れ物のようなクラス、CoinCase を作成しなさい。
//        ・500 円、100 円、50 円、10 円、5 円、1 円が、それぞれ何枚あるかを管理する。
//        ・AddCoins メソッドで硬貨を追加する。
//        ・引数は硬貨の種類（ int ）と枚数（ int ）。
//        ・GetCount メソッドで、指定した硬貨が、何枚あるかを取得する。
//        ・引数は硬貨の種類（ int ）、戻り値は枚数（ int ）。
//        ・GetAmount メソッドで硬貨の総額を取得する。
//        ・戻り値は硬貨の総額( int )。
//
//        CoinCase クラスを使用して次のプログラムを作成しなさい。
//        ・CoinCase クラスのインスタンスを作成する。
//        ・種類と枚数を入力し、AddCoins メソッドで硬貨を追加することを 10 回繰り返す。
//        ・各硬貨が何枚あるかを表示する。
//        ・総額を表示する。
//        ※硬貨の種類は 500 円なら整数の 500、100 円なら 100 とし、該当しない数が指定された場合には無視する。
class CoinCase{
    private int price_500 = 0;
    private int price_100 = 0;
    private int price_50 = 0;
    private int price_10 = 0;
    private int price_5 = 0;
    private int price_1 = 0;

    public void AddCoins(int price,int coins_count){
        switch (price){
            case 500 : price_500 += coins_count;break;
            case 100 : price_100 += coins_count;break;
            case 50 : price_50 += coins_count;break;
            case 10 : price_10 += coins_count;break;
            case 5: price_5 += coins_count;break;
            case 1 : price_1 += coins_count;break;
        }
    }

    public int GetCount(int price){
        switch (price){
            case 500 : return price_500;
            case 100 : return price_100;
            case 50 : return price_50;
            case 10 : return  price_10;
            case 5: return price_5;
            case 1 : return price_1;
            default: return  0;
        }
    }
    public int GetAmount(){
        return 500 * price_500 + 100 * price_100 + 50 * price_50 + 10 * price_10 + 5 * price_5 + 1 *price_1;
    }
}
public class sample7_5 {
    public static void main(String[] args) {
        CoinCase mycase = new CoinCase();
        Scanner sc =new Scanner(System.in);
        for(int i = 0;i < 10;i++){
            System.out.print((i+1) + "回データを入力してください：");
            mycase.AddCoins(sc.nextInt(), sc.nextInt());
        }
        System.out.println(mycase.GetCount(500));
        System.out.println(mycase.GetCount(100));
        System.out.println(mycase.GetCount(50));
        System.out.println(mycase.GetCount(10));
        System.out.println(mycase.GetCount(5));
        System.out.println(mycase.GetCount(1));

        System.out.println(mycase.GetAmount());

    }
}
