package jp.feichaixiaobao.user.yuuya;
/**
 * 練習問題 3 - 12
 * 好きな鮨（すし）を選択させ、それに対応したメッセージを表示する、鮨占いプログラムを作成しなさい。
 */
public class sample3_12 {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("好きな鮨を選んでください");
		System.out.println("1：まぐろ　2：えび　3：こはだ");
		int x = s.nextInt();
		
		switch(x) {
		case 1:
			System.out.println("^_^");
			break;
		case 2:
			System.out.println(":)");
			break;
		case 3:
			System.out.println("TT");
			break;
		
		}
	}
}
