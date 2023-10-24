public class C2EveryNth extends ConsoleProgram {
    public void run() {
        
        //Initializes Variables
        String strUser;
        int intN;

        //Receives User Input
        strUser = readLine("What Is Your Word? ");
        intN = readInt("What Number Will You Choose? ");

        //Prints Out The Word
        System.out.println(strUser);

        //Prints Out The Number
        System.out.println(intN);

        //Prints Out Every Nth Word
        for (int count = 0; count < strUser.length(); count +=intN ) {
            System.out.print(strUser.charAt(count));
        }
    }
}
