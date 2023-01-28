package jp.feichaixiaobao.user.yuuya.sample4;

/**
 * ・巨人、阪神戦で毎回の得点を入力する。（１回～９回）
 * ・入力が終わったら、それぞれの得点とどちらが勝ったかを表示する。
 * ※試合は巨人の先行とする。
 */
public class sample4_7 {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("巨人、阪神戦で毎回の得点を入力する。（１回～９回）");
		
		// xを巨人の得点、ｙを阪神の得点とする
		int x = 0;
		int y = 0;
		
		for (int i = 1; i <= 9; i++) {
			System.out.print(i + "回表、巨人の得点は？ ");
			int a = s.nextInt();
			System.out.print(i + "回裏、阪神の得点は？ ");
			int b = s.nextInt();
			
			x += a;
			y += b;
		}
		
		System.out.println("巨人：" + x + "点, 阪神：" + y + "点");
		if (x > y) {
			System.out.println("巨人の勝ち");
		} else if (x < y) {
			System.out.println("阪神の勝ち");
		} else {
			System.out.println("引き分け");
		}
	}
}
