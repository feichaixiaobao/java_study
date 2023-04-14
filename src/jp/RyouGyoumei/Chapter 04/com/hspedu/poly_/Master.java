package com.hspedu.poly_;

// 主人类
class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void feed(Animal animal, Food food) {
        System.out.println(this.name + "给" + animal.getName() + "喂了" + food.getName() + "。");
    }
}
