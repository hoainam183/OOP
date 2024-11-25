package Lab01.Ex6.JavaArray.src;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int sum = 0;
        int[] a = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = keyboard.nextInt();
        }
        
        Arrays.sort(a);

        for(int i = 0; i < n; i++ ) {
            System.out.print(a[i] + " ");
            sum += a[i];
        }

        double average = (double)sum / (double)n;

        System.out.print("\n" + average + "\n");
    }
}
