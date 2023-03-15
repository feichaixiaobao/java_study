// public class ArrayBubble{
//     public static void main(String[] args) {
//         int[] arr = {24, 69, 88, 57, 13, -1, 30, 200};
//         int temp = 0;

//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = 0; j < arr.length - 1 - i; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//             System.out.println("\n==第"+(i+1)+"轮==");
//             for (int j = 0; j < arr.length; j++) {
//                 System.out.println(arr[j] + "\t");
//             }
//         }
//     }
// }

public class ArrayBubble {
    public static void main(String[] args) {
        int[] arr = {24, 69, 88, 57, 13, -1, 30, 200};

        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSwapped = false;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j+1);
                    isSwapped = true;
                }
            }

            // 如果本轮遍历没有发生任何交换，则数组已经是有序状态，不需要再进行排序
            if (!isSwapped) {
                break;
            }

            System.out.println("\n==第" + (i+1) + "轮==");
            printArray(arr);
        }
    }

    /**
     * 交换数组中指定位置的两个元素值
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 打印数组元素
     */
    private static void printArray(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }
}
