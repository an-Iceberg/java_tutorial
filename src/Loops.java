package src;

public class Loops {
  public static void run() {
    System.out.println("  Loops".toUpperCase());

    // Loops
    int[] someArray = {1, 54, 12, 358, 716, 2376, 243};

    String anotherString = new String("My fancy new string");

    // Known number of iterations
    for (int controlVariable = 0; controlVariable < someArray.length; controlVariable++)
    {
      anotherString = "lafdjökla";
      System.out.println(someArray[controlVariable]);

      System.out.println(anotherString);
    }

    for (int element : someArray) {
      System.out.println(element);
    }

    // Unknown number of iterations
    while (true) {
      if (!False()) {
        break;
      }
    }
  }

  public static boolean False() {
    return false;
  }
}
