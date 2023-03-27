public class ConstructorExercise {
    public static void main(String[] args) {
        Person05 QQ = new Person05();
        System.out.println(QQ.age);
    }
}

class Person05 {
    String name;
    int age;
    public Person05() { 
        age = 18;
    }
}