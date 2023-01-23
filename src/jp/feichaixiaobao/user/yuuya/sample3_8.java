package jp.feichaixiaobao.user.yuuya;
/**
 * 練習問題 3 - 8
 * 中間試験と、期末試験の点数（それぞれ 0 ～ 100 点）を入力し、
 * 次の条件に従って合格、不合格を判定するプログラムを作成しなさい。
 */
public class sample3_8 {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("中間試験の点数を入力してください:");
		int x = s.nextInt();
		System.out.print("期末試験の点数を入力してください:");
		int y = s.nextInt();
		
		//試験は 100 点満点（ 0 点～ 100 点）
		if ((x >= 0 & x <= 100) & (y >= 0 & y <= 100)) {
			
			//両方とも60 点以上の場合、合格
			//合計が130 点以上の場合、合格
			//合計が100 点以上で、どちらかの試験が 90 点以上であれば合格
			//上記以外は不合格
			if (x >= 60 & y >= 60) {
				System.out.println("合格");
			} else if ((x + y) >= 130) {
				System.out.println("合格");
			} else if (((x + y) >= 100) & (x >= 90 | y >= 90)) {
				System.out.println("合格");
			} else {
				System.out.println("不合格");
			}
			
		} else {
			System.out.println("入力した点数はそれぞれ　0 点～ 100 点　です。");
		}
	}

}
