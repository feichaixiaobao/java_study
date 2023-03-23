public class VarScope {
    public static void main(String[] args) {
        Cat01 cat = new Cat01();
        cat.cry();
        cat.eat();
    }
}

class Cat01 {

    int age = 10; // 这里是全员变量

    public void cry() {
        int n = 10; // 这里是局部变量
        String name = "Tom"; // 这里也是局部变量
        System.out.println("在cry中使用属性 age =" + age);
    }

    public void eat(){
        System.out.println("在eat中使用属性 age=" + age);
    }
}