import javax.swing.JOptionPane;


public class KennedyM_J3C
{
   public static void main(String[] args)
   {
      double length;
      double width;
      double squareFeet;
      double squareYards;
      double totalSquareYards = 0;
      double totalCost;
      final double PRICE = 24.21;
      
      int rooms;
      
      // Rooms
      rooms = Integer.parseInt(
            JOptionPane.showInputDialog("How many rooms need flooring?"));
            
      // Print headings
      System.out.printf("%5s%9s%9s%10s%10s%n",
            "Room", 
            "Length", 
            "Width", 
            "Sq Ft", 
            "Sq Yds");
            
      // Loop
      for (int room = 1; room <= rooms; room++)
      {  
         // Get user input
         length = Double.parseDouble(
               JOptionPane.showInputDialog("Enter length for room " + room + ":"));
         
         width = Double.parseDouble(
               JOptionPane.showInputDialog("Enter width for room " + room + ":"));
               
         // Calculations
         squareFeet = length * width;
         squareYards = squareFeet / 9;
         
         // Accumulator
         totalSquareYards += squareYards;
         
         // Print rooom
         System.out.printf("%5d%9.1f%9.1f%10.2f%10.3f%n",
               room,
               length,
               width,
               squareFeet,
               squareYards);
        
      }  
      
      // Totals
      totalCost = totalSquareYards * PRICE;
      
      System.out.printf("%33s%10.3f%n", "Tot Sq Yds:", totalSquareYards);
      System.out.printf("%33s%10.2f%n", "Price:", PRICE);
      System.out.printf("%33s$%,10.2f%n", "Total Cost:", totalCost);

      System.exit(0);
   }
}
            
      
