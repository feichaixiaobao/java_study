//输出小写的a-z以及大写的Z-A
//考察a-z编码和for循环的使用
//思路分析
//1、‘b’ = a+1 'c' = 'a' +2
public class Homework03 {
    public static void main(String[] args) {
        int count = 0;
        for (char c1 = 'a'; c1 <='z'; c1++,count++) {
            if (count %5 ==0) {
                System.out.println("\t");
            }
            System.out.print(c1 + " ");
        }
        for (char c2 = 'Z'; c2 >='A'; c2--,count++) {
            if (count %5 ==0) {
                System.out.println("\t");
            }
            System.out.print(c2 + " ");
        }
    }
}
