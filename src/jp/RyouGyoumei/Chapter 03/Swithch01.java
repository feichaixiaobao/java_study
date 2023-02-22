import java.util.Scanner;
import java.util.myScanner;
public class Swithch01 {
    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in);
        System.out.println("请输入一个字符（a-g");
        char c1 = myScanner.next.charAt9();
        
        switch(c1){
            case 'a' :
            System.out.println("Monday");
            break;
            case 'b' :
            System.out.println("Tuesday");
            break;
            case 'c' :
            System.out.println("Wendnesday");
            break;
            case 'd' :
            System.out.println("Thursday");
            break;
            case 'e' :
            System.out.println("Friday");
            break;
            case 'f' :
            System.out.println("Saturday");
            break;
            case 'g' :
            System.out.println("Sunday");
            break;
        }

    }
}
