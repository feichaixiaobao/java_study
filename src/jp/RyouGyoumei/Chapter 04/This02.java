// 定义一个公共类 This02
public class This02 {
    // 主方法
    public static void main(String[] args) {
        // 创建一个 tt 类的实例对象 t1
        tt t1 = new tt();
        // 调用 t1 对象的 f2 方法
        t1.f2();
    }
}

// 定义一个 tt 类
class tt {
    // 定义一个公共方法 f1
    public void f1() {
        // 输出 "f1"
        System.out.println("f1");
    }

    // 定义一个公共方法 f2
    public void f2() {
        // 输出 "f2"
        System.out.println("f2");
        // 调用 f1 方法
        f1();
        // 使用 this 关键字调用 f1 方法
        this.f1();
    }
}
