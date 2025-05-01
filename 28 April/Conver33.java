
    

import java.util.Scanner;

public class Conver33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter time in seconds: ");
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.printf("Time:", hours, minutes, seconds);

        scanner.close();
    }
}




