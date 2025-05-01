import java.util.Scanner;

public class Divisible17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();

        if(num%17==0){
            System.out.println(num + "Is Divisible17");
        }
        else{
            System.out.println(num + "Not Divisisible by 17");
        }
    }
    
}
