import java.text.DecimalFormat;

public class KennedyM_J5A_Demo
{
    public static void main(String[] args)
    {
        // House 1: No-args constructor using String setters
        House house1 = new House();

        house1.setModel("Vintage");
        house1.setPrice("235900");
        house1.setSquareFeet("2100");
        house1.setBedrooms("3");
        house1.setBaths("2.0");


        // House 2: No-args constructor using proper data type setters
        House house2 = new House();

        house2.setModel("Calderon");
        house2.setPrice(431750);
        house2.setSquareFeet(3400);
        house2.setBedrooms(5);
        house2.setBaths(3.5);


        // House 3: Full constructor using Strings
        House house3 = new House(
                "Contemporary",
                "456350",
                "3600",
                "5",
                "4.0");


        // House 4: Full constructor using proper data types
        House house4 = new House(
                "Traditions",
                215550,
                1977,
                3,
                1.5);


        // Print all houses
        printHouse(house1);
        printHouse(house2);
        printHouse(house3);
        printHouse(house4);
    }


    public static void printHouse(House house)
    {
        DecimalFormat money = new DecimalFormat("$#,##0.00");
        DecimalFormat number = new DecimalFormat("#,##0");

        System.out.println("Model:         " + house.getModel());
        System.out.println("Price:         " + money.format(house.getPrice()));
        System.out.println("Square Feet:   " + number.format(house.getSquareFeet()));
        System.out.println("Bedrooms:      " + house.getBedrooms());
        System.out.println("Baths:         " + house.getBaths());
        System.out.println();
    }
}