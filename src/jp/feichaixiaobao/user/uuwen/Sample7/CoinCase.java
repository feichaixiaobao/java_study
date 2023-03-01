package jp.feichaixiaobao.user.uuwen.Sample7;

/*
 * Sample7_5 ~ 7_6 用のクラス
 */

public class CoinCase {
     //枚数の初期値は０で設定
    private int Yen500 = 0 ;
    private int Yen100 = 0 ;
    private int Yen50 = 0 ;
    private int Yen10 = 0 ;
    private int Yen5 = 0 ;  
    private int Yen1 = 0 ;

    public void AddCoins(int kind, int count)  {
        switch(kind){
            case 500:
                Yen500 += count;
                break;
            case 100:
                Yen100 += count;
                break;
            case 50:
                Yen50 += count;
                break;
            case 10:
                Yen10 += count;
                break;
            case 5:
                Yen5 += count;
                break;
            case 1:
                Yen1 += count;
                break;
        }
    }

    public int GetCount(int kind){
        switch(kind){
            case 500:
                return Yen500;
            case 100:
                return Yen100;
            case 50:
                return Yen50;
            case 10:
                return Yen10;
            case 5:
                return Yen5;
            case 1:
                return Yen1;
        }
        return 0;
    }

    public int GetAmount(int total){
        total = Yen500 * 500 + Yen100 * 100 + Yen50 * 50 + Yen10 * 10 + Yen5 * 5 + Yen1 * 1;
        return total;
    }

    //Sample7_6 START
    public int GetCount2(){
        return Yen500 + Yen100 + Yen50 + Yen10 + Yen5 + Yen1;
    }

    public int GetAmount2( int kind ){
        switch( kind ){
            case 500:
                return Yen500 * 500;
            case 100:
                return Yen100 * 100;
            case 50:
                return Yen50 * 50;
            case 10:
                return Yen10 * 10;
            case 5:
                return Yen5 * 5;
            case 1:
                return Yen1 * 1;
        }
        return 0;
    }
    //Sample7_6 END
}
