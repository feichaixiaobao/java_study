public class VarParameterExercise {
    public static void main(String[] args) {
        HspMethod01 hm = new HspMethod01();
        System.out.println(hm.showScore("Tom", 90.5, 90.8, 90.2));
    }
}

class HspMethod01 {
    // 定义showScore方法，接受一个字符串类型的name和可变长的double类型的成绩数组scores
    public String showScore(String name, double... scores) {
        double totalScore = 0; // 声明并初始化总分为0
        for (int i = 0; i < scores.length; i++) { // 循环遍历scores数组
            totalScore += scores[i]; // 把每个成绩累加到总分上
        }
        return name + "有" + scores.length + "门课程，成绩总分为=" + totalScore; // 返回结果字符串
    }
}