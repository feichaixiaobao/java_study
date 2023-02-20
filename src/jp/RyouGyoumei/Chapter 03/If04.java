import java.util.Scanner;
public class If04 {
    public static void main(String[] args) {
        double a = 10.0;
        double b = 20.0;

        if (a > 10.0 && b <20.0) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }

        int num1 = 10;
        int num2 = 20;

        if (num1 % 3 == 0 && num2 % 5 == 0) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Input the number of year");

        int year = myScanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0)|| year % 400 != 0)  {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
    }
}