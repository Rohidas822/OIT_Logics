import java.util.Scanner;
public class Squareandcube{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter the Number");

        int num =sc.nextInt();

        int square=num*num;
        int cube=num*num*num;

        System.out.println("Square is" + square);
        System.out.println("Cube is" + cube);

    }
}