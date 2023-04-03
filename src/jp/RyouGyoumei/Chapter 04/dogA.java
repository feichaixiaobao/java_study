public class dogA {
    private String name;    // 名字
    private String color;   // 颜色
    private int age;        // 年龄

    public dogA(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void show() {
        System.out.println("这只狗狗的名字是" + this.name + "，颜色是" + this.color + "，年龄是" + this.age + "岁。");
    }
}

