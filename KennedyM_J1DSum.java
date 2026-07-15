// Snow COne Stand - Java 1D
// Marcus Kennedy, Sum' 26

import javax.swing.JOptionPane ;

public class KennedyM_J1DSum
{
   public static void main(String[] args)
   {
      double saleAmt, salesTax, total ;
      
      saleAmt = Double.parseDouble(JOptionPane.showInputDialog(
                  "What is the toal Snow Cone sales?")) ;
      salesTax = saleAmt * .0825 ;
      total = saleAmt + salesTax ;
      
      JOptionPane.showMessageDialog(null,
               "Snow Cone Sales: " + saleAmt +
               "\nSales Tax: " + salesTax +
               "\nTotal: " + total) ;
      System.exit(0) ;
   }
}