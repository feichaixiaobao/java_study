import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class If05 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入保国同志的信用分：");
        int score = myScanner.nextInt();

        if (score >= 1 && score <= 100) {

        if (score == 100) {
            System.out.println("信用极好");
        } else if (score > 80 && score <=99) {
            System.out.println("信用优秀");
        } else if (score >= 60 && score <= 80) {
            System.out.println("信用一般");
        } else {
            System.out.println("信用不及格");
        }
    } else {
        System.out.println("信用分范围不在1～100之中，请重新输入");
    }

    }
}
