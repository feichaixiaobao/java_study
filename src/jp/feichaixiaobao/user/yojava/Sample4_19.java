package jp.feichaixiaobao.user.yojava;

import java.util.Scanner;

/*
 * 数値を繰り返して入力し、0 が入力されたら入力を止め、平均値を表示するプログラムを作成しなさい。
※最後に入力された 0 は平均に含めない。
※少なくとも 1 回は入力が行われるものとする。（最初に 0 を入力してはいけない）
 */
public class Sample4_19 {
	
		public static void main(String[] args) {
				
				double num = 0;
				double total= 0;
				int count = 0;
				
				while(true) {
					
					Scanner scanner = new Scanner(System.in);
					
					System.out.println("数値を入力してください。");
					
						num = scanner.nextDouble();
						
						if(num == 0) {
						
							break;
							
						}
					
					count = count + 1;
					
					total = total + num;
					
				
				}
				
				System.out.println("total=" + total);
				System.out.println("average=" + total/count);
			}

}
