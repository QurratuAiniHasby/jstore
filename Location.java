/**
 * Write a description of class Location here.
 *
 * @Qurratu Aini Hasby
 * @version 28/2/2019
 */
public class Location
{
    // instance variables - replace the example below with your own
    private String province;
    private String description;
    private String city;

    /**
     * Constructor for objects of class Location
     */
    public Location(String province, String description, String city)
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getProvince()
    {
        // put your code here
        return province;
    }
    
    public String getDescription()
    {
        // put your code here
        return description;
    }
    
    public String getCity()
    {
        // put your code here
        return city;
    }
    
    public void setProvince(String province)
    {
        // put your code here
        
        this.province = province;
    }
    
    public void setDescription(String description)
    {
        // put your code here
        this.description = description;
    }
    
    public void setCity(String city)
    {
        // put your code here
        this.city = city;
    }
    
    public void printData()
    {
        System.out.println("Province" + province);
        System.out.println("Description" + description);
        System.out.println("City" + city);
    }
}
