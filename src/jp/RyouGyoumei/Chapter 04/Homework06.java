public class Homework06 {
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator(5, 2);
        Calculator calculator2 = new Calculator(8, 0);

        System.out.println("Calculator 1:");
        System.out.println("Add: " + calculator1.add());
        System.out.println("Subtract: " + calculator1.subtract());
        System.out.println("Multiply: " + calculator1.multiply());
        System.out.println("Divide: " + calculator1.divide());

        System.out.println("Calculator 2:");
        System.out.println("Add: " + calculator2.add());
        System.out.println("Subtract: " + calculator2.subtract());
        System.out.println("Multiply: " + calculator2.multiply());
        System.out.println("Divide: " + calculator2.divide());
    }
}