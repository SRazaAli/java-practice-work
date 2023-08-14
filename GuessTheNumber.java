import java.util.Random;
import java.util.Scanner;

class Game {
    Random compRandom = new Random();
    Scanner userNumberInput  = new Scanner(System.in);
    int userNumber;
    int randNumber;
    int guessCounter = 0;

    public void userInput(){
        System.out.print("Enetr a number between 0 and 50 : " );
        userNumber = userNumberInput.nextInt();
    }
    public void decision(){
        if(userNumber > randNumber){
            System.out.println("You entered larger number :(");
            // System.out.println(randNumber);
            guessCounter+=1;
            userInput();
        }
        else if(userNumber < randNumber){
            System.out.println("You entered smaller number :(");
            // System.out.println(randNumber);

            guessCounter+=1;
            userInput();
        }
       
    }
    public Game(){
            randNumber = compRandom.nextInt(51);
            
    } 
}

public class GuessTheNumber {
    public static void main(String args[]){
            Game newGame = new Game();
            newGame.userInput();

            do {
                newGame.decision();
                if(newGame.userNumber == newGame.randNumber){
                    System.out.println("You guessed the correct number ;)");
                    System.out.println("No of guesses : " + newGame.guessCounter);
                }
            } while (newGame.userNumber != newGame.randNumber);
    }
}
