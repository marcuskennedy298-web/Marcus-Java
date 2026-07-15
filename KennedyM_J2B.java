import javax.swing.JOptionPane;

public class KennedyM_J2B
{
   public static void main(String[] args)
   {
   
      String loanTypeInput;
      char loanType;
      double interestRate = 0.0;
      double loanAmount;
      int years;
      int numPayments;
      double payment;
   
      // Get loan type
        loanTypeInput = JOptionPane.showInputDialog(
                "Enter Loan Type:\nV = VA\nF = FHA\nC = Conventional")
                .toUpperCase();
                
         loanType = loanTypeInput.charAt(0);
        
      // Assign monthly interest rate using switch
        switch (loanType) {
            case 'V':
                interestRate = 6.69 / 100 / 12;
                break;

            case 'F':
                interestRate = 6.46 / 100 / 12;
                break;

            case 'C':
                interestRate = 6.70 / 100 / 12;
                break;

            default:
                interestRate = 0.0;
                break;        
        }
        
      // Get loan amount
        loanAmount = Double.parseDouble(
                JOptionPane.showInputDialog("Enter loan amount:"));

      // Get term in years
        years = Integer.parseInt(
                JOptionPane.showInputDialog("Enter loan term (years):"));
                
     // Number of monthly payments
        numPayments = years * 12;

     // Monthly payment 
        payment =
                (loanAmount * interestRate) / (1 - Math.pow((1 + interestRate), -numPayments));

     // Determine loan type name
        String loanName = "";

        switch (loanType) {
            case 'V':
                loanName = "VA";
                break;
            case 'F':
                loanName = "FHA";
                break;
            case 'C':
                loanName = "Conventional";
                break;
            default:
                loanName = "Invalid";
        }
        
       // Create output message
        String message = String.format(
                "Loan Type: %s\n" +
                "Loan Amount: $%,.2f\n" +
                "Term: %d Years\n" +
                "Monthly Payment: $%,.2f",
                loanName, loanAmount, years, payment);

        JOptionPane.showMessageDialog(null, message);

        System.exit(0);
    }
}