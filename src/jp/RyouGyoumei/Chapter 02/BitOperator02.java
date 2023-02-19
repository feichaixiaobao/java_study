public class BitOperator02 {
    public static void main(String[] args) {
        int a = 1>>2;
        int c = 1<<2;
        System.out.println("a=" + a);//1 => 00000001 => 00000000 本质 1/2/2 = 0
        System.out.println("c=" + c);//1 =》 00000001 =。 00000100 本质 1*2*2 = 4

        System.out.println(-10.5%3);
    }
}
