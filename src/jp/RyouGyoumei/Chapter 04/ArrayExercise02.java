
// public class ArrayExercise02 {
//     public static void main(String[] args) {
//         int[] arr = {4,-1,9,10,23};
//         int max = arr[0];
//         int maxIndex = 0;

//         for (int i = 1; i < arr.length; i++) {
//             if (max < arr[i]) {
//                 max = arr[i];
//                 maxIndex = i;
//             }
//             System.out.println("max=" + arr[i] + "\t" + "maxIndex=" + i);
//         }
//     }
// }
// public class ArrayExercise02 {
//     public static void main(String[] args) {
//         int[] arr = {4, -1, 9, 10, 23};
//         int max = arr[0];
//         int maxIndex = 0;

//         for (int i = 1; i < arr.length; i++) {
//             if (max < arr[i]) {
//                 max = arr[i];
//                 maxIndex = i;
//             }
//         }
//         System.out.println("max=" + max + "\t" + "maxIndex=" + maxIndex);
//     }
// }

public class ArrayExercise02 {
    public static void main(String[] args) {
        // 创建一个长度为5的整数型数组arr，其中包含4、-1、9、10、23五个元素。
        int[] arr = {4, -1, 9, 10, 23};
        // 声明并初始化变量max为数组中下标0处的元素
        int max = arr[0];
        // 声明并初始化变量maxIndex为0，记录当前最大值所在的下标
        int maxIndex = 0;

        // 使用for循环遍历数组中的每一个元素，获取最大值以及其下标.
        for (int i = 1; i < arr.length; i++) {
            // 如果数组当前下标i的值比max变量中保存的值大，则将该值赋给max。并更新maxIndex为当前下标。
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
            // 打印输出每一次循环的最大值和其所在的下标。
            System.out.println("max=" + arr[i] + "\t" + "maxIndex=" + i);
        }
    }
}
