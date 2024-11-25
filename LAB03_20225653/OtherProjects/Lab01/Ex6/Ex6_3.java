package Ex6;
import java.util.Scanner;

public class Ex6_3 {
  public static void main() {
    Scanner keyboard = new Scanner(System.in);
    int n = keyboard.nextInt();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 2 * n; j++) {
        if (j >= n - i && j <= n + i)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.print("\n");
    }
  }
}
