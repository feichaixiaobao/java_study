package jp.feichaixiaobao.user.li;

import java.util.Scanner;

//練習問題 7 - 6
//        前問の CoinCase クラスに、次の内容を追加しなさい。
//        ・総ての硬貨の枚数を取得する、引数なしの GetCount メソッド。
//        ・指定した種類の硬貨の総額を取得する、引数のある GetAmount メソッド。
//
//        修正した CoinCase クラスを使用して次のプログラムを作成しなさい。
//        ・CoinCase クラスのインスタンスを作成する。
//        ・種類と枚数を入力し、AddCoins メソッドで硬貨を追加することを 10 回繰り返す。
//        ・各硬貨が何枚でいくらあるかを表示する。
//        ・硬貨の総枚数を表示する。
//        ・総額を表示する。
class CoinCase_pro{
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
    public void GetCount(){
        System.out.println(price_500 + price_100 + price_50 + price_10 +price_5 + price_1);
    }

    public int GetAmount(){
        return 500 * price_500 + 100 * price_100 + 50 * price_50 + 10 * price_10 + 5 * price_5 + 1 * price_1;
    }
    public int GetAmount(int price){
        return price * GetCount(price);
    }

}

public class sample7_6 {
    public static void main(String[] args) {
        CoinCase_pro my_case = new CoinCase_pro();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "回データを入力してください：");
            my_case.AddCoins(sc.nextInt(), sc.nextInt());
        }
        my_case.GetCount();
        System.out.println(my_case.GetAmount(500));
    }
}
