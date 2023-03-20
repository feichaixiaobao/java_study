public class MethodParameter { // 方法参数类
    public static void main(String[] args) {
        int a = 10; // 定义变量a并赋值为10
        int b = 20; // 定义变量b并赋值为20
        CC c = new CC(); // 创建CC实例c
        c.swap(a, b); // 调用CC类的swap方法并传入a和b作为参数
        System.out.println("main 方法 的a=" + a + "b=" + b); // 输出a和b的值
    }
}

class CC{ // 定义CC类

    public void swap(int a,int b) { // 定义swap方法，并传入a和b两个参数
        int tmp = a; // 声明一个临时变量tmp，将a的值赋给它
        a = b; // 将b的值赋给a
        b = tmp; // 将tmp的值赋给b
        System.out.println("a=" + a +"\tb=" + b); // 输出交换后a和b的值
    }
}