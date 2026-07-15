import javax.swing.JOptionPane;

public class KennedyM_J2C
{
   public static void main(String[] args)
   {  
   
      String stateCode;
      String stateName = "";
      boolean hasTax = false;
      double taxRate = 0.0;

      stateCode = JOptionPane.showInputDialog(
                "Enter State Code:\n" +
                "AK, CO, IL, MA, NC, or TN").toUpperCase();
        
        switch (stateCode) {

            case "AK":
                stateName = "Alaska";
                hasTax = false;
                break;

            case "CO":
                stateName = "Colorado";
                hasTax = true;
                taxRate = 4.55;
                break;

            case "IL":
                stateName = "Illinois";
                hasTax = true;
                taxRate = 4.95;
                break;
            case "MA":
                stateName = "Massachusetts";
                hasTax = true;
                taxRate = 5.00;
                break;

            case "NC":
                stateName = "North Carolina";
                hasTax = true;
                taxRate = 5.35;
                break;

            case "TN":
                stateName = "Tennessee";
                hasTax = false;
                break;
                
            default:
                stateName= "Invalid state code.";
                break;
                            
        }
        
        String message = "Residence: " + stateName +
                         "\nState Tax: " +
                         (hasTax ? "Yes" : "No");

        if (hasTax) {
            message += String.format("\nTax Rate: %.2f%%", taxRate);
        }

        JOptionPane.showMessageDialog(null, message);

        System.exit(0);
    }
}
