public class C1BackToBack extends ConsoleProgram {
    public void run() {
        
        //Initializes Variables
        String strUser;

        //Receives User Input
        strUser = readLine("What word would you like to make back to back? ");

        //Prints Out BackToBack Word
        System.out.println(strUser.substring(strUser.length() - 1) + strUser + strUser.substring(strUser.length() - 1));
    }
}