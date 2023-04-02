import java.util.Scanner;

public class Circle {
    private double radius; // 定义私有半径属性

    // 构造函数，接收半径参数并将其存储在属性中
    public Circle(double radius) {
        this.radius = radius;
    }

    // 计算并返回圆的周长
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // 计算并返回圆的面积
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // 示例代码，创建一个Circle对象并使用其方法
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入圆的半径：");
        double radius = scanner.nextDouble(); // 从控制台读取用户输入的半径

        Circle c = new Circle(radius); // 创建一个指定半径的圆对象
        System.out.println("周长：" + c.getCircumference());
        System.out.println("面积：" + c.getArea());

        scanner.close(); // 关闭Scanner对象
    }
}
