import java.util.Scanner;
import java.util.Random;

/**
 * Write a description of class Main here.
 *
 * @author (Alex Ilinykh)
 * @version (05/21/2019)
 */
public class Main
{
    int userNum;
    public Main()
    {
    //declare variables     
    int userNum;
    int prevNum = 0;
    int counter = 1;
    Scanner userInput = new Scanner(System.in);
    Random rand = new Random();
    //create random num
    int misteryNum  = rand.nextInt(11);
    System.out.println("Please enter number from 1 to 10");
    userNum = userInput.nextInt();
    while (userNum >= 11 || userNum <= 0) {
        System.out.println("Please enter number from 1 to 10");
        userNum = userInput.nextInt();
    }
    while(userNum != misteryNum) {
        
        if (userNum != prevNum) {
            prevNum = userNum;
            counter++;
        }
        if(userNum > misteryNum) {
            System.out.println("Too large");
            System.out.println("Please enter number from 1 to 10");
            userNum = userInput.nextInt();
                while (userNum >= 11 || userNum <= 0) {
                    System.out.println("Please enter number from 1 to 10");
                    userNum = userInput.nextInt();
                }
        }
        else if(userNum < misteryNum) {
            System.out.println("Too small");
            System.out.println("Please enter number from 1 to 10");
            userNum = userInput.nextInt();
                while (userNum >= 11 || userNum <= 0) {
                    System.out.println("Please enter number from 1 to 10");
                    userNum = userInput.nextInt();
                }
        
        }

    }
    System.out.println("Correct guess");
    System.out.println("number of guesses: " + counter);
  }
}

