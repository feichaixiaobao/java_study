package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * 練習問題 4 - 14
前の問題に次の修正を加えなさい。
・１球ごとにストライク、ボール、ファウルの何れかを入力する。（残念ながらヒットにはなりません）
・ファウルの場合、２ストライクまではストライクにカウントするが、３ストライクにはならない。
・３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。
 */
public class Sample4_14 {

	public static void main(String[] args) {
			
			int strike = 0;
			int ball = 0;
			
			while(strike < 3 && ball < 4) {
				
			Scanner scanner =new Scanner(System.in);
			System.out.print("１球ごとにストライク 1  かボール 2か ファウル 3を入力する");
			int num = scanner.nextInt();
			
				if(num == 1) {
					
					strike ++;
					
				}else if( num == 2) {
					
					ball ++;
					
				}else if(num == 3 && strike < 2) {
					
					strike ++;
				}
			
			}
			
			System.out.println("strike= " + strike);
			System.out.println("ball= " + ball);
			
		} 
}
