public class Object {
    public static void main(String[] args) {
        //使用面向对象的方式 
        //使用OOP面向对象解决
        //实例化一只猫【创建一个猫对象】
        //1. new Cat()创建一只猫
        //2. Cat cat1 = new Cat(); 把创建的猫赋给 cat1
        Cat cat1 = new Cat();
        cat1.name = "小白";
        cat1.age = 3;
        cat1.color = "White";
        cat1.weight = 20;

        Cat cat2 = new Cat();
        cat2.name = "小花";
        cat2.age = 100;
        cat2.color = "Black";
        cat2.weight = 10;

        System.out.println("第一只猫信息" + cat1.name + " " + cat1.age + " " + cat1.color + " " + cat1.weight);
        System.out.println("第一只猫信息" + cat2.name + " " + cat2.age + " " + cat2.color + " " + cat2.weight);
    }
}

class Cat{
    String name;
    int age;
    String color;
    double weight;
    //还可增加行为
}
