package java_project;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static final String ROCK="rock";
    public static final String PAPER="paper";
    public static final String SCISSORS="scissors";

    public static void main(String[] args) {
       
   
   String[] Choice={ROCK,PAPER,SCISSORS};
   System.out.println("\n===RockPaperScissorGame===\n");
   System.out.println("Welcome to Rock, Paper, Scissors!");
   System.out.println("Type 'rock', 'paper', or 'scissors'. Type 'exit' to quit.");

   Scanner input=new Scanner(System.in);
   Random random=new Random();
   
   while(true){
             System.out.print("Your choice: ");
             String PlayerMove=input.nextLine().toLowerCase();

             if(PlayerMove.equals("exit"))
             {
                System.out.println("Thanks for playing!");
                break;
             }
             if(!PlayerMove.equals(ROCK) && !PlayerMove.equals(PAPER) && !PlayerMove.equals(SCISSORS) )
             {
                System.out.println("Invalid input! Please choose rock, paper, or scissors.");
                    continue;
             }

             //COmputer Move
             String ComputerMove=Choice[random.nextInt(Choice.length)];
             System.out.println("Computer chose: " + ComputerMove);

             if(PlayerMove.equals(ComputerMove))
             {
                 System.out.println("It's a tie!");
             }
              // rock scissor rock win
            // paper rock  paper win
            //scissor paper scissor win

             else if((PlayerMove.equals(ROCK) && ComputerMove.equals(SCISSORS))|| (PlayerMove.equals(PAPER) && ComputerMove.equals(ROCK)) || (PlayerMove.equals(SCISSORS) && ComputerMove.equals(PAPER)))
             {
                System.out.println("You win!");
             }
             else 
             {
                System.out.println("Computer win! ");
             }

        

   
   




   }



    }
   
 
    
}
