
//Write a program to perform conversion of Seconds to H.M.S.:

import java.util.Scanner;
public class Hms {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println(" Enter the Seconds");
        int seconds= sc.nextInt();

        int hours= seconds/3600;
        int min=(seconds%3600)/60;
        int sec=((seconds%3600)%60);

        System.out.println("Hours" + hours);
        System.out.println("Minutes" +min);
        System.out.println("Seconds" + sec);
    }

    
}