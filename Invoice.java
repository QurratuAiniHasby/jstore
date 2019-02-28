
/**
 * Write a description of class Invoice here.
 *
 * @Qurratu Aini Hasby
 * @version 28/1/2019
 */
public class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private static Item item;
    private String date;
    private int totalPrice;

    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(int id, Item item, String date, int totalPrice)
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
    
    public Item getItem()
    {
        // put your code here
        return item;
    }
    
    public String getDate()
    {
        // put your code here
        return date;
    }
    
    public int getTotalPrice()
    {
        // put your code here
        return totalPrice;
    }
    
    public void setId(int id)
    {
        // put your code here
        this.id = id;
    }
    
    public void setItem(Item item)
    {
        // put your code here
        this.item = item;
    }
    
    public void setDate(String date)
    {
        // put your code here
        this.date = date;
    }
    
    public void setTotalPrice(int totalPrice)
    {
        // put your code here
        this.totalPrice = totalPrice;
    }
    
    public void printData()
    {
        System.out.println("id" + id);
        System.out.println("Item" + item);
        System.out.println("Date" + date);
        System.out.println("Total" + totalPrice);
    }
}
