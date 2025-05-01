    

import java.util.Scanner;
public class Mean44 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        if (a + b == 0) {
            System.out.println("Error: Arithmetic and Harmonic mean undefined for inputs summing to zero.");
        } else {
            double arithmeticMean = (a + b) / 2;

            double harmonicMean = (2 * a * b) / (a + b);

            System.out.printf("Arithmetic Mean: %.2f\n", arithmeticMean);
            System.out.printf("Harmonic Mean: %.2f\n", harmonicMean);
        }

        scanner.close();
    }
}