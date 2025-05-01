import java.util.Scanner;
public class Cylinder4{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of cylinder");
        Double radius = sc.nextDouble();
        System.out.println("Enter the height of cylinder");
        Double height = sc.nextDouble();


        Double vol_of_cy = 3.14*radius *radius *height;
        System.out.println("Area of cylinder is: "+ vol_of_cy);
    }
}