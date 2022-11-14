package src;

public class Strings {
  public static void run() {
    System.out.println("  Strings".toUpperCase());

    // String is not a primitive datatype

    String sample_input = "       hello input\r\n";

    // This creates a String
    String message = "Hello World, how are you doing tonight?";

    // This creates a copy of some other string
    String message_copy = new String(message);

    System.out.println(message_copy.toLowerCase());
    System.out.println(message.toUpperCase());

    System.out.println("Without trim: "+sample_input);
    System.out.println("With trim: "+sample_input.trim());

    // Printing out the string letter by letter
    for (char letter : message.toCharArray()) {
      System.out.print(letter + ".");
    }

    System.out.println();

    // Separating the string by whitespace and printing it out
    for (String word : message.split(" ")) {
      System.out.print(word + ".");
    }

    System.out.println();

    // An alternative way to print a string letter by letter
    for (int i = 0; i < message.length(); i++) {
      System.out.print(message.charAt(i) + ".");
    }

    System.out.println();

    // Comparing two strings for equality
    System.out.println(message.equals(message_copy));
    System.out.println(message_copy.equals(sample_input));
    System.out.println("hello".equals("world"));

    System.out.println("Hello %name%!".replace("%name%", "John"));
  }
}
