public class BreakDetail {
    public static void main(String[] args) {
        lable1:
        for (int i = 0; i < 4; i++) {
            label2:
                for (int j = 0; j <= 10; j++) {
                    if (i == 2) {
                        break lable1;
                    }
                    System.out.println("i=" + i);
                }
        }
    }
}
