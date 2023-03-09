import java.util.Scanner;

public class ArrayReduce {
    public static void main(String[] args) {
        System.out.println("是否缩减 y/n？");
        Scanner myScanner = new Scanner(System.in);
        int[] arr = {1, 2, 3}; // 初始化数组
        char key = myScanner.next().charAt(0);
        
        while (key == 'y') { // 可以使用while循环替代do-while循环
            int[] arrNew = new int[arr.length - 1]; // 在for循环之外定义新数组arrNew
            for (int i = 0; i < arrNew.length; i++) { // 使用arrNew.length作为for循环的终止条件
                arrNew[i] = arr[i]; // 将原数组中前面n-1个元素复制到新数组
                System.out.print(arrNew[i] + "\t"); // 输出新数组中当前位置的元素
            }
            arr = arrNew; // 新数组赋值给原数组，更新arr的值
            System.out.println(); // 注意换行处理
            
            if (arrNew.length >= 1) { // 这里应该是arrNew.length而不是arr.length
                System.out.println("是否继续缩减 y/n？"); // 询问用户是否继续
                key = myScanner.next().charAt(0); // 接收用户输入的字符
            } else { // 如果数组长度已经小于2了，则不能再继续缩减，退出循环
                System.out.println("数组长度小于1，无法继续缩减！");
                break;
            }
        }
        System.out.println("程序结束！");
    }
}
