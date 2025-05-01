    

import java.util.Scanner;
public class Cuboid48 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of the cuboid (in cm): ");
        double length = scanner.nextDouble();

        System.out.print("Enter width of the cuboid (in cm): ");
        double width = scanner.nextDouble();

        System.out.print("Enter height of the cuboid (in cm): ");
        double height = scanner.nextDouble();

        double volume = length * width * height;
        double surfaceArea = 2 * (length * width + length * height + width * height);

        System.out.printf("Volume of the cuboid: %.2f cubic cm\n", volume);
        System.out.printf("Surface area of the cuboid:  square cm\n", surfaceArea);

        scanner.close();
    }
}