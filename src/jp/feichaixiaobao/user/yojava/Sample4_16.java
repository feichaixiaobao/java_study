package jp.feichaixiaobao.user.yojava;


import java.util.Scanner;

/*
 * 練習問題 4 - 16
2 以上の数値を入力し、素因数分解した結果を表示しなさい。
 */
public class Sample4_16 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("2以上の数値を入力してください。");
		
		int num = scanner.nextInt();
		
		for(int i = 2; i < num; i ++) {
			
			while( num % i == 0) {
				
				System.out.print(i + " ");
				
				//num = num / i;
				num /= i;
			}
		}
		
	}

}
