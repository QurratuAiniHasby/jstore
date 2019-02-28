
/**
 * Write a description of class Supplier here.
 *
 * @Qurratu Aini Hasby
 * @version 28/1/2019
 */
public class Supplier
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    /**
     * Constructor for objects of class Supplier
     */
    public Supplier(int id, String name, String Email, String phoneNumber, String location)
    {
        // initialise instance variables 
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getId()
    {
        // put your code here
        return id;
    }
    
    public String getName()
    {
        // put your code here
        return name;
    }
    
    public String getEmail()
    {
        // put your code here
        return email;
    }
    
    public String getPhoneNumber()
    {
        // put your code here
        return phoneNumber;
    }
    
    public Location getLocation()
    {
        // put your code here
        return location;
    }
    
    public void setId(int id)
    {
        // put your code here
        this.id = id;
    }
    
    public void setName(String name)
    {
        // put your code here
        this.name = name;
    }
    
    public void setEmail(String email)
    {
        // put your code here
        this.email = email;
    }
    
    public void setPhoneNumber(String phoneNumber)
    {
        // put your code here
        this.phoneNumber = phoneNumber;
    }
    
    public void setLocation(Location location)
    {
        // put your code here
        this.location = location;
    }
    
    public void printData()
    {
        System.out.println("id" + id);
        System.out.println("Name" + name);
        System.out.println("Email" + email);
        System.out.println("Phone" + phoneNumber);
        System.out.println("Location" + location);
    }
}
