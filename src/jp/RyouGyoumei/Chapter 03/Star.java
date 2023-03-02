// import java.util.Scanner;
// public class Star {
//     public static void main(String[] args) {
//         Scanner myScanner = new Scanner(System.in);
//         System.out.println("请输入金字塔的高度：");
//         int totalLevel = myScanner.nextInt();
//         for (int i = 1; i <= totalLevel; i++) {
//             for (int k = 1; k <= totalLevel-i; k++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= 2 * i -1; j++) {
//                 if (j == 1 || j == 2 * i -1 || i == totalLevel) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println("");
//         }
//     }
// }

// import java.util.Scanner;

// public class Star {
//     public static void main(String[] args) {
//         // 创建Scanner对象，用于读取用户输入
//         Scanner myScanner = new Scanner(System.in);
        
//         // 提示用户输入金字塔的高度
//         System.out.println("请输入金字塔的高度：");
        
//         // 读取用户输入的整数
//         int totalLevel = 0;
//         try {
//             totalLevel = myScanner.nextInt();
//         } catch (Exception e) {
//             System.out.println("输入无效，请输入一个整数。");
//             return;
//         }
        
//         // 输出金字塔形状
//         for (int i = 1; i <= totalLevel; i++) {
//             // 输出每一行前面的空格
//             for (int k = 1; k <= totalLevel - i; k++) {
//                 System.out.print(" ");
//             }
            
//             // 输出每一行的星号
//             for (int j = 1; j <= 2 * i - 1; j++) {
//                 if (j == 1 || j == 2 * i - 1 || i == totalLevel) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println("");
//         }
//     }
// }

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("请输入金字塔的高度：");
            int totalLevel = myScanner.nextInt();

            // 输出金字塔形状
            for (int i = 1; i <= totalLevel; i++) {
                // 输出每一行前面的空格
                for (int k = 1; k <= totalLevel - i; k++) {
                    System.out.print(" ");
                }

                // 输出每一行的星号
                for (int j = 1; j <= 2 * i - 1; j++) {
                    if (j == 1 || j == 2 * i - 1 || i == totalLevel) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }

            // 询问用户是否要再次尝试
            System.out.println("是否要再玩一次？(Y/N)");
            String choice = myScanner.next();
            playAgain = choice.equalsIgnoreCase("Y");
        }
         // 输出游戏结束信息
         System.out.println("游戏结束。");
    }
}
