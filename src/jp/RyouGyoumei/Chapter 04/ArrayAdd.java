import java.util.Scanner;

public class ArrayAdd {
    public static void main(String[] args) {
        // 1.原始数组使用静态分配int[]arr={1,2,3}
        // 2.增加的元素4，直接放在数组的最后arr={1,2,3,4)
        // 3.用户可以通过如下方法来决定是否继续添加，添加成功，是否继续？y/n

        Scanner myScanner = new Scanner(System.in);
        int[] arr = {1, 2, 3}; // 初始化数组

        do {
            int[] arrNew = new int[arr.length + 1]; // 创建扩容后的新数组
            System.arraycopy(arr, 0, arrNew, 0, arr.length); // 将arr里面的元素复制到arrNew中
            System.out.println("请输入你要添加的元素");
            int addNum = myScanner.nextInt();
            arrNew[arrNew.length - 1] = addNum; // 在数组末尾添加输入的数字
            arr = arrNew; // 将扩容后的新数组赋值给arr

            System.out.println("=====arr扩容后的元素内容=====");
            for (int i = 0; i < arrNew.length; i++) { // 输出扩容后的新数组元素内容
                System.out.print(arrNew[i] + "\t");
            }
            System.out.println("\n"); // 换行输出下一次循环结果

            System.out.println("是否继续添加 y/n?");
            char key = myScanner.next().charAt(0);
            if (key == 'n') {
                break;
            }
        } while (true);

        System.out.println("程序结束！");
    }
}
