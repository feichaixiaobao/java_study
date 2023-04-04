public class Main02 {
    public static void main(String[] args) {
        Tom tom = new Tom();

        for (int i = 0; i < 10; i++) {
            tom.play();
        }

        tom.printRecord();
    }
}
