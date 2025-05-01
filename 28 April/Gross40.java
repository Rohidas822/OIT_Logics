    

import java.util.Scanner;
public class Gross40 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Rajesh's basic salary: ");
        double basicSalary = scanner.nextDouble();

        double da = 0.40 * basicSalary; 
        double hra = 0.20 * basicSalary;
        double grossSalary = basicSalary + da + hra;

        System.out.printf("Basic Salary: %.2f\n", basicSalary);
        System.out.printf("D.A. (40%%): %.2f\n", da);
        System.out.printf("H.R.A. (20%%): %.2f\n", hra);
        System.out.printf("Gross Salary: %.2f\n", grossSalary);

        scanner.close();
    }
}