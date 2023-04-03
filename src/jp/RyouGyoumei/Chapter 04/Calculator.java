public class Calculator {
    private double operand1; // 操作数1
    private double operand2; // 操作数2

    public Calculator(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public double add() { // 求和
        return operand1 + operand2;
    }

    public double subtract() { // 求差
        return operand1 - operand2;
    }

    public double multiply() { // 求积
        return operand1 * operand2;
    }

    public double divide() { // 求商
        if (operand2 == 0) {
            System.out.println("错误：除数不能为零");
            return 0;
        } else {
            return operand1 / operand2;
        }
    }
}
