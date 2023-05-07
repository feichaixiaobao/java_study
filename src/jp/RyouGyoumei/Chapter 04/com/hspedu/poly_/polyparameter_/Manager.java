package com.hspedu.poly_.polyparameter_;

public class Manager extends Employee {
    private double bonus; // 奖金

    public Manager(String name, double monthlySalary, double bonus) {
        super(name, monthlySalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void manage() { // 管理方法
        System.out.println(getName() + " 正在管理团队。");
    }

    @Override
    public double getAnnual() { // 重写计算年工资的方法
        return getMonthlySalary() * 12 + bonus;
    }
}