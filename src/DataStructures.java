package src;

import java.util.ArrayList;

public class DataStructures {
  public static void run() {
    System.out.println("  Data Structures".toUpperCase());

    // There are many pre-defined data structures in java

    // Array
    // This is an array, it is the simplest data structure, it has a set lenght and is extremely efficient to work with because of that
    {
      // The size of an array is fixed and cannot be changed after initialization

      // This array has 5 elements set to '0'
      int[] array_of_ints = new int[5];

      for (int i = 0; i < array_of_ints.length; i++) {
        System.out.print(array_of_ints[i] + " ");
      }

      System.out.println();
    }

    // ArrayList<Type>
    // An ArrayList is like an array but resizable
    {
      ArrayList<Double> list_of_strings = new ArrayList<>(7);

      for (Double element : list_of_strings) {
        System.out.print(element + " ");
      }

      System.out.println();
    }
  }
}
