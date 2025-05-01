import java.util.Scanner;

public class Salary24{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        
        double hra = 0.20 * basicSalary;
        double ta = 0.10 * basicSalary;
        double da = 0.15 * basicSalary;

        
        double grossSalary = basicSalary + hra + ta + da;

        
        System.out.println("\n--- Salary Details ---");
        System.out.printf("Basic Salary: %.2f\n", basicSalary);
        System.out.printf("HRA (20%%): %.2f\n", hra);
        System.out.printf("TA (10%%): %.2f\n", ta);
        System.out.printf("DA (15%%): %.2f\n", da);
        System.out.printf("Gross Salary: %.2f\n", grossSalary);

        scanner.close();
    }
}