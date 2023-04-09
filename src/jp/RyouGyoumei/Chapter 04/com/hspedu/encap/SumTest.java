package com.hspedu.encap;

/**
 * 计算两个整数的和和差
 */
class Sum {
    private final int addend;
    private final int augend;

    /**
     * 构造函数
     *
     * @param addend 被加数
     * @param augend 加数
     */
    public Sum(int addend, int augend) {
        this.addend = addend;
        this.augend = augend;
    }

    /**
     * 计算两个整数的和
     *
     * @return 两个整数的和
     */
    public int calculateSum() {
        return addend + augend;
    }

    /**
     * 计算两个整数的差
     *
     * @return 两个整数的差
     */
    public int calculateMinus() {
        return addend - augend;
    }
}

/**
 * 测试 Sum 类
 */
public class SumTest {
    public static void main(String[] args) {
        Sum sum = new Sum(20, 20);

        System.out.println("sum=" + sum.calculateSum());
        System.out.println("minus=" + sum.calculateMinus());
    }
}
