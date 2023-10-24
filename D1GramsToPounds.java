 public class D1GramsToPounds extends ConsoleProgram {

  public void run() {
    // Intializes Pounds
    double dblPounds;
      
    // Draws Header
    System.out.printf("%6s    %6s%n", "Grams", "Pounds");
    System.out.println("--------------------");
    
    //Prints Values
    for (int intGrams = 100; intGrams <= 1000; intGrams += 100){
     dblPounds = intGrams / 453.6;
     System.out.printf("%6d%10.4f%n", intGrams, dblPounds);
    }
  }
}