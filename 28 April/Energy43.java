    

import java.util.Scanner;
public class Energy43 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter mass (in kg): ");
        double mass = scanner.nextDouble();

        System.out.print("Enter velocity (in m/s): ");
        double velocity = scanner.nextDouble();

        System.out.print("Enter height (in meters): ");
        double height = scanner.nextDouble();

        final double g = 9.8;  
        double kineticEnergy = 0.5 * mass * velocity * velocity;
        double potentialEnergy = mass * g * height;

        System.out.printf("Kinetic Energy: %.2f J\n", kineticEnergy);
        System.out.printf("Potential Energy: %.2f J\n", potentialEnergy);

        scanner.close();
    }
}