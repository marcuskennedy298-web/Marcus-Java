import java.util.Scanner;

public class KennedyM_J4A
{
    // Scanner available to all methods
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        char option;
        String description;

        // Value-returning with no parameters
        option = getOption();

        // Value-returning with parameters
        description = getOptionDescription(option);

        // Void with no parameters
        heading();

        // Void with parameters
        print(option, description);
    }

    // Value-returning with no parameters pt2
        public static char getOption()
    {
        System.out.println("Select from the following options:");
        System.out.println("A = Autos");
        System.out.println("B = Trucks");
        System.out.println("C = SUVs");
        System.out.print("Enter your choice: ");

        char option = Character.toUpperCase(input.next().charAt(0));

        return option;
    }

    // Value-returning with parameters pt2
    public static String getOptionDescription(char option)
    {
        String description;

        switch (option)
        {
            case 'A':
                description = "Autos";
                break;

            case 'B':
                description = "Trucks";
                break;

            case 'C':
                description = "SUVs";
                break;

            default:
                description = "Unknown";
                break;
        }

        return description;
    }

    // Void with no parameters pt2
    public static void heading()
    {
        System.out.println();
        System.out.println("Vehicle Selection Report");
    }

    // Void with parameters pt2
    public static void print(char option, String description)
    {
        System.out.println("You selected " + description + " (" + option + ")");
    }
}