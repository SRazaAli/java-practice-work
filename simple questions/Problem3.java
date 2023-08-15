//create a rectangle class and calculate the area and parameter
class Rectangle {
    int side;
    int length;
    int height;

    public void setLenghtAndHeight(int length,int height){
        this.length = length;
        this.height = height;
    }


    public int area(){
        int   area = length * height;
        return area;
    }

    public int parameter(){
        int parameter = 2*(length + height);
        return parameter;
    }
}

public class Problem3 {
    public static void main(String args[]){

        Rectangle rectangle = new Rectangle();
        rectangle.setLenghtAndHeight(4, 3);

        System.out.println(rectangle.area());
        System.out.println(rectangle.parameter());
        
    }
}
