public class MethodParameter04 {
    public static void main(String[] args) {
        // 创建一个Person01对象
        Person01 p = new Person01();
        // 为Person01对象设置name属性值
        p.setName("Tom");

        // 创建一个myTools02对象
        myTools02 tools = new myTools02();
        // 调用myTools02对象的copyPerson方法，将p作为参数传递，并将返回结果赋值给p2变量
        Person01 p2 = tools.copyPerson(p);

        // 输出p对象的name属性值
        System.out.println(p.getName());
        // 输出p2对象的name属性值
        System.out.println(p2.getName());
    }
}

// 定义一个Person01类
class Person01 {
    private String name;

    // 获取name属性值
    public String getName() {
        return name;
    }

    // 设置name属性值
    public void setName(String name) {
        this.name = name;
    }
}

// 定义一个myTools02类
class myTools02{
    // 定义一个copyPerson方法，用于复制Person01对象
    public Person01 copyPerson(Person01 p) {
        // 创建一个新的Person01对象
        Person01 p2 = new Person01();
        // 将传入的Person01对象p的name属性值复制给新创建的Person01对象p2的name属性值
        p2.setName(p.getName());
        // 返回新创建的Person01对象p2
        return p2;
    }
}