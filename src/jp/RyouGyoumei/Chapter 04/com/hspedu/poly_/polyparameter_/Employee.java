package com.hspedu.poly_.polyparameter_;

public abstract class Employee {
    private String name; // 姓名
    private double monthlySalary; // 月工资

    public Employee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public abstract double getAnnual(); // 计算年工资的方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}