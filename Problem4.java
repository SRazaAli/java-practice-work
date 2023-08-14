
class TommyVercetti {
    int stamina;

    public void setStamina(int stamina){
        this.stamina = stamina;
    }

    public void run(){
        System.out.println("Tommy vercetti is running");
    } 

    public void shoot(){
        System.out.println("Tommy vercetti is shooting");

    }

    public void swim(){
        System.out.println("Tommy vercetti is swimming");
    }

    public void drive(){
        System.out.println("Tommy vercetti is driving");
    }
}

public class Problem4 {
    public static void main(String args[]){

        TommyVercetti character = new TommyVercetti();
        character.setStamina(57);

        if(character.stamina<20){
            character.run();
        }
        else if(character.stamina<40){
            character.drive();
        }
        else if(character.stamina<60){
            character.swim();
        }
        else if(character.stamina<80){
            character.shoot();
        }
        
    }
}
