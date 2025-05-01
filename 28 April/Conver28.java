
import java.util.Scanner;

public class Conver28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter volume in litres: ");
        double litres = scanner.nextDouble();

        
        double millilitres = litres * 1000;

        
        System.out.printf("Volume in millilitres: %.2f ml\n", millilitres);

        scanner.close();
    }
}

