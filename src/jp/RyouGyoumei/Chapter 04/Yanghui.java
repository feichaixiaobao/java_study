public class Yanghui {

    public static void main(String[] args) {
        //创建一个二维数组存放杨辉三角数据
        int[][] yangHui = new int[10][];

        //给二维数组赋值
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i+1]; //第i行有(i+1)个元素

            for (int j = 0; j < yangHui[i].length; j++) {
                if(j == 0 || j == yangHui[i].length - 1){ //边界为1
                    yangHui[i][j] = 1;
                }else{
                    //其他位置的数为上一行前后两个数之和
                    yangHui[i][j] = yangHui[i-1][j] + yangHui[i-1][j-1];
                }
            }
        }

        //输出杨辉三角数字
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j] + " ");
            }
            System.out.println();
        }
    }
}
