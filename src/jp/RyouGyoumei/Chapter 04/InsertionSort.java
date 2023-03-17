// public class InsertionSort {
//     public static void main(String[] args) {
//         int[] arr = {10, 12, 45, 90};  // 给定的升序数组
//         int num = 23;  // 要插入的元素

//         // 在数组中插入一个元素
//         int[] newArr = new int[arr.length + 1];  // 新建一个长度比原数组多1的新数组
//         for (int i = 0; i < arr.length; i++) {
//             newArr[i] = arr[i];  // 将原数组中的元素复制到新数组中
//         }
//         newArr[arr.length] = num;  // 在新数组中最后一个位置插入要插入的元素

//         // 使用插入排序将数组升序排列
//         for (int i = 1; i < newArr.length; i++) {  // 从第2个元素开始遍历新数组
//             int key = newArr[i];  // 记录当前元素值
//             int j = i - 1;  // j指向当前元素的前一个元素
//             while (j >= 0 && newArr[j] > key) {  // 当前元素前面的元素比它大时，循环执行
//                 newArr[j + 1] = newArr[j];  // 把前面的元素后移一位
//                 j--;  // j继续指向前面一个元素
//             }
//             newArr[j + 1] = key;  // 把当前元素插入到j的后面
//         }

//         // 打印排序后的数组
//         for (int i = 0; i < newArr.length; i++) {
//             System.out.print(newArr[i] + " ");
//         }
//     }
// }

// import java.util.Scanner;

// public class InsertionSort {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // 读取用户输入的一组元素
//         System.out.print("请输入要排序的元素，以空格分隔：");
//         String input = scanner.nextLine();
//         String[] inputArr = input.split(" ");  // 将用户输入的字符串按空格分割成字符串数组
//         int[] arr = new int[inputArr.length];
//         for (int i = 0; i < inputArr.length; i++) {
//             arr[i] = Integer.parseInt(inputArr[i]);  // 将字符串数组转换成整型数组
//         }

//         // 使用插入排序将数组升序排列
//         for (int i = 1; i < arr.length; i++) {  // 从第2个元素开始遍历数组
//             int key = arr[i];  // 记录当前元素值
//             int j = i - 1;  // j指向当前元素的前一个元素
//             while (j >= 0 && arr[j] > key) {  // 当前元素前面的元素比它大时，循环执行
//                 arr[j + 1] = arr[j];  // 把前面的元素后移一位
//                 j--;  // j继续指向前面一个元素
//             }
//             arr[j + 1] = key;  // 把当前元素插入到j的后面
//         }

//         // 打印排序后的数组
//         System.out.print("排序后的数组为：");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// import java.util.Scanner;

// public class InsertionSort {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // 初始化数组
//         int[] arr = {10, 12, 45, 90};
//         System.out.print("当前数组为：");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();

//         // 读取用户输入的一组元素
//         System.out.print("请输入要插入的元素，以空格分隔：");
//         String input = scanner.nextLine();
//         String[] inputArr = input.split(" ");  // 将用户输入的字符串按空格分割成字符串数组
//         int[] insertArr = new int[inputArr.length];
//         for (int i = 0; i < inputArr.length; i++) {
//             insertArr[i] = Integer.parseInt(inputArr[i]);  // 将字符串数组转换成整型数组
//         }

//         // 新建一个数组，将原数组和插入的元素合并
//         int[] newArr = new int[arr.length + insertArr.length];
//         int i = 0, j = 0, k = 0;
//         while (i < arr.length && j < insertArr.length) {
//             if (arr[i] < insertArr[j]) {
//                 newArr[k] = arr[i];
//                 i++;
//             } else {
//                 newArr[k] = insertArr[j];
//                 j++;
//             }
//             k++;
//         }
//         while (i < arr.length) {
//             newArr[k] = arr[i];
//             i++;
//             k++;
//         }
//         while (j < insertArr.length) {
//             newArr[k] = insertArr[j];
//             j++;
//             k++;
//         }

//         // 使用插入排序将新数组升序排列
//         for (i = 1; i < newArr.length; i++) {  // 从第2个元素开始遍历数组
//             int key = newArr[i];  // 记录当前元素值
//             j = i - 1;  // j指向当前元素的前一个元素
//             while (j >= 0 && newArr[j] > key) {  // 当前元素前面的元素比它大时，循环执行
//                 newArr[j + 1] = newArr[j];  // 把前面的元素后移一位
//                 j--;  // j继续指向前面一个元素
//             }
//             newArr[j + 1] = key;  // 把当前元素插入到j的后面
//         }

//         // 打印排序后的数组
//         System.out.print("排序后的数组为：");
//         for (i = 0; i < newArr.length; i++) {
//             System.out.print(newArr[i] + " ");
//         }
//     }
// }
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 初始化一个已排序的数组
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(12);
        arr.add(45);
        arr.add(90);

        System.out.print("请输入要插入的元素（用逗号分隔）：");
        String input = scanner.nextLine();
        String[] inputs = input.split(",");
        for (String s : inputs) {
            arr.add(Integer.parseInt(s.trim()));
        }

        // 对数组进行排序
        Collections.sort(arr);

        // 输出排序后的数组
        System.out.print("排序后的数组：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
