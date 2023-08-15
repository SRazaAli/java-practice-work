import java.util.Scanner;

class FizzBuzzGame {
    int input;
    String userChoice;
    Scanner userInput = new Scanner(System.in);
    Scanner choice = new Scanner(System.in);

    public void input(){
        System.out.print("Enter a number : ");
        input = userInput.nextInt();
    }

    public void decision(){
          if(input%5 == 0 && input%3 == 0){
            System.out.println("FizzBuzz");
        }
        else if(input%3 == 0){
            System.out.println("Fizz");
        }
        else if(input%5 == 0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(input);
        }
    }

    public void run(){
        do {
            input();
            decision();
            System.out.println("Press Y to play again or any other key to exit :)");
            userChoice = choice.next();
        } while (userChoice != "y" || userChoice != "Y" );
    }
}

public class FizzBuzz {
    public static void main(String srgs[]){

        //running the game
        FizzBuzzGame newGame = new FizzBuzzGame();
        newGame.run();
    
        
    }
}