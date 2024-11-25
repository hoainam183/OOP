package Lab01.Ex6.JavaBasics.src;
import java.util.Scanner;

public class InputFormKeyboard {
  public static void main(String[] args)  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("What's your anme?");
    String strName = keyboard.nextLine();

    System.out.println("How old are you");
    int iAge = keyboard.nextInt();

    System.out.println("How tall are you(m)? ");
    double height = keyboard.nextDouble();

    System.out.println("Mrs/Ms. " + strName + ", " + iAge + " years old."
      + "Your height is " + height + "."
    );
  }
}
