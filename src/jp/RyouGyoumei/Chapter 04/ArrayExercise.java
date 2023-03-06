public class ArrayExercise {
    public static void main(String[] args) {
        int n1 = 10;//10    
        int n2 = n1;//80

        n2 = 80;
        System.out.println("n1=" + n1);
        System.out.println("n2=" + n2);

        //数组在默认情况下是引用传递，赋的值是地址，赋值方式为引用赋值
        //是一个地址，arr2变化会影响到 arr1
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;//arr1赋给arr2
        arr2[0] = 10;

        //arr1的值
        System.out.println("=====arr1的元素====");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
