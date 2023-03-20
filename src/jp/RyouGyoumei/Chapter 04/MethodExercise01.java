public class MethodExercise01 {
    public static void main(String[] args) { // 主函数入口
        BB a = new BB(); // 创建 BB 类的实例对象 a
        if (a.isOdd(2)) { // 调用 a 的 isOdd() 方法判断是否为奇数
            System.out.println("是奇数");
        }else {
            System.out.println("是偶数");
        }
        
        a.print(4, 4, '#');
    }
}

class BB{ // BB 类的定义
    public boolean isOdd(int num) { // 判断一个整数是否为奇数，返回布尔值
        return num %2 != 0;
    }
    public void print(int row, int col, char c){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}