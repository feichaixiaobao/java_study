public class AthimeticOperator02 {
    public static void main(String[] args) {
        int i =1;
        i = i++;
        System.out.println(i);
        /*
         * 规则使用临时变量：
         * 1） temp = i;
         * 2)  i = i + 1;
         * 3)  i = temp;
         */
    }
}
