import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chances = 8;
        int finals = 0;
        boolean playAgain = true;
        System.out.println("Welcome Buddy!");
        System.out.println("Hey buddy you have about " + chances + " chances to win the game");
        while (playAgain) {
            int rand = getRandomNumber(1, 100);
            boolean guess = false;
            for (int i = 7; i < chances; i--) {
                System.out.println("Chance " + (i + 1) + " Enter your guess:");
                int user = sc.nextInt();
                if (user == rand) {
                    guess = true;
                    finals += 1;
                    System.out.println("You won it.");
                    break;
                } else if (user > rand) {
                    System.out.println("Too High");
                } else {
                    System.out.println("Too Low");
                }
            }
            System.out.println("Do you want to play again? (yes/no)");
            String input = sc.next();
            if (!input.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }
    }

    private static int getRandomNumber(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}