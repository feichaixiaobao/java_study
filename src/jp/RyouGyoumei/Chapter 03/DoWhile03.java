public class DoWhile03 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int end = 100;
        do {
            sum = sum + i;
            System.out.println(sum);
            i++;
        } while (i <= end);
    }
}
