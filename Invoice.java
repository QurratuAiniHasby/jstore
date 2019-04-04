


import java.util.Calendar;
/**
 * Kelas yang digunakan untuk memberikan informasi Invoice pembelian barang beserta itemnya
 *
 * @author Qurratu Aini Hasby
 * @version 28/01/2019
 */
public abstract class Invoice
{
    //variabel yang digunakan
    private int id;
    private Item item;
    private Calendar date;
    protected int totalPrice;
    private int totalItem;
    private InvoiceStatus status;
    private InvoiceType type;

    /**
     * Konstruktor dari kelas Invoice
     */
    public Invoice(int id, Item item, int totalItem)
   {
        this.id = id;
        this.item = item;
        this.totalItem = totalItem;
        
        setTotalPrice(item.getPrice()*totalItem);
    }

    //Menampilkan nomor id invoice
    /**
     * Method getId()
     * @return id
     */
    public int getId()
    {
        return id;
    }
    
    //Menampilkan nama Item
    /**
     * Method getItem()
     * @return item
     */
    public Item getItem()
    {
        return item; //untuk mendapatkan nama barang yang dibeli
    }
    
    //Menampilkan tanggal
    /**
     * Method getDate()
     * @return date
     */
    public Calendar getDate()
    {
        return date; //untuk mendapatkan data tanggal pembelian
    }
    
    //Menampilkan total harga
    /**
     * Method getTotalPrice()
     * @return totalPrice
     */
    public int getTotalPrice()
    {
        return this.totalPrice;//metode get untuk mengembalikan total harga yang harus dibayarkan
    }
    
    /**
     * Method getTotalitem()
     * @return totalItem
     */
    public int getTotalItem()
    {
        return this.totalItem;//metode get untuk mengembalikan total harga yang harus dibayarkan
    }
    
    public abstract InvoiceStatus getInvoiceStatus();
    
    public abstract InvoiceType getInvoiceType();
    //Mengubah id Item
    /**
     * Method setId()
     * @param id
     */
    public void setId(int id)
    {
        this.id = id; 
    }
    
    //Mengubah nama Item
    /**
     * Method setItem()
     * @param item
     */
    public void setItem(Item item)
    {
        this.item = item;
    }
    
    //Mengubah tanggal
    /**
     * Method setDate()
     * @param date
     */
    public void setDate(Calendar date)
    {
        this.date = date;
    }
    
    //Mengubah total harga
    /**
     * Method setTotalPrice()
     * @param totalPrice
     */
    public void setTotalPrice(int totalPrice)
    {
        this.totalPrice = totalPrice;
    }
    
    /**
     * Method setTotalItem()
     * @param totalItem
     */
    public void setTotalItem(int totalItem)
    {
        this.totalItem = totalItem; //metode untuk menetapkan harga yang harus dibayarkan
    }
    
     public String toString() 
    { 
       return ""; 
    }
    
        
    
    
    
    
}
