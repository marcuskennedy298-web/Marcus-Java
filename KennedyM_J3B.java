import javax.swing.JOptionPane;


public class KennedyM_J3B
{
   public static void main(String[] args)
   {  
      double beginningBalance;
      double withdrawal;
      double interestRate;
      double earnings;
      double endingBalance;
      
      int year = 1;
      
      // Get user input
      beginningBalance = Double.parseDouble(
            JOptionPane.showInputDialog("Enter beginning balance:"));
      
      withdrawal = Double.parseDouble(
            JOptionPane.showInputDialog("Enter annual withdrawal amount:"));
            
      interestRate = Double.parseDouble(
            JOptionPane.showInputDialog("Enter interest rate (%):"));
            
      // Convert percentage to decimal
      interestRate = interestRate / 100;
      
      // Print column headings
      System.out.printf("%-6s %12s %12s %12s %12s%n",
            "Year",
            "Beg Balance",
            "Withdrawal",
            "Earnings",
            "End Bal");
            
      // Process yearly schedule
      while (beginningBalance > 0 && year <= 20)
      {  
         // Last withdrawal cannot be greater than the balance
         if (withdrawal > beginningBalance)
         {
            withdrawal = beginningBalance;
         }
         
         // Calculate earnings and ending balance
         earnings = (beginningBalance - withdrawal) * interestRate;
         endingBalance = beginningBalance - withdrawal + earnings;
         
         // Print one year's information
         System.out.printf("%-6d %,12.2f %,12.2f %,12.2f %,12.2f%n",
               year,
               beginningBalance,
               withdrawal,
               earnings,
               endingBalance);
               
         // Prepare for next year
         beginningBalance = endingBalance;
         year++;
       }
       
       System.exit(0);      
     }
}