import javax.swing.JOptionPane;


public class KennedyM_J3A
{
   public static void main(String[] args)
   {
      final double TAX_RATE = 0.0825;
      
      String productName;
      int quantity;
      double unitPrice;
      double extendedPrice;
      double subtotal = 0;
      
      // Print headers
      System.out.printf("%-25s %10s %12s %15s%n",
            "Product", 
            "Quantity", 
            "Unit Price", 
            "Price");
            
      do 
      {  
         productName = JOptionPane.showInputDialog(
               "Enter product name (leave blank to stop): " );
               
         if (productName != null && !productName.equals(""))
         {      
            quantity = Integer.parseInt(
                  JOptionPane.showInputDialog("Enter Quantity: "));
                  
            unitPrice = Double.parseDouble(
                  JOptionPane.showInputDialog("Enter unit price: "));
                  
            // calculate extended price
            extendedPrice = quantity * unitPrice;
            
            // accumulate subtotal
            subtotal += extendedPrice;
            
            // print formatted row using
            System.out.printf("%-,25s %10d $%,7.2f $%,10.2f%n",
                  productName, 
                  quantity, 
                  unitPrice, 
                  extendedPrice);
         }
       
      } while (productName != null && !productName.equals(""));
      
      // tax + total
      double tax = subtotal * TAX_RATE;
      double totalCost = subtotal + tax;
      
      System.out.println("-------------------------------------------------------------------");
      
      // totals formatting
      System.out.printf("%52s $%,10.2f%n", "Total", subtotal);
      System.out.printf("%52s $%,10.2f%n", "Tax", tax);
      System.out.printf("%52s $%,10.2f%n", "Total Cost", totalCost);

      System.exit(0);
   }
}      
             
                  