

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of interest (in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();

        
        double simpleInterest = (principal * rate * time) / 100;

        
        double amount = principal * Math.pow((1 + rate / 100), time);
        double compoundInterest = amount - principal;

        
        System.out.printf("Simple Interest: %.2f\n", simpleInterest);
        System.out.printf("Compound Interest: %.2f\n", compoundInterest);

        scanner.close();
    }
}
