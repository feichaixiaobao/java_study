package jp.feichaixiaobao.user.yojava;

import java.io.IOException;

/*
 * 練習問題 6 - 4
サイズを示す数値（int）を引数とし、何等かの文字で例のような三角形を表示するメソッドを作成しなさい。
また、このメソッドを使用してサイズ 3、4、5 の３つの三角形を表示するプログラムを作成しなさい。
例：
------------------------------------
$
$$
$$$

$
$$
$$$
$$$$

$
$$
$$$
$$$$
$$$$$
------------------------------------
 */
public class Sample6_4 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		

		for(int i = 3; i <= 5; i ++) {
		
			size(i);
			
			System.out.println();
		}
	}
	
	public static void size(int x) {
		
		for(int i = 0; i < x; i ++) {
			
			for(int j = 0; j <= i;j++) {
				
				System.out.print("$");
				
			}
			
			System.out.println();
		}
	}
	
	/*
	 * static void DrawTriangle( int size )
			{
			    if( size > 1 )
			        DrawTriangle( size - 1 );
			
			    for( int i = 0 ; i < size ; i++ )
			        System.out.print( "$" );
			
			    System.out.println();
			}
	 */
}
