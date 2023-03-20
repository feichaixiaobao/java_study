public class Objec03 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 10;
        p1.name = "Tom";
        Person p2=p1;
        System.out.println(p2.age);
    }
}

class Person{
    int age;
    String name;
}