import java.util.Scanner;

public class Game {
    private int correctAnswer;
    private int guess;
    private final int MINRANGE = 1;
    private final int MAXRANGE = 100;
    private boolean isCorrect = false;

    public Game(){}

    public void playGame() {

        System.out.println(
            "Guess a number between " + MINRANGE + " and " + MAXRANGE + ": ");

        correctAnswer = (int)((Math.random() * MAXRANGE) + MINRANGE);

        Scanner scanner = new Scanner(System.in);

        while (!isCorrect){

            guess = scanner.nextInt();

            if (guess > correctAnswer) {
                System.out.println("Your guess is too high, try again");

            } else if (guess < correctAnswer) {
                System.out.println("Your guess is too low, try again");

            } else {
                System.out.println(
                        "Congratulations, you guessed the number!");
                isCorrect = true;
            }
        }
    }
}
