package com.hspedu.override_;

// 定义Person类
class Person {
    private String name; // 定义name属性，使用private修饰，表示只能在本类中访问
    private int age; // 定义age属性，使用private修饰，表示只能在本类中访问

    // 构造器
    public Person(String name, int age) { // 定义构造器，用于初始化对象的属性
        this.name = name; // 使用this关键字，表示引用当前对象的name属性
        this.age = age; // 使用this关键字，表示引用当前对象的age属性
    }

    // 返回name属性的值
    public String getName() {
        return name;
    }

    // 返回age属性的值
    public int getAge() {
        return age;
    }

    // 返回自我介绍的字符串
    public String say() { // 定义方法，返回自我介绍的字符串
        return "My name is " + name + ". I'm " + age + " years old."; // 返回拼接好的字符串
    }
}