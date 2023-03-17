import java.util.Random; // 导入Random类

public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = new int[10]; // 定义长度为10的整型数组
        Random random = new Random();  // 创建Random对象

        // 遍历数组并生成随机整数，将其赋值给数组元素
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1100);  // 生成0~1099之间的随机整数，并赋值给数组元素
        }
    
        // 倒序打印数组元素
        System.out.println("数组倒序输出为：");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");  // 打印当前数组元素
        }
        System.out.println();  // 换行
    
        // 求平均值
        int sum = 0;  // 定义总和变量，并初始化为0
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];  // 将当前元素的值加入总和
        }
        double avg = sum / (double) arr.length;  // 计算平均值，注意要强制类型转换
        System.out.println("数组平均值为：" + avg);
    
        // 求最大值及其下标
        int max = arr[0];  // 定义最大值变量，并初始化为第一个元素的值
        int maxIndex = 0;  // 定义最大值下标变量，并初始化为0
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {  // 如果当前元素比最大值还大
                max = arr[i];  // 将最大值更新为当前元素的值
                maxIndex = i;  // 将最大值下标更新为当前元素的下标
            }
        }
        System.out.println("数组最大值为：" + max + "，最大值的下标为：" + maxIndex);
    
        // 查找是否包含某个元素
        int target = 8;  // 定义待查找的目标元素
        boolean contains = false;  // 定义是否包含目标元素的变量，并初始化为false
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {  // 如果当前元素等于目标元素
                contains = true;  // 将包含变量更新为true
                break;  // 退出循环
            }
        }
        if (contains) {
            System.out.println("数组包含元素" + target);
        } else {
            System.out.println("数组不包含元素" + target);
        }
    }
    
}
