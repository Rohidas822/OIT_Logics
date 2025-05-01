    

import java.util.Scanner;
public class Conver49 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double kelvin = celsius + 273.15;

        System.out.printf("Temperature in Kelvin: %.2f K\n", kelvin);

        scanner.close();
    }
}