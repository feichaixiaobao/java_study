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
    }
}
