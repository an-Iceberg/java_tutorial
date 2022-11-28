package src;

public class Classes {
  public static void run() {
    System.out.println("  Classes".toUpperCase());

    // Type name = new Type();
    Color myColor = new Color(128, 23, 3000);
    myColor.print();

    Color myOtherColor = new Color(255, 255, 255);
    myOtherColor.setBlue(200);

    System.out.println("myColor.green():" + myColor.getGreen());

    myColor.setRed(255);

    myOtherColor.print(); // (255, 255, 200)

    System.out.println("myOtherColor.toString().charAt(3):"+myOtherColor.toString().charAt(3));

    System.out.println();

    Ampel ampelZHAW = Ampel.ROT;

    System.out.println(ampelZHAW);

    ampelZHAW = Ampel.GRÜN;

    switch (ampelZHAW) {
      case ROT: break;
      case GRÜN: break;
      case ROT_GELB: break;
      case GELB: break;

      default: break;
    }

  }
}
