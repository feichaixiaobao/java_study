package com.hspedu.poly_.polyparameter_;

public class OrdinaryEmployee extends Employee {

    public OrdinaryEmployee(String name, double monthlySalary) {
        super(name, monthlySalary);
    }

    public void work() { // 工作方法
        System.out.println(getName() + " 正在工作。");
    }

    @Override
    public double getAnnual() { // 重写计算年工资的方法
        return getMonthlySalary() * 12;
    }
}
