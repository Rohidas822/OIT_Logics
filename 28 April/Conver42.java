    

import java.util.Scanner;
public class Conver42 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        final double conversionRate = 83.50;

        
        System.out.print("Enter amount in US Dollars: ");
        double dollars = scanner.nextDouble();

        
        double rupees = dollars * conversionRate;

        
        System.out.printf("Equivalent amount in Indian Rupees: ₹%.2f\n", rupees);

        scanner.close();
    }
}

