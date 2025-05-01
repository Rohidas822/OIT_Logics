
import java.util.Scanner;
public class Conver32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in metres: ");
        double metres = scanner.nextDouble();

        double kilometres = metres / 1000;

        System.out.printf("Distance in kilometres:km\n", kilometres);

        scanner.close();
    }
}