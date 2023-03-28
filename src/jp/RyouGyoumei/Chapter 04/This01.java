public class This01 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("dazhuang",  3);
        dog1.info();
    }
}

class Dog{
    String name;
    int age;
    public Dog(String dName, int dAge){
        name = dName;
        age = dAge;
    }

    public void info() {
        System.out.println(name + "\t" + age + "\t");
    }
}