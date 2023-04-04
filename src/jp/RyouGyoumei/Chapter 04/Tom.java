import java.util.Random;
import java.util.Scanner;

public class Tom {
    private int winCount;
    private int loseCount;
    private int drawCount;

    public Tom() {
        this.winCount = 0;
        this.loseCount = 0;
        this.drawCount = 0;
    }

    public void play() {
        System.out.println("Tom is playing rock-paper-scissors with the computer.");

        Scanner scanner = new Scanner(System.in);
        int tomGesture = -1;
        while (tomGesture < 0 || tomGesture > 2) {
            System.out.print("Please enter your gesture (0 for rock, 1 for scissors, 2 for paper): ");
            tomGesture = scanner.nextInt();
            if (tomGesture < 0 || tomGesture > 2) {
                System.out.println("Invalid input, please try again.");
            }
        }
        System.out.print("Tom's gesture: ");
        switch (tomGesture) {
            case 0:
                System.out.println("rock");
                break;
            case 1:
                System.out.println("scissors");
                break;
            case 2:
                System.out.println("paper");
                break;
        }

        Random random = new Random();
        int computerGesture = random.nextInt(3);
        System.out.print("Computer's gesture: ");
        switch (computerGesture) {
            case 0:
                System.out.println("rock");
                break;
            case 1:
                System.out.println("scissors");
                break;
            case 2:
                System.out.println("paper");
                break;
        }

        if (tomGesture == computerGesture) {
            System.out.println("Draw!");
            drawCount++;
        } else if ((tomGesture == 0 && computerGesture == 1) ||
                (tomGesture == 1 && computerGesture == 2) ||
                (tomGesture == 2 && computerGesture == 0)) {
            System.out.println("Tom wins!");
            winCount++;
        } else {
            System.out.println("Tom loses!");
            loseCount++;
        }
    }

    public void printRecord() {
        System.out.println("Tom's record: wins - " + winCount +
                ", loses - " + loseCount +
                ", draws - " + drawCount);
    }
}
