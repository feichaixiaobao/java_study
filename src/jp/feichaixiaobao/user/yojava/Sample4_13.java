package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * 練習問題 4 - 13
ストライク・カウントを数えるプログラムを作成しなさい。
・１球ごとにストライクかボールかを入力する。
・３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。
※ストライクの場合は1、ボールの場合は2を入力する。
------------------------------------
ストライク=1 or ボール=2 ？
1
ストライク=1 or ボール=2 ？
2
ストライク=1 or ボール=2 ？
1
ストライク=1 or ボール=2 ？
1
1ボール,3ストライク
------------------------------------
 */
public class Sample4_13 {
	
	public static void main(String[] args) {
		
		int strike = 0;
		int ball = 0;
		
		while(strike < 3 && ball < 4) {
			
		Scanner scanner =new Scanner(System.in);
		System.out.print("１球ごとにストライク 1  かボール 2かを入力する");
		int num = scanner.nextInt();
		
			if(num == 1) {
				
				strike ++;
				
			}else if( num == 2) {
				
				ball ++;
			}
//			
		}
		
		System.out.println("strike= " + strike);
		System.out.println("ball= " + ball);
		
	} 
}
