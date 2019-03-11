
/**
 * Kelas yang digunakan untuk memberikan informasi Invoice pembelian barang beserta itemnya
 *
 * @author Qurratu Aini Hasby
 * @version 28/01/2019
 */
public class Invoice
{
    //variabel yang digunakan
    private int id;
    private static Item item;
    private String date;
    private int totalPrice;

    /**
     * Konstruktor dari kelas Invoice
     */
    public Invoice(int id, Item item, String date, int totalPrice)
    {
        this.id = id;
        this.item = item;
        this.date = date;
        this.totalPrice = totalPrice;
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
        this.item = item; //metode untuk mendapatkan nama barang yang didapatkan dari class item
    }
    
    //Mengubah tanggal
    /**
     * Method setDate()
     * @param date
     */
    public void setDate(String date)
    {
        this.date = date; //metode untuk menetapkan tanggal pembelian
    }
    
    //Mengubah total harga
    /**
     * Method setTotalPrice()
     * @param totalPrice
     */
    public void setTotalPrice(int totalPrice)
    {
        this.totalPrice = totalPrice; //metode untuk menetapkan harga yang harus dibayarkan
    }
    
    //Mencetak total harga
    /**
     * Method printData()
     */
    public void printData()//metode untuk mencetak hasil yang didapatkan dai metode get
    {
        System.out.println("Total yang harus dibayarkan" + totalPrice);
    }
}
