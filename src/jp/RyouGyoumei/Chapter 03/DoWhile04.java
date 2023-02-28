public class DoWhile04 {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 5 ==0 && i % 3 == 1) {
                System.out.println(i);
            }
            i++;
        } while (i <= 200);
    }
}
