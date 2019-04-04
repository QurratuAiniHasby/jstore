
/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseCustomer
{
    // instance variables - replace the example below with your own
    private Customer[] listCustomer;
    private Customer Customer;

    /**
     * Constructor for objects of class DatabaseCustomer
     */
    public DatabaseCustomer()
    {
        // initialise instance variables
    }

    /**
     * Method untuk menambahkan supplier kedalam list
     *
     * @return    false
     */
    public static boolean addCustomer(Customer Customer)
    {
        return false;
    }
    
    /**
     * Method untuk menghapus supplier dari list
     *
     */
    public void removeCustomer(Customer Customer)
    {
        // put your code here
    }
    
    /**
     * Method untuk mengembalikan supplier
     *
     * @return    objek supplier
     */
    public Customer getCustomer()
    {
        return Customer;
    }
    
    /**
     * Method untuk mengembalikan list supplier
     *
     * @return    list supplier
     */
    public Customer[] getListCustomer()
    {
        return listCustomer;
    }
}