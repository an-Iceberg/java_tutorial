public class Main {
  public static void main(String[] args) {
    // Typ name;
    double bigNumber; // Initialisation
    bigNumber = 123;

    // Typ name = value;
    int someInt = 10; // Declaration

    char letter = 'r';

    boolean someBool = false;

    String myText = "Hello";

    if (someInt % 2 == 0) // wird als boolean ausgewertet
    {
      System.out.println("number is even");
    }

    someInt = someInt + 29;

    bigNumber = bigNumber - someInt;

    someInt = (int) bigNumber / someInt;

    someInt = someInt + 24;
    someInt += 24; // -= /= *=

    int i = 1;

    i = i + 1; // Increment
    i = i - 1; // Decrement

    i++; // Done last
    i--; // Done last
    ++i; // Done first
    --i; // Done first

    someInt = someInt - ++i;

    boolean someOtherBool = bigNumber == 23.35;
    someOtherBool = bigNumber > 23.354;
    someOtherBool = bigNumber >= 23.354;
    someOtherBool = (bigNumber != 45.98) == !(bigNumber == 45.98);

    // Statement (wird ausgeführt)
    System.out.println("Hello World");

    // Expression (wird evaluiert/ausgewertet)
    boolean a = (i - someInt) > (bigNumber - 100);

    int age = 23;

    // Branching / Verzweigung
    if (age > 18) {
      System.out.println("You can drink");
    } else {
      System.out.println("You are not old enough");
    }

    String weekday = "Wednesday";

    if (weekday == "Wednesday") {
      // statements
    } else if (weekday == "Monday") {
      // statements
    } // etc.

    switch (weekday) {
      case "Wednesday": /* statements */ break;
      case "Monday": /* statements */ break;
      // etc.

      default: break;
    }

    switch (someInt) {
      case 1:
      case 2:
      case 3:
        /* statemetns */
      break;

      default: break;
    }

    // Loops
    int[] someArray = {1, 54, 12, 358, 716, 2376, 243};

    // Known number of iterations
    for (int controlVariable = 0; controlVariable < someArray.length; controlVariable++) {
      System.out.println(someArray[controlVariable]);
    }

    for (int element : someArray) {
      System.out.println(element);
    }

    // Unknown number of iterations
    while (someBool) {
      if (someFuncion()) {
        break;
      }
    }
  }
}