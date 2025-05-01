import java.util.Scanner;

public class Mech22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter mass (kg): ");
        double mass = scanner.nextDouble();

        System.out.print("Enter height (m): ");
        double height = scanner.nextDouble();

        System.out.print("Enter velocity (m/s): ");
        double velocity = scanner.nextDouble();

        
        final double g = 9.8;

        
        double potentialEnergy = mass * g * height;
        double kineticEnergy = 0.5 * mass * velocity * velocity;
        double totalEnergy = potentialEnergy + kineticEnergy;

        
        System.out.printf("Total Mechanical Energy: %.2f Joules\n", totalEnergy);

        scanner.close();
    }
}










