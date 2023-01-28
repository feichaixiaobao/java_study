package jp.feichaixiaobao.user.yuuya.sample3;
/**
 * 練習問題 3 - 10
 * 整数値 x, y を入力し、以下の条件に該当する場合、そうであることを示す文を表示しなさい
 */
public class sample3_10 {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("整数値 x, y を入力してください");
		int x = s.nextInt();
		int y = s.nextInt();
		
		if ((x < y) & (x % 2 == 0) & (y % 2 == 0)) {
			System.out.println( "xはyより小さく、かつ、xとyは共に偶数である。" );
		}
		
		if ((x == y) & (x < 0) & (y < 0)) {
			System.out.println( "xとyは等しく、かつ、負の数である。" );
		}
		
		if ((x < y) & (x % 2 == 0)) {
			System.out.println( "xはyより小さい、または、xは偶数である。" );
		}
		
		if ((x < 10 | x > 100) & (y > 10 & y < 100)) {
			System.out.println( "xは10以下または100以上で、かつ、yは10以上かつ100以下である。" );
		}
		
		if ((x < 0) & (y < 0)) {
			System.out.println( "xもyも負の数である" );
		}
		
		if (x > 0 | y > 0) {
			System.out.println( "xもyも負の数ではない" );
		}
	}
}
