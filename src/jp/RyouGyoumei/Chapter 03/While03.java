public class While03 {
    public static void main(String[] args) {
        int j = 40;
        int Even = 200;
        int k = 2;
        while ( j <= Even ) {
            if ( j % k == 0 ) {
                System.out.println("j=" + j);
            }
            j++;
        }
    }
}
