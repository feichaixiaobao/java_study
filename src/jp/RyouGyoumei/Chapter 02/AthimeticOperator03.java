public class AthimeticOperator03 {
    public static void main(String[] args) {
        int i = 1;
        i = ++i;
        System.out.println(i);
        /*
         * 1) temp = i;
         * 2) i = i+1;
         * 3) i = temp;
         */
    }
}
