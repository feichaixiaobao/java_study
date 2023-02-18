public class InnverseOperator {
    public static void main(String[] args) {
        // ! 和 ^ 案例演示
        // ! 操作时取反 T->F F->T
        System.out.println(60 > 20);
        System.out.println(!(60 > 20));

        //a^b: 逻辑异或，当a和b不同时，则结果为true
        boolean b = (10 > 1) ^ (3 > 5);
        System.out.println("b=" + b);
    }
}
