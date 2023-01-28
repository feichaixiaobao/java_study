package jp.feichaixiaobao.user.yuuya.sample4;

import java.util.Random;

//整数を 10 回入力し、平均値を求めるプログラムを作成しなさい。
// ※計算は整数で行い、小数点以下は切り捨ててよい。

public class sample4_5 {
	public static void main(String[] args) {
		Random random = new Random();
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			int num = random.nextInt(100);
			System.out.print(num + "  ");
			sum += num;
		}
		System.out.println('\n' + "平均値 = " + (sum / 10));
	}
}
