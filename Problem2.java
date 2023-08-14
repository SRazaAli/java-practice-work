//calculating area and parameter of a sqaure

import java.util.Scanner;

class Square{
    int side;

    public void area(){
        System.out.println(side * side);
    }

    public void parameter(){
        System.out.println(4 * side);
    }

}

public class Problem2 {
    public static void main(String args[]){

        Square square = new Square();
        
        Scanner sideInput = new Scanner(System.in) ;
        System.out.print("Enter the side of the square : ");
        square.side =  sideInput.nextInt();

        square.area();
        square.parameter();


        

    }
}
