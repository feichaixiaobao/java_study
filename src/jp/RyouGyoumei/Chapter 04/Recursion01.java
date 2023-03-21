/**
 * 递归示例代码
 */
public class Recursion01 {
    public static void main(String[] args) {
        T t1 = new T();
        t1.test(4); // 调用递归方法 test 输出结果
        int res = t1.factorial(5); // 调用阶乘方法 factorial 计算结果
        System.out.println("res=" + res);
    }
}

class T {
    /**
     * 递归方法，输出 n 及其后续数值
     * @param n 起始数值
     */
    public void test(int n) {
        if (n > 2) {
            test(n - 1);  // 递归调用自己
        }
        System.out.println("n=" + n);   
    }

    /**
     * 阶乘方法，计算 n 的阶乘
     * @param n 待计算的数值
     * @return 返回 n 的阶乘结果
     */
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }
}