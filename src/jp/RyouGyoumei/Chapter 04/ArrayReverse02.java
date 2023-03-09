public class ArrayReverse02 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66};
        int[] arr2 = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            arr2[j] = arr[i];
        }
        arr = arr2;
        System.out.println("======arr的元素情况======");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
