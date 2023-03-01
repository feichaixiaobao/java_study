import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class DoWhileExercise01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        char answer = ' ';
        do {
            System.out.println("老韩使出五连鞭");
            System.out.println("老韩问：还钱吗？Y/N");
            answer = myScanner.next().charAt(0);
            System.out.println("他的回答是" + answer);
        } while (answer != 'Y');
    }
}
