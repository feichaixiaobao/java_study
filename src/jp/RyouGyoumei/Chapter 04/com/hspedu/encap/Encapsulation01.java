package com.hspedu.encap;

public class Encapsulation01 {
    private String name;  // 声明私有变量name
    private int age;  // 声明私有变量age
    private double salary;  // 声明私有变量salary

    public String getName() {  // 公共方法，获取name的值
        return name;
    }

    public void setName(String name) {  // 公共方法，设置name的值
        if (name.length() >= 2 && name.length() <= 6) {  // 如果name长度在2-6之间，设置name的值
            this.name = name;
        } else {
            System.out.println("姓名应该在2到6个字符之间");  // 否则输出错误提示
        }
    }

    public int getAge() {  // 公共方法，获取age的值
        return age;
    }

    public void setAge(int age) {  // 公共方法，设置age的值
        if (age >= 1 && age <= 120) {  // 如果age在1-120之间，设置age的值
            this.age = age;
        } else {
            System.out.println("年龄应该在1到120岁之间");  // 否则输出错误提示
            this.age = 18;  // 设置age的默认值为18岁
        }
    }

    public double getSalary() {  // 公共方法，获取salary的值
        return salary;
    }

    public void setSalary(double salary) {  // 公共方法，设置salary的值
        this.salary = salary;
    }

    public static void main(String[] args) {
        Encapsulation01 person = new Encapsulation01();  // 创建Encapsulation01对象
        person.setName("John");  // 设置person的name值
        person.setAge(30);  // 设置person的age值
        person.setSalary(50000.0);  // 设置person的salary值

        System.out.println("Name: " + person.getName());  // 输出person的name值
        System.out.println("Age: " + person.getAge());  // 输出person的age值
        System.out.println("Salary: " + person.getSalary());  // 输出person的salary值
        Encapsulation01GUI gui = new Encapsulation01GUI();
    }
}
