public class Color {
  private int red;
  private int green;
  private int blue;

  /* Default constructor */
  public Color() {}

  public Color(int red, int green, int blue) {
    red = checkColorValidity(red);
    green = checkColorValidity(green);
    blue = checkColorValidity(blue);

    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  private int checkColorValidity(int color) {
    if (color < 0 || color > 255) {
      System.out.println("Invalid color value");
      return 0;
    }

    return color;
  }

  /* Getters */
  public int getRed() {
    return this.red;
  }

  public int getGreen() {
    return this.green;
  }

  public int getBlue() {
    return this.blue;
  }

  /* Setters */
  public void setRed(int colorValue) {
    colorValue = this.checkColorValidity(colorValue);

    this.red = colorValue;
  }

  public void setGreen(int colorValue) {
    colorValue = this.checkColorValidity(colorValue);

    this.green = colorValue;
  }

  public void setBlue(int colorValue) {
    colorValue = this.checkColorValidity(colorValue);

    this.blue = colorValue;
  }

  public void print() {
    System.out.printf("(%d, %d, %d)\n", this.red, this.green, this.blue);
  }

  public String toString() {
    return String.format( "(%d, %d, %d)", this.red, this.green, this.blue);
  }
}
