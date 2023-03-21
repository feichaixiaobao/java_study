// public class RecursionExercise02 {
//     public static void main(String[] args) {
//         W w1 = new W();
//         int day = 10;
//         int peachNum = w1.peach(day);
//         if (peachNum != -1) {
//             System.out.println("第" + day + "天有" + peachNum + "个桃子");
//     }
// }
// }
//  class W {
//     public int peach(int day) {
//         if (day == 10) {
//             return 1;
//         } else if (day >= 1 && day <= 9){
//             return (peach(day + 1) +1) * 2;
//         } else {
//             System.out.println("day需要是1～10的范围的整数");
//             return -1;
//         }
//     }
//  }

 public class RecursionExercise02 {
     public static void main(String[] args) {
         W w1 = new W();
         int day = 10;
         int peachNum = w1.peach(day);
         if (peachNum != -1) {
             System.out.println("第" + day + "天有" + peachNum + "个桃子");
         }
     }
 }
 
 class W {
     public int peach(int day) {
         if (day < 1 || day > 10) { // 如果 day 不合法，输出错误信息并返回 -1
             System.out.println("day需要是1～10的范围的整数");
             return -1;
         } else if (day == 1) {
             return 1;
         } else {
             return (peach(day - 1) + 1) * 2;
         }
     }
 }