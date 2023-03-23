public class Constructor01 {
    public static void main(String[] args) {
        // 创建一个名为"Tom"、年龄为90岁的Person02对象
        Person02 person02 = new Person02("Tom", 90);
        // 输出person02对象的name属性值
        System.out.println(person02.name);
        // 输出person02对象的age属性值
        System.out.println(person02.age);
    }
}

class Person02 {
    String name;
    int age;

    // 构造方法，用来初始化对象的属性值
    public Person02(String pName, int pAge) {
        // 在构造方法中打印一条消息，表示构造方法被调用了
        System.out.println("构造器被调用");
        // 初始化对象的name属性值为pName
        name = pName;
        // 初始化对象的age属性值为pAge
        age = pAge;
    }
}