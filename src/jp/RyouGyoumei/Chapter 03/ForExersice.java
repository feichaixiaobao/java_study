public class ForExersice {
    public static void main(String[] args) {
        //打印1～100之间所有是9的倍数的整数，统计个数及总和【化繁为简，先死后活】
        //老韩的编程思维（❤️技巧）
        //1. 化繁为简 ： 即将复杂的需求，拆解为简单的需求， 逐步完成
        //2. 先死后活 ： 先考虑固定的值，然后转为可以灵活变化的值
        //
        //思路分析
        //打印1～100之间所有是9的倍数的整数
        //化繁为简
        //1)    完成 输出 1～100的值
        //2)    在输出的过程中，进行过滤，只输出9的倍数的整数
        //3)    统计个数，定义一个变量 int count = 0;当条件满足时，count++；
        //4)    总和，定义一个变量 int sum = 0; 当条件满足时， sum += i;

        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i%9 == 0) {
                count++;
                sum += i;
                System.out.println(i + "\t有" + count + "个9的倍数的整数");
            }
        }
        System.out.println("count = " + count + "\nsum = " + sum);
    }
}
