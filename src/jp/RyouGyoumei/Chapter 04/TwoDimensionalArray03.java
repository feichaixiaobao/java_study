public class TwoDimensionalArray03 {
    public static void main(String[] args) {
        // 创建一个长度为10的二维数组
        int[][] arr = new int[10][];
        
        // 遍历二维数组中的每一行
        for (int i = 0; i < arr.length; i++) {
            // 在第i+1行上创建长度为(i+1)的一维数组
            arr[i] = new int[i + 1];
            
            // 遍历每个一维数组，将它们所有元素的值设置为（i+1）
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + 1;
            }
        }
        
        // 遍历整个二维数组，输出其中每个元素的值
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
