
/**
 * Write a description of class Item here.
 *
 * @Qurratu Aini Hasby
 * @version 28/1/2019
 */
public class Item
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private int stock;
    private int price;
    private String category;
    private static Supplier supplier;
    
    
    /**
     * Constructor for objects of class Item
     */
    public Item(int id, String name, int stock, int price, String category, Supplier supplier)
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
    
    public int getStock()
    {
        // put your code here
        return stock;
    }
    
    public int getPrice()
    {
        // put your code here
        return price;
    }
    
    public String getCategory()
    {
        // put your code here
        return category;
    }
    
    public Supplier getSupplier()
    {
        // put your code here
        return supplier;
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
    
    public void setStock(int stock)
    {
        // put your code here
        this.stock = stock;
    }
    
    public void setPrice(int price)
    {
        // put your code here
        this.price = price;
    }
    
    public void setCategory(String category)
    {
        // put your code here
        this.category = category;
    }
    
    public void setSupplier(Supplier supplier)
    {
        // put your code here
        this.supplier = supplier;
    }
    
    public void printData()
    {
        System.out.println("id" + id);
        System.out.println("Name" + name);
        System.out.println("Stock" + stock);
        System.out.println("Price" + price);
        System.out.println("Category" + category);
        System.out.println("Supplier" + supplier);
    }
}
