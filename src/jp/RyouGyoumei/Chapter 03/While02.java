public class While02 {
    public static void main(String[] args) {
        //打印1-100之间能够被3整除的所有数
        int i = 1;
        int endNum = 100;
        while( i <= endNum){
            if( i % 3 == 0){
                System.out.println("i=" + i);
            }
            i++;
        }
    }
}





