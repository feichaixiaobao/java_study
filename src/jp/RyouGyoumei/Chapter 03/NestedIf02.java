import java.util.Scanner;;
public class NestedIf02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入月份：");
        int mounth = myScanner.nextInt();
        System.out.println("请输入年龄：");
        int age = myScanner.nextInt();

        if (3 < mounth && mounth< 11) {
            if ( 0 < age && age < 18) {
                System.out.println("票价：半价");
            } else if ( 17 < age && age < 61){
                System.out.println("票价：60");
            }
            else if ( 60 < age ){
                System.out.println("票价：1/3");
            }
        } else {
            if ( 17 < age && age < 61){
                System.out.println("票价：40");
            }
            else {
                System.out.println("票价：20");
            }
        }
    }
}
