package src;

public class Functions {
  public static void run() {
    System.out.println("  Functions".toUpperCase());

    // Functions
    boolean someBool = someFuncion();

    System.out.println(someFuncion());

    // Scope (variable scope)
    {
      int my_number = 3434;
      System.out.println("my_number in first scope:" + my_number);
    }

    {
      int my_number = 19191;
      System.out.println("my_number in second scope:" + my_number);
    }

  }

  // Function declaration
  public static boolean someFuncion() {
    /* Function body */
    return false;
  }
}
