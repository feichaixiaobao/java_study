public class AthimeticOperator05 {
    public static void main(String[] args) {
        //1.需求
        //假如还有59天放假，问：合XX个星期零xx天
        //2.思路分析
        //1） 使用int 变量 days 保存 天数
        //2） 一周为7天 星期数：days / 7 零xx天 days % 7
        //3.走代码

        int days = 59;
        int weeks = days / 7;
        int leftDays = days % 7;
        System.out.println(days + "days sum:" + weeks + "weeks" + leftDays + "days");

        //1.需求
        //定义一个变量保存华氏温度，华氏温度转换摄氏温度的公示为
        //：5/9*（华氏温度-100），请求出华氏温度对应的摄氏温度
        //
        //2.思路分析
        //1） 先定义一个double huaShi 变量保存 华氏温度
        //2） 根据给出的公式，进行计算即可5/9*（华氏温度-100）
        //3） 将得到的结果保存到double sheShi
        //
        //3.走代码
        double huaShi = 234.6;
        double sheShi = 5.0/9*(huaShi - 100); //注意类型转换问题
        System.out.println("华氏温度" + huaShi + "对应的摄氏温度=" + sheShi);
    }
}
