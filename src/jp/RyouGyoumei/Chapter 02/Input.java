import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        //演示接受用户输入
        //1）
        //Scanner 类 表示 简单文本扫描器，在java.util 包
        //引入 Scanner类所在的包
        //2）
        //创建Scanner对象，new 创建一个对象
        //myScanner 就是 Scanner类的对象

        Scanner myScanner = new Scanner(System.in);
        //3) 接受用户输入，使用相关的方法
        System.out.println("请输入姓名");
        //当程序执行到 next 时，会等待用户输入
        String name = myScanner.next();//接受用户输入字符串
        System.out.println("请输入年龄");
        int age = myScanner.nextInt();//接受用户输入int
        System.out.println("请输入薪水");
        double salary = myScanner.nextDouble();//接受用户输入double类型
        System.out.println("信息如下：");
        System.out.println("名字" + name + "\n" + "年龄" + age + "\n" + "薪水" + salary + "\n");

    }
}
