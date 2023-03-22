public class OverLoad {
    public static void main(String[] args) {
        Methods method = new Methods(); // 创建 Methods 类的实例
        method.mm(10); // 调用 mm 方法，传递 int 类型的参数
        method.mm(10, 20); // 调用 mm 方法，传递两个 int 类型的参数
        method.mm("hello world!"); // 调用 mm 方法，传递 String 类型的参数

        // 调用 max 方法，传递不同类型的参数，并将返回值打印到控制台
        System.out.println(method.max(10, 24));
        System.out.println(method.max(10.0, 1.4, 40.0));
        System.out.println(method.max(1.5, 2.8));
    }
}

class Methods {

    // 返回两个整数中的最大值
    public int max(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }

    // 返回两个浮点数中的最大值
    public double max(double n1, double n2) {
        return n1 > n2 ? n1 : n2;
    }

    // 返回三个浮点数中的最大值
    public double max(double n1, double n2, double n3) {
        double max1 = n1 > n2 ? n1 : n2;
        double max2 = n3 > max1 ? n3 : max1;
        return max2;
    }

    // 打印一个整数的平方
    public void mm(int n) {
        System.out.println("平方=" + (n + n));
    }

    // 打印两个整数的乘积
    public void mm(int n1, int n2) {
        System.out.println("相乘=" + (n1 * n2));
    }

    // 打印一个字符串
    public void mm(String str) {
        System.out.println(str);
    }
}