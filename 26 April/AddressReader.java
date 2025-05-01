
    
import java.util.Scanner;

public class AddressReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for address input
        System.out.println("Enter your address :");

        StringBuilder address = new StringBuilder();
        String line;

        while (true) {
            line = scanner.nextLine();
            if (line.equalsIgnoreCase("END")) {
                break;
            }
            address.append(line).append("\n");
        }

        // Display the address
        System.out.println("\n--- Your Address ---");
        System.out.println(address.toString());

        scanner.close();
    }
}
