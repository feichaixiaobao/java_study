import javax.xml.stream.events.StartDocument;

public class DoWhile04 {
    public static void main(String[] args) {
        int count = 0;
        int end = 200;
        int start = 1;
        int i = start;
        do {
            if (i % 5 ==0 && i % 3 != 0) {
                System.out.println(i);
                count ++;
            }
            i++;
        } while (i <= end);
        System.out.println("conunt=" + count);
    }
}
