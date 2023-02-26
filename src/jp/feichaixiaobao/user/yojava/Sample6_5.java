package jp.feichaixiaobao.user.yojava;
/*
 * 練習問題 6 - 5
サイズを示す数値と、表示する文字を引数とし、三角形を表示するメソッドを作成しなさい。
このメソッドを使用して、サイズと文字の異なる３つの三角形を表示しなさい。
※サイズを示す引数は int 型、表示する文字の引数は char 型にする。
 */
public class Sample6_5 {
	
	public static void main(String[] args) {
		tri(3,'%');
		System.out.println();
		
		tri(5,'&');
		System.out.println();
		
		tri(9,'#');
		
		
	}
	
	public static void tri(int n, char a) {
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print(a);
			}
			
			System.out.println();
		}
		
	}
	
}
