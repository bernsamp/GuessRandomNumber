import java.util.Scanner;

public class Game {
    private int correctAnswer;
    private int guess;
    private final int MINRANGE = 1;
    private final int MAXRANGE = 100;
    private boolean isCorrect = false;
    private int counter;

    public Game(){}

    public void playGame() {

        System.out.println(
            "Guess a number between " + MINRANGE + " and " + MAXRANGE + ": ");

        correctAnswer = (int)((Math.random() * MAXRANGE) + MINRANGE);

        Scanner scanner = new Scanner(System.in);

        while (!isCorrect){

            guess = scanner.nextInt();
            counter++;

            if (guess > correctAnswer) {
                System.out.println("Your guess is too high, try again");

            } else if (guess < correctAnswer) {
                System.out.println("Your guess is too low, try again");

            } else {
                System.out.println(
                        "Congratulations, you guessed the number! It took you " + counter + " guesses.");
                isCorrect = true;
            }
        }

        if (counter == 1){
            System.out.println("Hole in one! You're a true mind reader. 6 stars");
        } else if (counter >= 2 && counter <= 5){
            System.out.println("Amazing! 5 stars");
        } else if (counter >= 6 && counter <= 10) {
            System.out.println("Well done sir! 4 stars");
        } else if (counter >= 11 && counter <= 15){
            System.out.println("That was okay... 3 stars");
        } else if (counter>=16 && counter <= 20){
            System.out.println("That's just too many guesses... 2 stars");
        } else {
            System.out.println("Maybe you should try another game... 1 star");
        }

        System.exit(0);
    }
}
