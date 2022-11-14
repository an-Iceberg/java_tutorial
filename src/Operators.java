package src;

public class Operators {
  public static void run() {
    System.out.println("  Operators".toUpperCase());

    // Good resource 🢂 https://www.programiz.com/java-programming/operators

    int x = 11;
    int y = 25;

    // Arithmetic operators
    // These expressions give some value in return
    System.out.println("x: "+x +" y:"+y);
    System.out.println("x + y: " + (x + y));
    System.out.println("x - y: " + (x - y));
    System.out.println("x * y: " + (x * y));
    System.out.println("x / y: " + (x / y));
    System.out.println("x % y: " + (x % y)); // Modulus/Remainder operator, returns the remainder of the division
    System.out.println("x ^ y: " + (x ^ y)); // XOR operator

    // Increment and decrement
    System.out.println("x: "+x +" y:"+y);
    System.out.println("x++: " + (x++)); // Increment done last
    System.out.println("y--: " + (y--)); // Decrement done last
    System.out.println("++x: " + (++x)); // Increment done first
    System.out.println("--y: " + (--y)); // Decrement doen first

    // Assignment operators
    y = 5;
    x += 3;
    y -= 3;
    x *= 3;
    y /= 3;
    x %= 3;

    /* {OPTIONAL} Bitwise operators */
    y &= 3;
    x |= 3;
    y ^= 3;
    x >>= 3;
    y <<= 3;

    // Comparison operators (return either true or false)
    System.out.println("x: "+x +" y:"+y);
    System.out.println("x == y: " + (x == y));
    System.out.println("x != y: " + (x != y));
    System.out.println("x > y: " + (x > y));
    System.out.println("x < y: " + (x < y));
    System.out.println("x >= y: " + (x >= y));
    System.out.println("x <= y: " + (x <= y));

    // Logical operators
    System.out.println("x: "+x +" y:"+y);
    System.out.println("x<5 && y<10: " + (x<5 && y<10));
    System.out.println("x<5 || y<10: " + (x<5 || y<10));
    System.out.println("!(x<5 && y<10): " + (!(x<5 || y<10)));

    // {OPTIONAL} Bitwise operators
    // The variable is taken as binary and then operated upon
    System.out.println("x: "+x +" y:"+y);
    System.out.println("~x: " + (~x));
    System.out.println("x << 2: " + (x << 2));
    System.out.println("y >> 3: " + (y >> 3));
    System.out.println("x >>> 5: " + (x >>> 5));
    System.out.println("x & y: " + (x & y));
    System.out.println("x | y: " + (x | y));

    // Ternary operator (basically a shorthand if)
    boolean result = x < 0 ? false : true;

    System.out.println(result);
  }
}
