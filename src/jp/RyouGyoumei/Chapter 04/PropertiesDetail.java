public class PropertiesDetail {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.age + " " + p1.name + " " + p1.sal + " " + p1.isPass);
    }
}
class Person{
    int age;
    String name;
    double sal;
    boolean isPass;
}