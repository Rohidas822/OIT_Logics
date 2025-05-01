import java.util.Scanner;

public class Conver29  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in kilometres: ");
        double kilometres = scanner.nextDouble();

        double metres = kilometres * 1000;

        System.out.printf("Distance in metres: %.2f m\n", metres);

        scanner.close();
    }
}
