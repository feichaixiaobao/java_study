package jp.feichaixiaobao.user.kachi.test3;

import java.util.Scanner;

public class Sample3_9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("曜日の入力してください(0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜):");
		int day = s.nextInt();
		System.out.print("午前、午後、夜間の入力の入力してください(0=午前、1=午後、2=夜間):");
		int time = s.nextInt();
		if(day == 0) {
			System.out.println("休診");
		}else if(day == 1) {
			System.out.println("○");
		}else if(day == 2) {
			if(time == 0) {
				System.out.println("休診");
			}else {
				System.out.println("○");
			}
		}else if(day == 3) {
			if(time == 2) {
				System.out.println("休診");
			}else {
				System.out.println("○");
			}
		}else if(day == 4) {
			System.out.println("○");
		}else if(day == 5) {
			if(time == 0) {
				System.out.println("休診");
			}else {
				System.out.println("○");
			}
		}else if(day == 6) {
			if(time == 0) {
				System.out.println("○");
			}else {
				System.out.println("休診");
			}
		}
	}

}
