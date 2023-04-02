import java.util.Arrays;

public class CopyArr {
    /**
     * 复制整数数组
     * @param arr 要复制的整数数组
     * @return 新的整数数组，元素与传入数组相同
     */
    public static int[] copyArr(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = CopyArr.copyArr(arr);
        System.out.println(Arrays.toString(newArr)); // [1, 2, 3, 4, 5]
    }
}
