import java.util.Scanner;
public class Age1{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter your age ");

        int ageInyears=scanner.nextInt();


        int dayslived=ageInyears*365;

        System.out.println("You have lived approximately"+ dayslived + "Days");

        scanner.close();
    }
}