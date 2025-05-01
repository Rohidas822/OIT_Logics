    

import java.util.Scanner;

public class Reverse35 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a four-digit number: ");
        int number = scanner.nextInt();

        
        if (number < 1000 || number > 9999) {
            System.out.println("Error: Please enter a valid four-digit number.");
        } else {
            
            int reverse = 0;
            while (number != 0) {
                int digit = number % 10;  
                reverse = reverse * 10 + digit;  
                number = number / 10;  
            }

            
            System.out.println("Reversed number: " + reverse);
        }

        scanner.close();
    }
}