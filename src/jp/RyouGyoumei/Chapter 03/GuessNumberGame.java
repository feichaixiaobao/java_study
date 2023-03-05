// 用户需要输入一个数字，如果这个数字大于8，输出大，否则输出小
// 第一步开头提示用户输入1-10
// 正确答案为8
// 如果大于8提示大了，否则提示小了

// import java.util.Scanner;

// import javax.lang.model.util.ElementScanner14;
// public class Homework03 {
//     public static void main(String[] args) {
//         System.out.println("请输入1个1-10之间的数字\n请输入代码：");
//         Scanner myScanner = new Scanner(System.in);
//         boolean playAgain = true;

//         while (playAgain) {
//             int i = myScanner.nextInt();
//             if (i > 0 && i<=10 ) {
//                             if (i > 8) {
//                                 System.out.println("大");
//                             } else if(i < 8){
//                                 System.out.println("小");
//                             } else if (i == 8 ){
//                                 System.out.println("答对了！");
//                             }
//                             break;
//             } 
//         else {
//             System.out.println("请重新输入：");
//             }
//     }
//     }


// }

//优化

// import java.util.Scanner;

// public class Homework03 {
//     public static void main(String[] args) {
//     Scanner myScanner = new Scanner(System.in);
//     int answer = 8;
//     int count = 0;
//     boolean playAgain = true;
//     System.out.println("请输入一个1-10之间的数字：");

//     while (playAgain) {
//         int guess = myScanner.nextInt();

//         if (guess > 0 && guess <= 10) {
//             if (guess == answer) {
//                 System.out.println("答对了！");
//                 playAgain = false;
//             } else if (guess > answer) {
//                 System.out.println("大");
//                 count++;
//                 if (count == 3) {
//                     System.out.println("已超过重新输入次数，正确答案为" + answer);
//                     break;
//                 }
//             } else {
//                 System.out.println("小");
//                 count++;
//                 if (count == 3) {
//                     System.out.println("已超过重新输入次数，正确答案为" + answer);
//                     break;
//                 }
//             }
//         } else {
//             System.out.println("请输入1-10之间的数字：");
//             count++;
//             if (count == 3) {
//                 System.out.println("已超过重新输入次数，正确答案为" + answer);
//                 break;
//             }
//         }
//     }

//     myScanner.close();
//     }
// }

//优化

import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int answer = 8;
    int count = 0;
    boolean playAgain = true;

    System.out.println("请输入一个1-10之间的数字：");

    while (playAgain) {
        int guess = scanner.nextInt();

        if (guess < 1 || guess > 10) {
            System.out.println("请输入1-10之间的数字：");
            count++;
        } else if (guess == answer) {
            System.out.println("答对了！");
            playAgain = false;
        } else {
            System.out.println(guess > answer ? "大" : "小");
            count++;
        }

        if (count == 3) {
            System.out.println("已超过重新输入次数，正确答案为" + answer);
            break;
        }
    }

    scanner.close();
    }
}