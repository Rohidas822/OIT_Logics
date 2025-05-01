import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;
        double percentage;
        String resultClass;

        // Read marks for 5 subjects
        System.out.println("Enter marks for 5 subjects (out of 100):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            total += marks[i];
        }

        // Calculate percentage
        percentage = total / 5.0;

        // Determine class
        if (percentage >= 75) {
            resultClass = "Distinction";
        } else if (percentage >= 60) {
            resultClass = "First Class";
        } else if (percentage >= 50) {
            resultClass = "Second Class";
        } else if (percentage >= 35) {
            resultClass = "Pass Class";
        } else {
            resultClass = "Fail";
        }

        
        System.out.println("\n--- Result ---");
        System.out.println("Total Marks: " + total);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Class: " + resultClass);

        scanner.close();
    }
}
