// 它们的体重分别是3kg,5kg,1kg,3.4kg,2kg,50kg。
// 请问这六只鸡的总体重是多少？平均体重是多少？
// 思路分析
// 1.定义六个变量doub1e,求和得到总体重
// 2,平均体重=总体重/6

//传统实现的方式有什么问题，单独变量处理不适合大批量数据的处理和变化
//需要批量手动更改
// public class Array01{
//     public static void main(String[] args) {
//         double hen1 = 3;
//         double hen2 = 5;
//         double hen3 = 1;
//         double hen4 = 3.4;
//         double hen5 = 2;
//         double hen6 = 50;

//         double totalWeight = hen1 + hen2 + hen3 + hen4 + hen5 + hen6;

//         double avgWeight = totalWeight / 6;
//         System.out.println("总体重为" + totalWeight + "\n" + "平均体重为" + avgWeight);
//     }
// }

public class Array01 {
    public static void main(String[] args) {
        double[] hens = { 3, 5, 1, 3.4, 2, 50 };

        double totalWeight = 0;
        for (double weight : hens) {
            totalWeight += weight;
        }

        double avgWeight = totalWeight / hens.length;

        System.out.println("总体重为" + totalWeight + "\n" + "平均体重为" + avgWeight);
    }
}


