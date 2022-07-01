import java.io.*;
import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class Nim
  {
    public static void main (String[] args)
    {
      Random random = new Random();
      int stones = 12;
      int user_num;
      int com_num = random.nextInt(3) +1;

      Scanner input = new Scanner(System.in);

      //loop until game ends
      while(stones >= 0){
        //prompt user input (user turn)
        //user validation
        do{
             System.out.print("pick a number from 1 to 3:");
            user_num =input.nextInt();
          //calculate number of stones remaining, 
            stones = stones - user_num;
        }while (user_num < 1 || user_num > 3);

          //print number of remaining stones
        System.out.println("there are " + stones + " stones left");
          // cjeck for win
        if (stones == 0){
          System.out.println("you Won!!");
          break;
        }
          //machine turn
        if (stones <= 3){
          com_num = stones;
        }


        System.out.println("The computer took " + com_num + "stones");
        
        stones = stones-com_num;
        //print the number of stones
        System.out.println("there are " + stones + " stones left");

          // cjeck for win
        if (stones == 0){
          System.out.println("you Won!!");
          break;
        }

        //generating a new random number
        com_num = random.nextInt(3) +1;
        System.out.println();

      }
    }
  }