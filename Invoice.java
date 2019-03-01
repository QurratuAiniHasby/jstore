
/**
 * Class invoice merupakan class yang berisi informasi pembelian di JStore yaitu harga total yang dibayarkan dan kapan transaksi
 * dilakukan
 *
 * @Qurratu Aini Hasby
 * @version 2.0
 * Since 28/01/2019
 */
public class Invoice
{
    private int id;
    private static Item item;
    private String date;
    private int totalPrice;

    /**
     * Constructor untuk objek di class Invoice
     */
    public Invoice(int id, Item item, String date, int totalPrice)
    {
        this.id = id;
        this.item = item;
        this.date = date;
        this.totalPrice = totalPrice;
    }

    /**
     * Metode untuk mendapatkan nilai dari variable yang telah diinisiasikan
     *
     */
    public int getId()
    {
        return id;
    }
    
    public Item getItem()
    {
        return item; //untuk mendapatkan nama barang yang dibeli
    }
    
    public String getDate()
    {
        return date; //untuk mendapatkan data tanggal pembelian
    }
    
    public int getTotalPrice()
    {
        return totalPrice;//metode get untuk mengembalikan total harga yang harus dibayarkan
    }
    
    public void setId(int id)
    {
        this.id = id; 
    }
    
    public void setItem(Item item)
    {
        this.item = item; //metode untuk mendapatkan nama barang yang didapatkan dari class item
    }
    
    public void setDate(String date)
    {
        this.date = date; //metode untuk menetapkan tanggal pembelian
    }
    
    public void setTotalPrice(int totalPrice)
    {
        this.totalPrice = totalPrice; //metode untuk menetapkan harga yang harus dibayarkan
    }
    
    public void printData()//metode untuk mencetak hasil yang didapatkan dai metode get
    {
        System.out.println("id" + id);
        System.out.println("Nama Barang yang dibeli" + item);
        System.out.println("Tanggal Pembelian" + date);
        System.out.println("Total yang harus dibayarkan" + totalPrice);
    }
}
