/*
 * 斐波那契数是一个数列，该数列的第一项和第二项都为 1，
 * 从第三项开始，每一项都等于前两项之和。即：
   1, 1, 2, 3, 5, 8, 13, 21, 34, 55, …
   这个数列被称为“斐波那契数列”，
   其中每一项的值被称作“斐波那契数”。
   斐波那契数列在计算机科学和其他领域中有广泛应用。
 */
import java.util.Scanner;

public class RecursionExercise01 {
    public static void main(String[] args) {
        Q q1 = new Q();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个正整数n：");
        int n = scanner.nextInt();
        int res = q1.fibonacci(n);
        if (res != -1) { // 如果结果不为 -1，则输出斐波那契数
            System.out.println("当n=" + n + "对应的斐波那契数=" + res);
        }
    }
}

class Q {
    public int fibonacci(int n) {
        if (n <= 0) { // 如果 n 不合法，输出错误信息并返回 -1
            System.out.println("请输入>=1的数字");
            return -1;
        } else if (n == 1 || n ==2) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        } 
    }
}