import java.util.Random;
import java.util.Scanner;

public class numberguessinggame{
  public static void main(String args[]){
    int answer,guess ,count=0;
    final int Max = 100;

    Scanner keyboard = new Scanner(System.in);
    Random rand = new Random();
    
    answer = rand.nextInt(Max)+1;
    for(int i=0;i<5;i++){
      System.out.println("choose a number between 1 and 100");
      guess = keyboard.nextInt();
      count += 1;
      if(guess == answer){
            System.out.println("hurrayyy! you guessed it correct");
            System.out.println("you completed the task in "+count+" attempts");
            break;}
    
      else if(guess < answer){
            System.out.println("your choice is less than the answer"+answer);}

      else{
            System.out.println("your choice is greater than the answer");}
    }
     
                 
  }
}
