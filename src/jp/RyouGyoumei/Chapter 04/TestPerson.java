public class TestPerson {
    public static void main(String[] args) {
        Person005 pp1 = new Person005("marry", 20);
        Person005 pp2 = new Person005("Tom", 30);

        System.out.println(pp1.compareTo(pp2));
    }
}

class Person005 {
    String name; // 姓名
    int age;     // 年龄

    public Person005(String name, int age) { // 构造函数
        this.name = name;
        this.age = age;
    }

    /**
     * 比较两个Person对象是否相等
     * @param p 另一个Person对象
     * @return 如果两个对象的姓名和年龄都相等，则返回true，否则返回false
     */
    public boolean compareTo(Person005 p) {
        return this.name.equals(p.name) && this.age == p.age;
    }
}