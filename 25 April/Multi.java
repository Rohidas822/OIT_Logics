import java.util.Scanner;
public class Multi{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the First number");
        int num1=sc.nextInt();

        System.out.println("Enter the Second number:");
        int num2=sc.nextInt();

        System.out.println("Enter the Third number:");
        int num3=sc.nextInt();

        System.out.println("Enter the Fourth number:");
        int num4=sc.nextInt();



        int Multiplication =(num1*num2*num3*num4);

        System.out.println("The Multiplication of four number is: " + Multiplication);
    }
        
}