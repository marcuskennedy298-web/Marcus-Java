// My Info "Scanner" - Java 1B
// Marcus Kennedy, Sum' 26

import java.util.Scanner;

public class KennedyM_J1B
{
   public static void main(String[] args)
   {
      String name = "Marcus Kennedy" ;
      int age = 20 ;
      char marStat = 'S' ;
      boolean memAIS = false ;
      double salary = 75000.0 ;
      float carPymt = 250.00f ;
      
         Scanner keyboard = new Scanner(System.in);         
         
         System.out.print("What is your name? ");
            name = keyboard.nextLine();
         System.out.print("What is your age? ");
            age = keyboard.nextInt();
         System.out.print("What is your Marital Status? ");
            marStat = keyboard.next().charAt(0);
         System.out.print("Are you an AIS Member? ");
            memAIS = keyboard.nextBoolean();
         System.out.print("What is your Desired Salary? ");
            salary = keyboard.nextDouble();
         System.out.print("What is your Car Payment? ");
            carPymt = keyboard.nextFloat();      
      
      System.out.println("Name: " + name) ;
      System.out.println("Age: " + age) ; 
      System.out.println("Marital Status: " + marStat) ;           
      System.out.println("AIS Member: " + memAIS) ;      
      System.out.println("Desired Salary: " + salary) ;
      System.out.println("Car Payment: $" + carPymt) ;   
      
      keyboard.close();   
      }
}
