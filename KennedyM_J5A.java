public class House
{
    // Fields
    private String model;
    private double price;
    private int squareFeet;
    private int bedrooms;
    private double baths;

    // No-args constructor
    public House()
    {
        model = "";
        price = 0.0;
        squareFeet = 0;
        bedrooms = 0;
        baths = 0.0;
    }

    // Full constructor using Strings
    public House(String model, String price, String squareFeet,
                 String bedrooms, String baths)
    {
        this.model = model;
        this.price = Double.parseDouble(price);
        this.squareFeet = Integer.parseInt(squareFeet);
        this.bedrooms = Integer.parseInt(bedrooms);
        this.baths = Double.parseDouble(baths);
    }

    // Full constructor using proper data types
    public House(String model, double price, int squareFeet,
                 int bedrooms, double baths)
    {
        this.model = model;
        this.price = price;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
        this.baths = baths;
    }

    // Setters

    public void setModel(String model)
    {
        this.model = model;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setPrice(String price)
    {
        this.price = Double.parseDouble(price);
    }

    public void setSquareFeet(int squareFeet)
    {
        this.squareFeet = squareFeet;
    }

    public void setSquareFeet(String squareFeet)
    {
        this.squareFeet = Integer.parseInt(squareFeet);
    }

    public void setBedrooms(int bedrooms)
    {
        this.bedrooms = bedrooms;
    }

    public void setBedrooms(String bedrooms)
    {
        this.bedrooms = Integer.parseInt(bedrooms);
    }

    public void setBaths(double baths)
    {
        this.baths = baths;
    }

    public void setBaths(String baths)
    {
        this.baths = Double.parseDouble(baths);
    }

    // Getters

    public String getModel()
    {
        return model;
    }

    public double getPrice()
    {
        return price;
    }

    public int getSquareFeet()
    {
        return squareFeet;
    }

    public int getBedrooms()
    {
        return bedrooms;
    }

    public double getBaths()
    {
        return baths;
    }
}