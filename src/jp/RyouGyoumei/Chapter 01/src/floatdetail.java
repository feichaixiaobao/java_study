public class floatdetail {

    public static void main(String[] args) {
        double num11 = 2.7;
        double num12 = 2.7;
        System.out.println(num11);
        System.out.println(num12);

        if ( num11 == num12) {
            System.out.println("num11 == num12 相等");
        }

        if (Math.abs(num11 - num12) < 0.000001 ) {
            System.out.println("差值非常小，到我的规定精度，认为相等");
            
        }

        System.out.println(Math.abs(num11 - num12));
    }
    
}

