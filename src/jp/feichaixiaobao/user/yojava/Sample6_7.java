package jp.feichaixiaobao.user.yojava;
/*
 * 練習問題 6 - 7
ある数が素数かどうかを判定するメソッドを作成しなさい。
このメソッドを使用して 10000 以上 10100 未満の素数をすべて表示するプログラムを作成しなさい。
 */
public class Sample6_7 {
	
	public static void main(String[] args) {
		
		for(int i = 10000; i < 10100; i++) {
			
			if(isPrime(i)) {
				
				System.out.println(i + " ");
			}
			
		}
		
	}
	
	public static boolean isPrime(int num) {
		
		if (num <= 3) {
			
			return true;
		}
		for (int i = 2; i <= num / 2; i++) {
		     
			
			if (num % i == 0) {
				
				return false;
		      
			}
		}
		return true;
		
	}
}
