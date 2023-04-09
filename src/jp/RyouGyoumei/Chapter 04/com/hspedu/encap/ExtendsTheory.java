package com.hspedu.encap;

public class ExtendsTheory {
    public static void main(String[] args) {
        
    }
}

class GrandPa {
    String name = "大头爷爷";
    String hobby = "钓鱼";
}

class Father extends GrandPa {
    String name = "大头爸爸";
    int age = 39;
}

class Son extends Father{
    String name = "大头儿子";
}