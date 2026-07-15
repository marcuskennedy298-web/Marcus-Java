import javax.swing.JOptionPane;

public class KennedyM_J2A
{
   public static void main(String[] args)
   {
          
      char option;
        String message;

        option = JOptionPane.showInputDialog(
                "Select a Membership:\n"
                + "1) Family ($169)\n"
                + "2) Patron ($275)\n"
                + "3) Sponsor ($550)")
                .charAt(0);

      // Start with benefits all memberships receive
        message = "Benefits:\n"
                + "Parking\n"
                + "Member-only Events\n"
                + "Free Admission: "
                + (option == '1' ? 4 : (option == '2' ? 8 : 10))
                + "\n";
      
      // Patron and Sponsor benefits
        if (option == '2' || option == '3') {
            message += "Free Rides\n";
            message += "Animal Feedings: "
                    + (option == '2' ? 8 : 10) + "\n";
            message += "VIP Events\n";
        }

       // Sponsor-only benefits
        if (option == '3') {
            message += "Behind-the-Scenes Events\n";
            message += "Complimentary Membership\n";
        }

       // Add membership type and cost
        if (option == '1') {
            message = "Membership: Family\n"
                    + "Cost: $169\n\n"
                    + message;
        }
       
        if (option == '2') {
            message = "Membership: Patron\n"
                    + "Cost: $275\n\n"
                    + message;
        }

        if (option == '3') {
            message = "Membership: Sponsor\n"
                    + "Cost: $550\n\n"
                    + message;
        }

        JOptionPane.showMessageDialog(null, message);

        System.exit(0);
    }
}