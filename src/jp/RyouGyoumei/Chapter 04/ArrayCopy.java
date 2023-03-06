public class ArrayCopy {
    public static void main(String[] args) {
        //将int[] arr1 = {10,20,30} 拷贝到arr2数组
        //要求数据空间是独立的

        int[] arr1 = {10,20,30};
        //int[] arr2 = arr1;//空间是共享的，不是独立的
        int[] arr2 = new int[arr1.length];
        
        // 遍历arr1 把每个元素拷贝到arr2对应的元素位置
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        arr2[0] = 100;

        //输出arr1
        System.out.println("======arr1的元素======");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        //输出arr2
        System.out.println("======arr2的元素======");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}