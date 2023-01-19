package jp.feichaixiaobao.user.li;
import java.util.Scanner;
//練習問題 3 - 8
//        中間試験と、期末試験の点数（それぞれ 0 ～ 100 点）を入力し、次の条件に従って合格、不合格を判定するプログラムを作成しなさい。
//        ・両方とも60 点以上の場合、合格
//        ・合計が130 点以上の場合、合格
//        ・合計が100 点以上で、どちらかの試験が 90 点以上であれば合格
//        ・上記以外は不合格
public class sample3_8 {
    public static void main(String[] args) {
        System.out.println("中間試験の点数を入力してください：");
        Scanner sc = new Scanner(System.in);
        int midp = sc.nextInt();
        System.out.println("期末試験の点数を入力してください：");
        int finp = sc.nextInt();
        if(midp < 0 || midp > 100 || finp < 0 || finp >100){
            System.out.println("点数は0 ～ 100 点、間違えた点数を入力した。");
            System.exit(1);
        }
        else {
            if(midp >= 60 && finp >= 60){
                System.out.println("合格");
            } else if (midp + finp >= 130) {
                System.out.println("合格");
            } else if ((midp + finp >= 100) && (midp >= 90 || finp >= 90)) {
                System.out.println("合格");
            }
            else {
                System.out.println("不合格");
            }
        }
    }
}
