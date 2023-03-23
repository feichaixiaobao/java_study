public class ConstructorDetail {
    public static void main(String[] args) {
        // 使用第一个构造方法创建名为"Tom"、年龄为0岁的Person03对象
        Person03 p1 = new Person03("Tom");
        // 输出p1对象的name属性值
        System.out.println(p1.name);
        // 输出p1对象的age属性值（默认值为0）
        System.out.println(p1.age);

        // 使用第二个构造方法创建名为"Jack"、年龄为40岁的Person03对象
        Person03 p2 = new Person03("Jack", 40);
        // 输出p2对象的name属性值
        System.out.println(p2.name);
        // 输出p2对象的age属性值
        System.out.println(p2.age);
    }
}

class Person03 {
    String name;
    int age;

    // 第一个构造方法，只有一个参数pName，用来创建一个年龄为0的Person03对象
    public Person03(String pName) {
        // 将pName赋值给对象的name属性
        name = pName;
    }

    // 第二个构造方法，接收两个参数pName和pAge，用来创建指定姓名和年龄的Person03对象
    public Person03(String pName, int pAge) {
        // 将pName赋值给对象的name属性
        name = pName;
        // 将pAge赋值给对象的age属性
        age = pAge;
    }
}