public class AthimeticOperator {
    public static void main(String[] args) {
        System.out.println(10/4);
        double d = 10 / 4;
        System.out.println(d);
        System.out.println(10.0 / 4);

        System.out.println(10 % 3);
        System.out.println(-10 % 3);
        System.out.println(10 % -3);
        System.out.println(-10 % -3);
        // 在%的本质 看一个公式 a % b = a - a / b * b

        int i = 10;
        i++;//自增 等价于 i = i + 1； =>  i = 11
        ++i;//自增 等价于 i = i + 1； => i =12
        /*
         * 作为表达式使用
         * 前++ ：++i先自增后赋值
         * 后++ ：i++先赋值后自增
         */
        int j = 8;
        int k = j++;

        System.out.println("k=" + k + "j+" + j);
        System.out.println("i=" + i);
    }
}
