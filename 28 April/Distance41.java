    
import java.util.Scanner;
public class Distance41 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance between two cities in kilometers: ");
        double kilometers = scanner.nextDouble();

        double meters = kilometers * 1000;
        double centimeters = kilometers * 100000;

        System.out.printf("Distance in meters: %.cm m\n", meters);
        System.out.printf("Distance in centimeters:  cm\n", centimeters);

        scanner.close();
    }
}