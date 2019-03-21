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
    private static Item item;
    private String date;
    protected int totalPrice;
    private int totalItem;
    private static InvoiceType type;
    private static InvoiceStatus status;

    /**
     * Konstruktor dari kelas Invoice
     */
    public Invoice(int id, Item item, String date, int totalItem, int totalPrice)
   {
       this.id = id;
        this.item = item;
        this.date = date;
        this.totalPrice = totalPrice;
        this.totalItem = totalItem;
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
    public String getDate()
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
        return totalPrice;//metode get untuk mengembalikan total harga yang harus dibayarkan
    }
    
    /**
     * Method getTotalitem()
     * @return totalItem
     */
    public int getTotalItem()
    {
        return totalItem;//metode get untuk mengembalikan total harga yang harus dibayarkan
    }
    
    /**
     * Method getInvoiceStatus()
     * @return invoiceStatus
     */
    public InvoiceStatus getInvoiceStatus()
    {
        return status;
    }
    
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
    public void setDate(String date)
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
    
    /**
     * Method setInvoiceStatus()
     * @param invoiceStatus
     */
    public void setInvoiceStatus(InvoiceStatus status)
    {
        this.status = status; //metode untuk menetapkan harga yang harus dibayarkan
    }
    
        
    public InvoiceType getInvoiceType()
    {
            return type;
    }
    
    //Mencetak total harga
    /**
     * Method printData()
     */
    public abstract void printData();
    
        
    
    
    
    
}
