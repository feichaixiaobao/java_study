package jp.feichaixiaobao.user.uuwen.Sample5;
import java.util.Scanner;

/*練習問題 5 - 2
次のプログラムを作成しなさい。
・10 個の数値を入力する。
・入力された順番と逆の順番で 10 個の数値を表示する。
 */

public class Sample5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("数値を 10 回入力する。");
        int num[] = new int[10];

        for(int i = 0 ; i < 10 ; i ++){
            System.out.print("数値を入力してください： ");
            num[i] = sc.nextInt();
        }
        //System.out.println("配列num[]= " + Arrays.toString(num));
        
        System.out.print("順番: ");
        for(int x : num ){
            System.out.print(x + " ");
        }

        System.out.println();

        System.out.print ("逆番: ");
        for(int j = 9 ; j >= 0 ; j -- ){
            System.out.print (num[j] + " ");
        }
        
    }
}
