
/**
 * Kelas yang digunakan untuk informasi dari Item di Jstore beseta itemnya
 *
 * @author Qurratu Aini Hasby
 * @version 11/04/2019
 */
public class Item
{
    //variabel yang digunakan
    private int id;
    private String name;
    private int price;
    private static ItemCategory category;
    private static ItemStatus status;
    private static Supplier supplier;
        
    /**
     * Konstruktor dari kelas Item
     */
    public Item(String name, int stock, int price, ItemCategory category, ItemStatus status, Supplier supplier)
    {
        this.id = DatabaseItem.getLastItemID() + 1;
        this.name = name;
        this.price = price;
        this.category = category;
        this.supplier = supplier;
        this.status = status;
    }

    //Menampilkan nomor id
    /**
     * Method getId()
     * @return id item
     */    
    public int getId()
    {
        return id;
    }
    
    //Menampilkan nama Item
    /**
     * Method getName()
     * @return nama item
     */
    public String getName()
    {
        return name;
    }
    
    //Menampilkan harga Item
    /**
     * Method getPrice()
     * @return price
     */
    public int getPrice()
    {
        return price;
    }
    
    //Menampilkan kategori Item
    /**
     * Method getCategory()
     * @return category
     */
    public ItemCategory getCategory()
    {
        return category;
    }
    
    //Menampilkan supplier Item
    /**
     * Method getSupplier()
     * @return supplier
     */
    public Supplier getSupplier()
    {
        return supplier;
    }
    
    /**
     * Method getStatus()
     * @return status
     */
    public ItemStatus getStatus()
    {
        return status;
    }
    //Mengganti nomor id
    /**
     * Method setId()
     * @param id
     */
    public void setId(int id)
    {
        this.id = id;
    }
    
    //Mengganti nama Item
    /**
     * Method setName()
     * @param name
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    //Mengganti harga Item
    /**
     * Method setPrice()
     * @param price
     */
    public void setPrice(int price)
    {
        this.price = price;
    }
    
    //Mengganti kategori Item
    /**
     * Method setCategory()
     * @param category
     */
    public void setCategory(ItemCategory category)
    {
        this.category = category;
    }
    
    //Mengganti supplier Item
    /**
     * Method setSupplier()
     * @param supplier
     */
    public void setSupplier(Supplier supplier)
    {
        this.supplier = supplier;
    }
    
    /**
     * Method setStatus()
     * @param status
     */
    public void setStatus(ItemStatus status)
    {
        this.status = status;
    }
    
    //Mencetak nama Item
    /**
     * Method printData()
     */
     public String toString() 
    { 
        return "===============ITEM==============="
       + "\nID       : " + getId()
       + "\nName     : " + getName()
       + "\nCategory : " + getCategory()
       + "\nStatus   : " + getStatus()
       + "\nSupplier : " + supplier.getName() + "\n"; 
    }
}
