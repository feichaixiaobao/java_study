public class LogicOperator01 {
    public static void main(String[] args) {
        //&&短路与 和 & 案例演示
        int age01 = 50;
        if (age01 > 20 && age01 < 90) {
            System.out.println("OK!-100");
        }

        //&逻辑与使用
        int age02 = 50;
        if (age02 > 20 & age02 <90) {
            System.out.println("OK!-200");
            
        }

        //区别
        int a = 4;
        int b = 9;
        //对于&&短路与而言，如果第一个条件为false，后面条件不再判断
        //对于&逻辑与而言，如果第一个条件为false，后面的条件仍然会判断
        if (a < 1 & ++b < 50) {
            System.out.println("ok300");
        }
        System.out.println("a=" + a + "\n" + "b=" + b);
    }
}
