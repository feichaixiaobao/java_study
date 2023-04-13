package com.hspedu.override_;

// 定义Student类，继承Person类
class Student extends Person { // 继承Person类，使用extends关键字
    private int id; // 定义id属性，使用private修饰，表示只能在本类中访问
    private int score; // 定义score属性，使用private修饰，表示只能在本类中访问

    // 构造器
    public Student(String name, int age, int id, int score) { // 定义构造器，用于初始化对象的属性
        super(name, age); // 使用super关键字，调用父类的构造器，初始化name和age属性
        this.id = id; // 使用this关键字，表示引用当前对象的id属性
        this.score = score; // 使用this关键字，表示引用当前对象的score属性
    }

    // 返回自我介绍的字符串
    public String say() { // 重写父类的say方法，使用@Override注解
        // 使用super关键字，引用父类的name和age属性
        // 使用this关键字，引用当前对象的id和score属性
        return "My name is " + super.getName() + ". I'm " + super.getAge() + " years old. My student ID is " + id + " and my score is " + score + ".";
    }
}