    

import java.util.Scanner;
public class Area45 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of the cylinder (in cm): ");
        double radius = scanner.nextDouble();

        System.out.print("Enter height of the cylinder (in cm): ");
        double height = scanner.nextDouble();

        double surfaceArea = 2 * Math.PI * radius * (radius + height);

        System.out.printf("Surface area of the cylinder:  square cm\n", surfaceArea);

        scanner.close();
    }
}
