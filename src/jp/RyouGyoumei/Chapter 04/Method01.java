public class Method01 {
    public static void main(String[] args) {
        Person p1 = new Person(); // 创建一个名为p1的Person类的实例对象
        p1.speak(); // 调用对象p1上的speak()方法
        p1.cal01(); // 调用对象p1上的cal01()方法
        p1.cal02(5); // 调用对象p1上的cal02()方法，参数为5
        p1.cal02(10); // 调用对象p1上的cal02()方法，参数为10
        int returnRes = p1.getSum(10, 20);
        System.out.println(returnRes);
    }
}

class Person{
    String name; // 声明一个名为name的字符串类型变量
    int age; // 声明一个名为age的整型变量

    public void speak(){ // 定义一个名为speak()的公有方法
        System.out.println("I am a nice guy."); // 在控制台输出一条信息
    }

    public void cal01(){ // 定义一个名为cal01()的公有方法
        int res = 0; // 声明一个名为res的整型变量并将其赋值为0
        for (int i = 0; i <= 1000; i++) { // 开始一个计数循环，从0到1000
            res += i; // 将i的当前值加到变量res中
        }
        System.out.println(res); // 在控制台输出变量res的最终值
    }

    public void cal02(int n){ // 定义一个名为cal02()的公有方法，该方法带有一个整型参数n
        int res = 0; // 声明一个名为res的整型变量并将其赋值为0
        for (int i = 0; i <= n; i++) { // 开始一个计数循环，从0到n
            res += i; // 将i的当前值加到变量res中
        }
        System.out.println("cal02 =" + res); // 在控制台输出一条信息以及变量res的最终值
    }

    public int getSum(int num1, int num2){
        int res = num1 + num2; // 声明一个名为res的整型变量并将其赋值为num1和num2的和
        return res; // 返回变量res的值
    }
}