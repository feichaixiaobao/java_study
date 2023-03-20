public class Method02 {
    public static void main(String[] args) {
        int [][] map = {{0,0,1},{1,1,1},{1,1,3}}; // 声明一个二维整型数组map并初始化

        MyTools tool = new MyTools(); // 创建一个MyTools类的实例对象tool
        tool.printArr(map); // 调用tool对象上的printArr()方法，并将map作为参数传入
        tool.printArr(map); // 再次调用tool对象上的printArr()方法，并将map作为参数传入
        tool.printArr(map); // 再次调用tool对象上的printArr()方法，并将map作为参数传入
    }
}

class MyTools{
    public void printArr(int[][] map){ // 定义一个名为printArr()的公有方法，该方法接收一个二维整型数组作为参数
        System.out.println("============="); // 在控制台输出一条分隔线
        for (int i = 0; i < map.length; i++) { // 开始第一重循环，遍历二维数组的每一行
            for (int j = 0; j < map[i].length; j++) { // 开始第二重循环，遍历当前行的每一个元素
                System.out.print(map[i][j] + "  "); // 在同一行内输出当前元素和一个空格
            }
            System.out.println(); // 在控制台输出一个换行符，使下一行元素从新的一行开始输出
        }
    }
}