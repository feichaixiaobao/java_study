public class MethodParameter02 {
    public static void main(String[] args) {
        Ex01 a = new Ex01();
        Ex02 b = new Ex02();
        int[] arr = {1, 2, 3}; //创建一个长度为3的数组arr，其中包含1、2、3三个元素
        a.test100(arr); //调用Ex01类中的test100方法，并将arr数组作为参数传入
        System.out.println("main的arr数组");
        for (int i = 0; i < arr.length; i++) { //遍历数组arr中的元素
            System.out.println(arr[i] + "\t"); //输出数组arr中的元素
        }
        System.out.println(); //换行

        Person p = new Person();
        p.name = "Jack";
        p.age = 10;

        b.test200(p);
        System.out.println("main 的p.age=" + p.age);
    }
}
class Person {
    String name;
    int age;
}

class Ex02 {
    public void test200(Person p){
        p.age = 10000;
    }
}

class Ex01 {
    public void test100(int[] arr) { //定义一个名为test100的方法，参数为一个整型数组arr
        arr[0] = 200; //将数组arr中下标为0的元素设为200
        System.out.println("test100的arr数组");
        for (int i = 0; i < arr.length; i++) { //遍历数组arr中的元素
            System.out.println(arr[i] + "\t"); //输出数组arr中的元素
        }
        System.out.println(); //换行
    }
}
// 笔记：在Java中，数组是引用类型。当一个数组被作为参数传递给一个方法时，
// 它实际上是通过引用传递的，这意味着方法将使用与调用者相同的实际对象（即同一个数组对象）。
// 因此，在test100方法中对数组进行的更改也会反映在main方法中的相同数组上。
// 所以，这里main中的arr和test100方法内的arr是一样的。