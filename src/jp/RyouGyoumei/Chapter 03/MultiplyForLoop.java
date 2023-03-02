import java.util.Scanner;

public class MultiplyForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_CLASSES = 3;
        final int NUM_STUDENTS = 5;
        double totalScore = 0;
        int passNum = 0;

        for (int i = 1; i <= NUM_CLASSES; i++) {
            double classSum = 0;
            for (int j = 1; j <= NUM_STUDENTS; j++) {
                System.out.println("请输入第" + i + "个班级的第" + j + "个学生的成绩：");
                double score = scanner.nextDouble();
                if (score >= 60) {
                    passNum++;
                }
                classSum += score;
                System.out.println("成绩为：" + score);
            }
            double classAvg = classSum / NUM_STUDENTS;
            System.out.println("班级" + i + "总分为：" + classSum + "，平均分为：" + classAvg + "，及格人数为：" + passNum);
            passNum = 0;  // 重置及格人数
            totalScore += classSum;
        }
        double avgScore = totalScore / (NUM_CLASSES * NUM_STUDENTS);
        System.out.println("总分为：" + totalScore + "，平均分为：" + avgScore);
    }
}
