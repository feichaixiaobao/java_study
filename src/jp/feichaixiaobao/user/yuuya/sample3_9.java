package jp.feichaixiaobao.user.yuuya;
/**
 * 曜日と、午前、午後、夜間の区別を入力し、
 * 病院が開いているか、休診であるかを表示するプログラムを作成しなさい。
 */
public class sample3_9 {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("曜日を入力してください");
		System.out.println("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
		int x = s.nextInt();
		
		System.out.println("午前、午後、夜間の区別を入力してください");
		System.out.println("0=午前、1=午後、2=夜間");
		int y = s.nextInt();
		
		if (x == 0) {
			System.out.println("休診");
		} 
		
		if (x == 1 | x == 4) {
			System.out.println("開いている");
		}
		
		if (x == 2 | x == 5) {
			if (y == 0) {
				System.out.println("休診");
			} else {
				System.out.println("開いている");
			}
		}
		
		if (x == 3) {
			if (y == 2) {
				System.out.println("休診");
			} else {
				System.out.println("開いている");
			}
		}
		
		if (x == 6) {
			if (y == 0) {
				System.out.println("開いている");
			} else {
				System.out.println("休診");
			}
		}
	}
}
