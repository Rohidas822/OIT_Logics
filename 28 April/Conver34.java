import java.util.Scanner;

public class Conver34{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter Divisor: ");
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            int quotient = dividend / divisor;
            int remainder = dividend % divisor;

            System.out.println("Quotient = " + quotient);
            System.out.println("Remainder = " + remainder);
        }

        scanner.close();
    }
}
