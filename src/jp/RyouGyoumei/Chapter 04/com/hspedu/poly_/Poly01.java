package com.hspedu.poly_;

// 主类
public class Poly01 {
    public static void main(String[] args) {
        Master master = new Master("张三");
        Animal cat = new Cat("猫猫");
        Animal dog = new Dog("狗狗");
        Animal pig = new Pig("猪猪");
        Food fish = new Fish("鱼肉");
        Food bone = new Bone("骨头");
        Food rice = new Rice("米饭");

        master.feed(cat, fish);
        master.feed(dog, bone);
        master.feed(pig, rice);
    }
}