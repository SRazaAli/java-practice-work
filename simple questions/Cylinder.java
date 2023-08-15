import java.util.Scanner;

class CylinderMeasure {
    float length, width, area, volume, radius, height,perimeter;
    float userInput;
    final float pi = 3.14F;
    Scanner input = new Scanner(System.in);

    public void input(){
        System.out.print("Enter radius of the cylinder : ");
        radius = input.nextInt();
        System.out.print("Enter the height of the cylinder: ");
        height = input.nextInt();
    }

    public float area(){
        area = (2 * pi * radius * height) +(2 * pi * (radius * radius));
        return area;
    }

    public float volume(){
        volume = (pi * (radius * radius) * height);
        return volume;
    }

    public float perimeter(){
        perimeter = 2 * (2 * radius + height);
        return perimeter;
    }

    public void cyliderinfo(){
        input();
        System.out.println("Radius : " + radius);
        System.out.println("Height : " + height);
        System.out.println("Area : " + area());
        System.out.println("Volume : " + volume());
        System.out.println("Perimeter : "+ perimeter());
    }

}

public class Cylinder {
    public static void main(String args[]){

        CylinderMeasure cylinder = new CylinderMeasure();
        cylinder.cyliderinfo();
    }
}
