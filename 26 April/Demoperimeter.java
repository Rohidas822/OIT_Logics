import java.util.Scanner;
public class Demoperimeter{

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        Double a = sc.nextDouble();

        System.out.println("Enter b: ");
        Double b = sc.nextDouble();

        System.out.println("Enter c: ");
        Double c = sc.nextDouble();


        Double s=(a+b+c)/2.0;

                System.out.println("The semi-perimeter is " + s);

                Double area = Math.sqrt(s*(s -a)*(s-b)*(s-c));
                System.out.println("Area: "+ area+ "sq.cm");
    }
}