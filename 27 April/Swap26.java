public class Swap26{
       public static void main(String[] args){
        int a=5;
        int b=10;

        System.out.println("Before swapping a:" + a +  "b is : " + b);


        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After swapping a:" + a +  "b is : " + b);

       }

}

