import javax.swing.JOptionPane;

public class KennedyM_J4C
{
    public static void main(String[] args)
    {
        String stateCode;
        String stateName;
        double income;
        double tax = 0.0;

        int exemptions = 0;
        char taxOption = ' ';
        char maritalStatus = ' ';

        int personalExemptions = 0;
        int dependentExemptions = 0;

        stateCode = JOptionPane.showInputDialog(
                "Enter state code (AZ, MI, LA):").toUpperCase();

        income = Double.parseDouble(
                JOptionPane.showInputDialog("Enter annual income:"));

        switch (stateCode)
        {
            case "AZ":
                taxOption = JOptionPane.showInputDialog(
                        "AZ Tax Option (A-G):").toUpperCase().charAt(0);

                tax = azTax(taxOption, income);
                break;

            case "MI":
                exemptions = Integer.parseInt(
                        JOptionPane.showInputDialog("Enter exemptions:"));

                tax = miTax(exemptions, income);
                break;

            case "LA":
                maritalStatus = JOptionPane.showInputDialog(
                        "Marital Status (S/M):").toUpperCase().charAt(0);

                personalExemptions = Integer.parseInt(
                        JOptionPane.showInputDialog("Personal exemptions:"));

                dependentExemptions = Integer.parseInt(
                        JOptionPane.showInputDialog("Dependent exemptions:"));

                tax = laTax(maritalStatus,
                        personalExemptions,
                        dependentExemptions,
                        income);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Invalid state code");
        }

        stateName = getStateName(stateCode);

        printResults(stateCode, stateName, exemptions, income, tax);

        System.exit(0);
    }

    // AZ TAX 
    public static double azTax(char option, double income)
    {
        double rate = 0;

        switch (option)
        {
            case 'A': rate = 0.005; break;
            case 'B': rate = 0.010; break;
            case 'C': rate = 0.015; break;
            case 'D': rate = 0.020; break;
            case 'E': rate = 0.025; break;
            case 'F': rate = 0.030; break;
            case 'G': rate = 0.035; break;
        }

        return income * rate;
    }

    //  MI TAX 
        public static double miTax(int exemptions, double income)
    {
        double taxable = income - (4900 * exemptions);

        if (taxable < 0)
            taxable = 0;

        return taxable * 0.0425;
    }

    //  LA TAX 
    public static double laTax(char status,
                               int personal,
                               int dependent,
                               double income)
    {
        double taxable;

        if (status == 'M')
            personal = Math.max(personal, 2);
        else
            personal = Math.max(personal, 1);

        taxable = income - (personal * 4500)
                          - (dependent * 1500);

        if (taxable < 0)
            return 0;

        return taxable * 0.04;
    }

    //  STATE NAME 
    public static String getStateName(String code)
    {
        switch (code)
        {
            case "AZ": return "Arizona";
            case "MI": return "Michigan";
            case "LA": return "Louisiana";
            default: return "Unknown";
        }
    }

    //  PRINT 
    public static void printResults(String code,
                                    String name,
                                    int exemptions,
                                    double income,
                                    double tax)
    {
        JOptionPane.showMessageDialog(null,
                "State: " + name + " (" + code + ")\n" +
                "Exemptions: " + exemptions + "\n" +
                "Income: $" + String.format("%,.2f", income) + "\n" +
                "Tax: $" + String.format("%,.2f", tax));
    }
}