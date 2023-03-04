// import java.util.Scanner;
// public class Homework01 {
//     public static void main(String[] args) {
//         boolean playAgain = true;
//         while (playAgain) {
//         Scanner myScanner = new Scanner(System.in);
//         System.out.println("输入一个整数");
//         int i = myScanner.nextInt();
//         if (i < 0) {
//             System.out.println("该整数小于0");
//         } else if(i == 0){
//             System.out.println("该整数等于0");
//         } else if (i > 0) {
//             System.out.println("该整数大于0");
//         }
//          // 询问用户是否要再次尝试
//         System.out.println("是否要再玩一次？(Y/N)");
//         String choice = myScanner.next();
//         playAgain = choice.equalsIgnoreCase("Y");
//     }
// }
// }

//优化

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("请输入一个整数：");
            int i = scanner.nextInt();

            if (i < 0) {
                System.out.println("该整数小于0");
            } else if (i == 0) {
                System.out.println("该整数等于0");
            } else {
                System.out.println("该整数大于0");
            }

            // 询问用户是否要再次尝试
            boolean validChoice = false;
            while (!validChoice) {
                System.out.println("是否要再玩一次？(Y/N)");
                String choice = scanner.next().toLowerCase();
                if (choice.equals("y")) {
                    playAgain = true;
                    validChoice = true;
                } else if (choice.equals("n")) {
                    playAgain = false;
                    validChoice = true;
                } else {
                    System.out.println("无效的选项，请重新输入。");
                }
            }
        }
    }
}
