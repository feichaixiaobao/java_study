public class LogicOperator03 {
    public static void main(String[] args) {
        // int x = 5;
        // int y = 5;
        // if (x++ == 6 & ++y ==6) {
        //     x = 11;    
        // }
        // System.out.println("x=" + x + "\n" + "y=" + y);//6 6 

        // int x = 5;
        // int y = 5;
        // if (x++ == 6 && ++y ==6) {
        //     x = 11;    
        // }
        // System.out.println("x=" + x + "\n" + "y=" + y);//6 5 

        // int x = 5;
        // int y = 5;
        // if (x++ == 6 | ++y ==6) {
        //     x = 11;    
        // }
        // System.out.println("x=" + x + "\n" + "y=" + y);//11 6 

        int x = 5;
        int y = 5;
        if (x++ == 5 || ++y == 5 ) {
            x = 11;    
        }
        System.out.println("x=" + x + "\n" + "y=" + y);//11 5 
    }
}
