import java.util.Scanner;

public class SwapUsingThirdVariable25{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        // Display before swapping
        System.out.println("\nBefore Swapping:");
        System.out.println("a = " + a + ", b = " + b);

        // Swap using third variable
        int temp = a;
        a = b;
        b = temp;

        // Display after swapping
        System.out.println("\nAfter Swapping:");
        System.out.println("a = " + a + ", b = " + b);

        scanner.close();
    }
}