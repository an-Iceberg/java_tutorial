package src;

public class Statement_vs_Expression {
  public static void run() {
    System.out.println("  Statements ".toUpperCase() + "vs" + " Expressions".toUpperCase());

    int x = 5;
    int y = 10;
    int z;

    // Expressions
    // An expression returns a value
    z = x + y; // Here, "x + y" is an expression because it returns whatever x + y is (in this case 15)

    // Everything between the "if" and the " {" is an expression because it returns a boolean value
    if ((x + y) > z || (x < z && y < z)) {
      /* do something */
    }

    // Statements
    // A statement does something
  }
}
