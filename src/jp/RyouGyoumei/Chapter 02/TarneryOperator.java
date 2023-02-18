public class TarneryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 99;
        int result = a > b ? a++ : b-- ;
        System.out.println("a=" + a + "\n" + "b=" + b);
        System.out.println("resulet=" + result);
    }
}
