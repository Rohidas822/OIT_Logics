import java.util.Scanner;
public class Demosphere1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of Sphere");

        Double radius = sc.nextDouble();
        Double vol_of_sphere = 1.33*3.14*radius*radius*radius;
        System.out.println("Volume of Sphere is: "+ vol_of_sphere);
    }
}