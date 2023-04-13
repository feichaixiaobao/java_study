package com.hspedu.override_;

// 测试类
public class OverrideExercise {
    public static void main(String[] args) {
        // 创建Person对象并调用say方法输出自我介绍
        Person person = new Person("Tom", 20); // 创建Person对象，并初始化name和age属性
        System.out.println(person.say()); // 调用say方法输出自我介绍

        // 创建Student对象并调用say方法输出自我介绍
        Student student = new Student("Mary", 18, 20230001, 90); // 创建Student对象，并初始化name、age、id和score属性
        System.out.println(student.say()); // 调用say方法输出自我介绍
    }
}