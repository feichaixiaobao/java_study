import java.util.Scanner;
public class Swithch02 {
    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in);
        System.out.println("请输入一个字符");
        String input = myScanner.next();
        if (input.length() != 1 ) {
            System.out.println("Type again!");
            return;
        }
        char c1 = input.charAt(0);
        
        switch(c1){
            case 'a' :
                System.out.println("A");
                break;
            case 'b' :
                System.out.println("B");
                break;
            case 'c' :
                System.out.println("C");
                break;
            case 'd' :
                System.out.println("D");
                break;
            case 'e' :
                System.out.println("E");
                break;
            default:
                System.out.println("oyher");
                return;
        }
        System.out.println("game over");
    }
}
