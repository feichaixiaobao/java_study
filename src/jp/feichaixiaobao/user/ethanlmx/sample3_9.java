package jp.feichaixiaobao.user.ethanlmx;

import java.util.Scanner;

public class sample3_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("曜日を選択してください");
		System.out.println("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
		int day = sc.nextInt();
		System.out.println("");
		System.out.println("時間を選択してください");
		System.out.println("0=午前、1=午後、2=夜間");
		int time = sc.nextInt();
		System.out.println("");
		if (day == 0)
			System.out.println("休診です。");
		else if (time == 0 && (day == 0 || day == 2 || day == 5))
			System.out.println("休診です。");
		else if (time == 1 && (day == 0 || day == 6))
			System.out.println("休診です。");
		else if (time == 0 && (day == 3 || day == 6))
			System.out.println("休診です。");
		else {
			System.out.println("診療しています。");
		}

	}
}
