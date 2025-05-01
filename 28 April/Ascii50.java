    

import java.util.Scanner;
public class Ascii50 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single character or digit: ");
        char ch = scanner.next().charAt(0); 
        int ascii = (int) ch;
        System.out.println("ASCII value of '" + ch + "' is: " + ascii);

        scanner.close();
    }
}
