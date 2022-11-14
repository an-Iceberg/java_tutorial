public class Variables {
  public static void run() {
    System.out.println("  Variables".toUpperCase());

    // ### These are known as "primitive types"

    // Initialization
    // Type name;
    int number;
    number = 10;

    // Declaration
    // Type name = value;
    float my_float = 34.65f; // The "f" at the end makes it a float

    // The "=" is known as the "assignment operator"

    // For characters Java uses single quotes (')
    char myCharacter = 'r';

    boolean amIStupid = true;

    System.out.println("number: "+number);
    System.out.println("my_float: "+my_float);
    System.out.println("myCharacter: "+myCharacter);
    System.out.println("amIStupid: "+amIStupid);

    /* ⚠️️ A String is NOT a primitive data type ️⚠️️ */

    // ### Type casting

    /**
     * Primitive number types can be categorized into following two categories:
     *
     * Whole numbers
     *   byte
     *   short
     *   int
     *   long
     *
     * Fractional numbers (numbers with decimal places)
     *   float
     *   double
     *
     * Types can be cast freely but ⚠ be aware of loss of data ⚠
     *
     * e.x.: casting from a float to a short will lose all the decimal places and some places before the comma
     */

    // Example cast with data loss (narrowing cast) (needs explicit syntax)
    number = (int) my_float;

    // Example cast without data loss (widening cast) (these types of casts are done automatically)
    short my_short = 29;
    my_float = my_short;
  }
}
