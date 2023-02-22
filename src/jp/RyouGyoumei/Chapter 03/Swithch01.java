import java.util.Scanner;
public class Swithch01 {
    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in);
        System.out.println("请输入一个字符（a-g）");
        String input = myScanner.next();
        if (input.length() != 1 || input.charAt(0) < 'a' || input.charAt(0) > 'g') {
            System.out.println("非法输入");
            return;
        }
        char c1 = input.charAt(0);
        
        switch(c1){
            case 'a' :
                System.out.println("Monday");
                break;
            case 'b' :
                System.out.println("Tuesday");
                break;
            case 'c' :
                System.out.println("Wednesday");
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

            default:
                System.out.println("Erro!type again!");
                break;
        }
        System.out.println("game over");
    }
}
