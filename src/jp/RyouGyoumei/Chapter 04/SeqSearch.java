// import java.util.Scanner;
// public class SeqSearch {
//     public static void main(String[] args) {
//         String[] names = {"白毛鹰王", "金毛狮王", "紫衫龙王", "青翼蝠王"};
//         Scanner myScanner = new Scanner(System.in);
        
//         System.out.println("请输入名字");
//         Scanner findName = myScanner.next();
//         int index = -1;

//         for (int i = 0; i < names.length; i++) {
//             if (findName.equals(names[i])) {
//                 System.out.println("恭喜你找到" + findName);
//                 System.out.println("下标为=" + i);
//                 index = i;
//                 break;
//             }
//         }

//         if (index == -1) {
//             System.out.println("sorry");
//         }

//     }
// }

import java.util.Scanner;

public class SeqSearch {
    public static void main(String[] args) {
        String[] names = {"白毛鹰王", "金毛狮王", "紫衫龙王", "青翼蝠王"};
        Scanner myScanner = new Scanner(System.in);
 
        while (true) { // 无限循环直到用户输入 exit
            System.out.println("请输入名字，或者输入'exit'结束查询");
            String findName = myScanner.next();

            if (findName.equals("exit")) { // 如果输入为 exit ，跳出循环
                break;
            }

            int index = -1;

            for (int i = 0; i < names.length; i++) {
                if (findName.equals(names[i])) {
                    System.out.println("恭喜你找到" + findName);
                    System.out.println("下标为=" + i);
                    index = i;
                    break;
                }
            }

            if (index == -1) {
                System.out.println("sorry");
            }
        }
    }
}
