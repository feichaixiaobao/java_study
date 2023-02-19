import javax.swing.plaf.synth.SynthOptionPaneUI;

public class If03 {
    public static void main(String[] args) {
        int x = 7;
        int y = 4;
        if (x > 5) {
            if (y > 5) {
                System.out.println(x + y);
            } else {
                System.out.println("welcom!");
            }
        }else
        System.out.println("x is" + x);
    }
}
