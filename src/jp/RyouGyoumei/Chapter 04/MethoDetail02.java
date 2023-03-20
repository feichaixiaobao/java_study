public class MethoDetail02 {
    public static void main(String[] args) { // 主函数入口
        A a = new A(); // 创建 A 类的实例对象 a
        a.sayOk(); // 调用 a 的 sayOk() 方法
        a.m1(); // 调用 a 的 m1() 方法
    }
}

class A{ // A类的定义
    public void print(int n) { // 接收一个 int 类型的参数并打印
        System.out.println("print()方法被调用 n=" + n);
    }

    public void sayOk() { // 打印一行文字并调用 print() 方法
        print(10);
        System.out.println("继续执行sayOk()");
    }

    public void m1() { // 打印一行文字并创建 B 类的实例 b，调用其 hi() 方法
        System.out.println("m1()方法被调用");
        B b = new B();
        b.hi();
    }
}


class B{ // B 类的定义
    public void hi() { // 打印一行文字
        System.out.println("B类中的hi()被执行");
    }
}