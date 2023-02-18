public class LogicOperator02 {
    public static void main(String[] args) {
        //演示 ｜ || 使用
        // ||短路或 和 ｜逻辑或 案例演示
        // || 规则：两个条件中只要有一个成立，结果为true，否则为false
        // ｜ 规则：两个条件中只要有一个成立，结果为true，否则为false
        int age = 50;
        if (age > 20 || age < 50) {
            System.out.println("ok100");
        }

        //&逻辑与使用
        if (age >20 | age < 30) {
            System.out.println("ok200");
        }

        //区别
        // ||短路或：如果第一个条件为true，则第二个条件不会判断，最终结果为true，效率高
        // ｜逻辑或：如果第一个条件为true，
        int a = 4;
        int b = 9;
        if (a > 1 || ++b > 4) {
            System.out.println("ok300");
        }
        System.out.println("a" + a + "b" + b);// 4 9

        int c = 4;
        int d = 9;
        if (c > 1 || ++d > 4) {
            System.out.println("ok300");
        }
        System.out.println("c" + c + "d" + d);// 4 10

    }
}
