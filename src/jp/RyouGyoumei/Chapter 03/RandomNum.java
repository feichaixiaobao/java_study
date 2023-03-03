// public class RandomNum {
//     public static void main(String[] args) {
//         for (int i = 0; i <= 10; i++) {
//             System.out.println(Math.random());
//         }
//     }
// }

//迭代第一遍
// import java.util.Random;

// public class RandomNum {
//     public static void main(String[] args) {
//         Random random = new Random();
//         for (int i = 0; i <= 10; i++) {
//             System.out.println(random.nextInt(100)); // 生成0-99之间的整数
//         }
//     }
// }

//迭代第二遍
// import java.util.Random;
// import java.util.Scanner;

// public class RandomNum {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("请输入整数范围的下限：");
//         int min = scanner.nextInt();
//         System.out.println("请输入整数范围的上限：");
//         int max = scanner.nextInt();

//         Random random = new Random();
//         for (int i = 0; i <= 10; i++) {
//             System.out.println(random.nextInt(max - min + 1) + min);
//         }
//     }
// }

//迭代第三遍
// 增加代码的可玩性和交互性：

// 允许用户选择生成的随机数个数。
// 添加一个菜单，让用户可以选择继续生成随机数，或者退出程序。
// 添加一个判断机制，防止用户输入错误。

// import java.util.Random;
// import java.util.Scanner;

// public class RandomNum {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         Random random = new Random();

//         int min = 0;
//         int max = 0;
//         int count = 0;

//         while (true) {
//             // 显示菜单
//             System.out.println("请选择操作：");
//             System.out.println("1. 生成随机数");
//             System.out.println("2. 退出程序");
//             int choice = scanner.nextInt();

//             if (choice == 1) {
//                 // 读取用户输入的下限和上限
//                 System.out.println("请输入整数范围的下限：");
//                 min = scanner.nextInt();
//                 System.out.println("请输入整数范围的上限：");
//                 max = scanner.nextInt();

//                 // 读取用户输入的随机数个数
//                 System.out.println("请输入要生成的随机数个数：");
//                 count = scanner.nextInt();

//                 // 判断用户输入是否合法
//                 if (min >= max) {
//                     System.out.println("下限必须小于上限，请重新输入。");
//                     continue;
//                 }
//                 if (count <= 0) {
//                     System.out.println("随机数个数必须大于0，请重新输入。");
//                     continue;
//                 }

//                 // 生成随机数
//                 System.out.println("生成的随机数为：");
//                 for (int i = 0; i < count; i++) {
//                     System.out.println(random.nextInt(max - min + 1) + min);
//                 }
//             } else if (choice == 2) {
//                 System.out.println("程序已退出。");
//                 break;
//             } else {
//                 System.out.println("无效的操作，请重新选择。");
//             }
//         }
//     }
// }

//迭代第四遍，实现表格呈现，完善交互
import java.util.Scanner;

public class RandomNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min, max, num;
        boolean isContinue = true;

        while (isContinue) {
            System.out.println("请输入随机数的最小值：");
            min = scanner.nextInt();
            System.out.println("请输入随机数的最大值：");
            max = scanner.nextInt();
            System.out.println("请输入需要生成的随机数个数：");
            num = scanner.nextInt();

            if (max < min) {
                System.out.println("最大值不能小于最小值，请重新输入！");
                continue;
            }

            double[] randoms = new double[num];
            for (int i = 0; i < num; i++) {
                randoms[i] = Math.random() * (max - min + 1) + min;
            }

            System.out.println("随机数表格如下：");
            int count = 0;
            for (int i = 0; i < num; i++) {
                System.out.printf("%.2f\t", randoms[i]);
                count++;
                if (count == 5) {
                    System.out.println();
                    count = 0;
                }
            }
            System.out.println();

            System.out.println("请选择：\n1.继续生成随机数\n2.退出程序");
            int choice = scanner.nextInt();
            while (choice != 1 && choice != 2) {
                System.out.println("输入错误，请重新选择：");
                choice = scanner.nextInt();
            }
            if (choice == 2) {
                isContinue = false;
            }
        }
        System.out.println("程序已退出！");
    }
}
