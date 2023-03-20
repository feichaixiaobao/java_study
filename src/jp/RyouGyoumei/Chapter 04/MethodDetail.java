public class MethodDetail {
    public static void main(String[] args) {
        AA arr = new AA(); // 创建一个AA类的实例对象arr
        int[] res = arr.getSumAndSub(1, 4); // 调用arr对象上的getSumAndSub()方法，并将1,4作为输入参数传入。将返回结果存储到名为res的整型数组中。
        System.out.println("Sum=" + res[0]); // 在控制台输出变量res中第一个元素的值，即输入参数的和
        System.out.println("Minus=" + res[1]); // 在控制台输出变量res中第二个元素的值，即输入参数的差
    }
}

class AA{
    public int[] getSumAndSub(int n1, int n2){ // 定义一个名为getSumAndSub()的公有方法，该方法接收两个整型参数n1和n2，并返回一个包含两个整型元素的数组
        int[] resArr = new int[2]; // 声明一个长度为2的整型数组，并赋值给名为resArr的变量
        resArr[0] = n1 + n2; // 将变量n1和n2的和存储到resArr数组中的第一个元素位置
        resArr[1] = n1 - n2; // 将变量n1和n2的差存储到resArr数组中的第二个元素位置
        return resArr; // 返回resArr数组作为该方法的返回值
    }

    public double f1() { // 定义一个名为f1()的公有方法，该方法返回一个双精度浮点数
        double d1 = 1.1 * 3; // 声明一个名为d1的双精度浮点数，并将1.1*3的结果赋值给它
        return d1; // 返回d1作为该方法的返回值
    }
}