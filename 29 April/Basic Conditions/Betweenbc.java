

import java.util.Scanner;

public class Betweenbc {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        System.out.println("Enter a: ");
        int a= sc.nextInt();

        System.out.println("Enter b: ");
        int b= sc.nextInt();

        System.out.println("Enter c: ");
        int c= sc.nextInt();

        if(b < a && a < c){
        System.out.println("a is between b & c");
        }
        else{
            System.out.println("a is not between b & c");

        }
    }
    
}
