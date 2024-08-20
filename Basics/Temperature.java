package Basics;

public class Temperature {
  public static void main(String[] args) {
    float tempC = 50f;
    float tempF = 50f;
    float tempF2 = (tempC * 9 / 5) + 32;
    float tempC2 = (tempF - 32) * 5 / 9;
    System.out.println(tempF2);
    System.out.println(tempC2);
  }
}
