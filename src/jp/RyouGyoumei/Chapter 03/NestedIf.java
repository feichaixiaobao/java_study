import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;;
public class NestedIf {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入成绩");
        double score = myScanner.nextDouble();

        if (score > 8.0) {
            System.out.println("进入决赛");
            char gender = myScanner.next().charAt(0);
            if ( gender == 'M') {
                System.out.println("进入男子组");
            }else if(gender == 'W'){ 
                System.out.println("进入女子组");
            }else {
                System.out.println("重新输入");
            }
        } else {
            System.out.println("淘汰");
        }
    }
}
