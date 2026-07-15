import javax.swing.JOptionPane;

public class KennedyM_J4B
{
    public static void main(String[] args)
    {
        // Declare variables
        double beginningBalance;
        double balance;
        double amount;
        String description;
        String date;

        // Ask for the beginning balance
        beginningBalance = Double.parseDouble(
                JOptionPane.showInputDialog("Enter the beginning balance:"));

        // Initialize the running balance
        balance = beginningBalance;

        // Print the column headings
        System.out.printf("%-12s%-25s%15s%15s%15s%n",
                "Date", "Description", "Withdrawal", "Deposit", "Balance");

        // Print the beginning balance
        System.out.printf("%-12s%-25s%15s%15s%15.2f%n",
                "", "Beginning Balance", "", "", balance);

        // Continue asking for transactions until the description is blank
        while (true)
        {
            description = JOptionPane.showInputDialog(
                    "Enter activity description\n(Click OK on a blank field to exit):");

            // Exit loop if description is blank
            if (description == null || description.trim().equals(""))
            {
                break;
            }

            // Ask for the transaction date
            date = JOptionPane.showInputDialog("Enter the date (MM/DD/YYYY):");

            // Ask for the transaction amount
            amount = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Enter the amount.\n" +
                            "Use a minus sign (-) for withdrawals."));

            // Call the appropriate method
            if (amount > 0)
            {
                balance = deposit(balance, amount, description, date);
            }
            else if (amount < 0)
            {
                // Pass a positive number to the withdrawal method
                balance = withdrawal(balance, -amount, description, date);
            }
        }

        // End the program
        System.exit(0);
    }

   // Process a deposit transaction
    public static double deposit(double balance, double amount,
                                 String description, String date)
    {
        balance = balance + amount;

        System.out.printf("%-12s%-25s%15s%15.2f%15.2f%n",
                date,
                description,
                "",
                amount,
                balance);

        return balance;
    }

    // Processes a withdrawal transaction.
    public static double withdrawal(double balance, double amount,
                                    String description, String date)
    {
        balance = balance - amount;

        System.out.printf("%-12s%-25s%15.2f%15s%15.2f%n",
                date,
                description,
                amount,
                "",
                balance);

        return balance;
    }
}