package com.hspedu.poly_.polyparameter_;

public class TestEmployee {

    public static void main(String[] args) {
        OrdinaryEmployee oe = new OrdinaryEmployee("Alice", 5000);
        Manager m = new Manager("Bob", 10000, 20000);

        showEmpAnnual(oe);
        showEmpAnnual(m);

        testWork(oe);
        testWork(m);
    }

    // 显示员工年工资的方法
    public static void showEmpAnnual(Employee e) {
        System.out.println("年工资 " + e.getName() + ": " + e.getAnnual());
    }

    // 测试工作方法，根据员工类型调用不同方法
    public static void testWork(Employee e) {
        if (e instanceof OrdinaryEmployee) {
            ((OrdinaryEmployee) e).work();
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        }
    }
}
