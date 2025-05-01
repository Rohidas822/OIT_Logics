
    import java.util.Scanner;
    public class Conver31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter volume in millilitres: ");
        double millilitres = scanner.nextDouble();

        double litres = millilitres / 1000;

        System.out.printf("Volume in litres: %.3f L\n", litres);

        scanner.close();
    }
}

