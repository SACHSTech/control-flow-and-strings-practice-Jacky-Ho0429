import java.util.Random;

public class B2GuessingGame extends ConsoleProgram {
    public void run() {
        
        // Creates A Random Object
        Random myRandom = new Random();

        // Initializes Variables 2
        int intGuess = 0;
        int intNumber = myRandom.nextInt((100 - 1) + 1) + 1;

        // Gives User % Chances To Quess
        for (int count = 1; count <= 5; count++) {

            intGuess = readInt("What do you think the secret number is? ");

            if (intGuess > intNumber) {
                System.out.println("too high, guess again");
            }
            else if (intGuess < intNumber) {
                System.out.println("too low, guess again");
            }
            else {
                System.out.println("congratulations");
                break;
            }
        } 

        // Checks to See If The User Guess Correctly Or Not
        if (intNumber != intGuess) {
        System.out.println("Nice Try");
        }
    }
}