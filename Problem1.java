                                //Getters and Setters
class Employee {
    int salary;
    String name;

    void setSalary(int salaryInput){  
        this.salary = salaryInput;
    }

    void getSalary(){
        System.out.println(this.salary);
    }

    void setName(String name){
        this.name =  name;
    }

    void getName(){
        System.out.println(this.name);
    }    

}

public class Problem1 {
    public static void main(String args[] ){
        //Initializing object of class
        Employee raza = new Employee();

        //setting values
        raza.setSalary(12000);
        raza.setName("Syed Raza Ali");

        //printing values
        raza.getName();
        raza.getSalary();


        
    }
}