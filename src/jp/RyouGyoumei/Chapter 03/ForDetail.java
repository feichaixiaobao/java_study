public class ForDetail {
    public static void main(String[] args) {
        //for(;循环判断条件;)
        //中的初始化和变量迭代可以写到其他地方，但是两边的分号不能省略

        //使用for循环控制
        // int i = 1;//循环变量初始化
        // for (; i <= 10;) {
        //     System.out.println("A" + i);
        //     i++;

        //     //补充
        //     for (;;) {  //表示一个无限死循环
    
        //         System.out.println("Yes");
        //     }

            //循环初始值可以有多条初始化语句，但要求类似一样，
            //并且中间用逗号离开，循环变量迭代也可以有多条变量

            int count = 3;
            for (int a = 0, j = 0; a < count; a++, j += 2 ) {
                System.out.println("i=" + a + "j=" + j);
            }
        }
    }

