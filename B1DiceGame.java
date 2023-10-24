import java.util.Random;

public class B1DiceGame extends ConsoleProgram {
    public void run() {
        
        // Creates A Random Object
        Random myRandom = new Random();

        // Rolls A Number For The Dice
        int intDice1;
        int intDice2;

        for (int count = 0; count <= 100; count++) {

            // Rolls The Dices
            intDice1 = myRandom.nextInt((6 - 1) + 1) + 1;
            intDice2 = myRandom.nextInt((6 - 1) + 1) + 1;

            //Checks Sums To See What To Print
            if (intDice1 + intDice2 == 2) {
                System.out.println("snake eyes!");
            }
            else if (intDice1 + intDice2 == 7) {
                System.out.println("lucky seven");
            }
            else {
            }
        }
    }
}