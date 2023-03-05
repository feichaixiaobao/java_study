//原题为：
// 判断一个整数是否是水仙花数，所谓水仙花数是指一个3位数，
// 其各个位上数字立方和等于其本身。
// 例如：153=1*1*1+3*3*3+5*5*5
// 思路分析
// 1.比如intn=153;
// 2.先得到n的百位，十位，
// 各位的数字，使用1f判断他们的立方和是否相等
// 3.n的百位=n/10
// 4.n的十位=n%100
// 5.n的各位=n%10
// 6.判断即可
//
//可以优化的反思：
// 1、用户可以自定义输入整数位数
// 2、用户输入不正确时的判断
// 3、用户输入不正确时可以重新输入
// 4、输出每一位数的数字，比如：该属百位数是，十位数，位数是...
// 5、是否为水仙花数的判断结果最后再加一个是否重新来一遍的功能
// 6、用户在输入几位数的阶段可以中途退出程序
//
// import java.util.Scanner;
// public class NarcissisticNumber {
//     public static void main(String[] args) {
//         System.out.println("请输入一个三位数整数");
//         Scanner myScanner = new Scanner(System.in);
//         int i = myScanner.nextInt();
//         int hundreds = i/100;
//         int ten = i%100/10;
//         int ones = i%10;
//         double sum = 0;
//         while(i < 100 || i > 999){
//             System.out.println("输入不正确，请重新输入");
//             i = myScanner.nextInt();
//         }
//         System.out.println("-----------------------");
//         System.out.println("该整数的百位是" + hundreds + "\n" +"该整数的十位是" + ten + "\n" +"该整数的个位是" + ones); 
//         sum = Math.pow(hundreds, 3) + Math.pow(ten, 3) + Math.pow(ones, 3);
//         if (sum == i) {
//             System.out.println("该整数为水仙花数");
//         }
//         else{
//             System.out.println("该整数不是水仙花数");
//         }
//         System.out.println("-----------------------");

//     }
// }

import java.util.Scanner;

public class NarcissisticNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int digits = 0;
        int number = 0;
        boolean validInput = false;

        // 获取用户输入并判断是否合法
        do {
            System.out.print("请输入一个正整数的位数（输入0退出程序）：");
            if (input.hasNextInt()) {
                digits = input.nextInt();
                if (digits == 0) {
                    System.out.println("程序已退出！");
                    System.exit(0);
                } else if (digits > 0) {
                    validInput = true;
                } else {
                    System.out.println("输入错误，请重新输入！");
                }
            } else {
                System.out.println("输入错误，请重新输入！");
                input.next(); // 清除非法输入
            }
        } while (!validInput);

        validInput = false;

        // 获取用户输入并判断是否合法
        do {
            System.out.print("请输入一个" + digits + "位正整数：（输入0退出程序）");
            if (input.hasNextInt()) {
                number = input.nextInt();
                if (number == 0) {
                    System.out.println("程序已退出！");
                    System.exit(0);
                }
                int temp = number;
                int sum = 0;
                while (temp != 0) {
                    sum++;
                    temp /= 10;
                }
                if (sum == digits) {
                    validInput = true;
                } else {
                    System.out.println("输入错误，请重新输入！");
                }
            } else {
                System.out.println("输入错误，请重新输入！");
                input.next(); // 清除非法输入
            }
        } while (!validInput);

        // 输出每一位数的数字
        int temp = number;
        int[] digitsArray = new int[digits];
        for (int i = digits - 1; i >= 0; i--) {
            digitsArray[i] = temp % 10;
            temp /= 10;
        }
        System.out.println("该数的各位数字为：");
        for (int i = 0; i < digits; i++) {
            System.out.println("第" + (i + 1) + "位数字是：" + digitsArray[i]);
        }

        // 判断是否为水仙花数
        int sum = 0;
        for (int i = 0; i < digits; i++) {
            sum += Math.pow(digitsArray[i], digits);
        }
        if (sum == number) {
            System.out.println(number + "是水仙花数！");
        } else {
            System.out.println(number + "不是水仙花数！");
        }

        // 询问用户是否重新运行程序
        System.out.print("是否重新来一遍？（输入Y或y重新来一遍，其他任意键退出）：");
        String restart = input.next();
        if (restart.equals("Y") || restart.equals("y")) {
            main(args);
        } else {
            System.out.println("程序已退出！");
            System.exit(0);
        }
    }
}

