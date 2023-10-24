public class A1FreezingHot extends ConsoleProgram {
    public void run() {

        // Intializes Variable and Assigns Values Bsed On User Input
        int intTemp1 = readInt("What is the first temperature? ");
        int intTemp2 = readInt("What is the second temperature? ");
        
        // Creates A Boolean To See If It's Freezing Hot
        boolean blnFreezingHot = ((intTemp1 > 100 || intTemp2 > 100) && (intTemp1 < 0 || intTemp2 < 0));

        System.out.println(blnFreezingHot);
    }
}