public class Branching {
  public static void run() {
    System.out.println("  Branching".toUpperCase());

    int my_number = 10;

    // If statements
    // The expression in the () is evaluated for true
    if (my_number > 10) {
      System.out.println("my_number is larger than 10");
    }

    if (my_number < 10) {
      System.out.println("my_number is smaller than 10");
    } else {
      System.out.println("else branch");
    }

    if (my_number < 0) {
      System.out.println("my_number is negative");
    } else if (my_number > 0 && my_number < 10) {
      System.out.println("my_number is between 0 and 10");
    } else {
      System.out.println("my_number is larger than 10");
    }

    // Switch statements
    // Old switch
    switch (my_number) {
      case 5:
        System.out.println(5);
      break;

      case 10:
        System.out.println(10);
      break;

      case 15:
        System.out.println(15);
        my_number = 10;
      break;

      default:
        System.out.println("Not a Number");
      break;
    }

    // Upgraded switch
    switch (my_number) {
      case 1,3,5,7,9,11,13,15:
        System.out.println("my_number is odd");
      break;

      case 2,4,6,8,10,12,14:
        System.out.println("my_number is even");
      break;

      default:
        System.out.println("out of range");
      break;
    }

    // Upgraded switch can return something (don't forget the ; at the end)
    int return_value = switch (my_number) {
      case 10:
      yield 20;

      default:
      yield 0;
    };

    // Switch with arrows
    switch (my_number) {
      case 10 -> System.out.println(10 + "!!");
      case 20 -> System.err.println("Something went wrong");
      case 30 -> {
        System.out.println("+--+--*");
        System.out.println("|  |  |");
        System.out.println("+--+--*");
      }
    }

    System.out.println(return_value);
  }
}
