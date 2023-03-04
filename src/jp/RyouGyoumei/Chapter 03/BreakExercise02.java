// import java.util.Scanner;
// public class BreakExercise02 {
//     public static void main(String[] args) {
//         //实现登陆验证，有3次机会，如果用户名为丁真，密码“666”提示登录成功
//         //否则提示还有几次机会，请使用for+break完成
//         //
//         //思路分析
//         //1. 创建Scanner 对象接受用户输入
//         //2. 定义String name ; String passwd ; 保存用户名和密码
//         //3. 最多循环3次（登陆3次），如果满足条件提前退出
//         //4. 定义一般变量int chance 记录还有几次登录机会

//         Scanner myScanner = new Scanner(System.in);
//         String name = "";
//         String passwd = "";
//         int chance = 3;
//         for (int i = 1; i <= 3; i++) {
//             System.out.println("请输入名字");
//             name = myScanner.next();
//             System.out.println("请输入密码");
//             passwd = myScanner.next();
//             if ("Tom".equals(name) && "666".equals(passwd)) {
//                 System.out.println("登录成功");
//                 break;
//             }
//             chance--;
//             System.out.println("你还有" + chance + "次登录机会");
//         }

//     }
// }

import java.util.Scanner;
public class BreakExercise02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String name = "";
        String passwd = "";
        int chance = 3;
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入名字");
            name = myScanner.nextLine();
            System.out.println("请输入密码");
            passwd = myScanner.nextLine();
            
            // 修复bug，例如用户名不是“Tom”，密码不是“666”，即会出错
            if ("Tom".equals(name) && "666".equals(passwd)) {
                System.out.println("登录成功");
                break;
            } else if (i == 3) { 
                System.out.println("登录失败");                  
            } else {
                chance--;
                System.out.println("你还有" + chance + "次登录机会");
            }
        }
    }
}
