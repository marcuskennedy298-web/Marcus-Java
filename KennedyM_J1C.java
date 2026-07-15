// My Info - Java 1C
// Marcus Kennedy, Sum' 26

import javax.swing.JOptionPane ;

public class KennedyM_J1C
{
   public static void main(String[] args)
   {
      String name = "Marcus Kennedy" ;
      int age = 20 ;
      char marStat = 'S' ;
      boolean memAIS = false ;
      double salary = 75000.0 ;
      float carPymt = 250.00f ;
      
      name = JOptionPane.showInputDialog(
                  "What is your name?") ;
      
      JOptionPane.showMessageDialog(null,
               "Name: " + name +
               "\nAge: " + age +
               "\nMarital Status: " + marStat +
               "\nAIS Member: " + memAIS +
               "\nSalary: $" + salary +
               "\nCar Payment: $" + carPymt);
      System.exit(0) ;
   }
}
