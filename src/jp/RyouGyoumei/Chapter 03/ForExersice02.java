public class ForExersice02 {
    public static void main(String[] args) {
        int start = 0;
        int end = 5;
        int i = start;
        int j = end;
        int sum = 0;

        for (i = start; i <= end; i++,j--){
            sum = i + j ;
            System.out.println(i + "+" + j + "=" + sum);
        }
    }
}
