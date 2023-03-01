package jp.feichaixiaobao.user.uuwen.Sample6;

/*ある数が素数かどうかを判定するメソッドを作成しなさい。
このメソッドを使用して 10000 以上 10100 未満の素数をすべて表示するプログラムを作成しなさい。 */
public class Sample6_7 {
    public static void main(String[] args) {
        for( int n = 10000 ; n < 10100 ; n++ ){
            if(isPrime(n)){
                System.out.println(n);
            }
        }
        
    }

    static boolean isPrime(int value ) {
        if (value < 2) {
            //System.out.println(value + "は素数ではありません。");
            return false;
        }

        for(int i = 2 ; i < value ; i++){
            if(value % i == 0){
                //System.out.println(value + "は素数ではありません。");
                return false;
            }
        }
        //System.out.println(value + "は素数です。");
        return true;
    }
}
