// import java.util.Scanner;;
// public class Array02 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         double[] scores = new double[5];
//         for (int  i = 0; i < scores.length; i++) {
//             scores[i] = input.nextDouble();
//         }
//         for (int i = 0; i < scores.length; i++) {
//             System.out.println(scores[i]);
//         }
//     }
// }
import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 5; // 数组大小
        double[] scores = new double[size];
        for (int i = 0; i < size; i++) {
            scores[i] = input.nextDouble();
        }
        for (double score : scores) { // 使用增强型 for 循环来遍历数组
            System.out.println(score);
        }
    }
}
