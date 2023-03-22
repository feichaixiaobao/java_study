public class VarParameter01 {
    public static void main(String[] args) {
        HspMethod hspMethod = new HspMethod(); // 创建 HspMethod 类的实例
        System.out.println(hspMethod.sum(1, 2, 3, 4, 5)); // 调用 sum 方法，传递多个 int 类型的参数，并将返回值打印到控制台
        System.out.println(hspMethod.sum(1, 2, 5)); // 调用 sum 方法，传递多个 int 类型的参数，并将返回值打印到控制台
    }
}

class HspMethod {
    // 可变参数的方法，接受多个 int 类型的参数并返回它们的和
    public int sum(int... nums) {
        System.out.println("接受的参数个数=" + nums.length); // 打印接收到的参数个数
        int res = 0; // 定义一个变量来记录参数的总和
        for (int i = 0; i < nums.length; i++) { // 遍历数组，将每个参数累加到总和中
            res += nums[i];
        }
        return res; // 返回参数的总和
    }
}