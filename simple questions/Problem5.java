
//Create a circle and calculate its circumference and diamter
import java.util.Scanner;

class Circle {
    float radius;
    float circumference;
    float diameter;
    
   
    public void circleInfo(float radius){
        diameter = 2 * radius;
        System.out.println("radius is : " + radius);
        System.out.println("diameter is : " + diameter);
    }

    public void circleInfo(float radius, float pi){
        circumference = 2 * pi * radius;
        System.out.println("radius: " + radius);
        System.out.println("circumference : " + circumference);
    }

   
}

public class Problem5 {
    public static void main(String args[]){
            final float pi = 3.14F;

        Circle circle = new Circle();

        Scanner radiusInput = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        circle.radius =  radiusInput.nextFloat();

        circle.circleInfo(circle.radius);
        circle.circleInfo(circle.radius, pi);


    }
}
