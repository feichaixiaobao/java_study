// public class WhileBreak {
//     public static void main(String[] args) {
//         double cash = 100000;
//         int count = 0;
//         while (true) {
//             if (cash > 50000) {
//                 cash *= 0.95;
//             }
//             else if (cash >= 1000 && cash <= 50000) {
//                 cash -= 1000;
//             } else if (cash < 1000){
//                 break;
//             }
//             count++;
//         }
//         System.out.println(count);
//     }
// }
public class WhileBreak {
    public static void main(String[] args) {
        double initialCash = 100000;
        double currentCash = initialCash;
        int transactionCount = 0;
        boolean continueInvesting = true;

        while (continueInvesting) {
            if (currentCash > 50000) {
                // 投资利润为 5%
                currentCash *= 0.95;
            } else if (currentCash >= 1000 && currentCash <= 50000) {
                // 进行投资
                currentCash -= 1000;
            } else {
                // 不足 1000 元，结束投资
                continueInvesting = false;
            }
            transactionCount++;
            // 如果余额非常接近零，我们就认为投资结束了
            if (Math.abs(currentCash) < 1000) {
                continueInvesting = false;
            }
        }

        System.out.println("Initial cash: " + initialCash);
        System.out.println("Final cash: " + currentCash);
        System.out.println("Number of transactions: " + transactionCount);
    }
}
