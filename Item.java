
/**
 * Class item berisi data tentang barang yang ada di JStore mulai dari nama,jumlah,harga,kategori dan penyuplainya.
 *
 * @Qurratu Aini Hasby
 * @version 2.0
 * Since 28/01/2019
 */
public class Item
{
    private int id;
    private String name;
    private int stock;
    private int price;
    private String category;
    private static Supplier supplier;
        
    /**
     * Constructor untuk class Item
     */
    public Item(int id, String name, int stock, int price, String category, Supplier supplier)
    {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.category = category;
        this.supplier = supplier;
    }

    /**
     * Metode untuk mendapatkan nilai dari variable yang telah diinisiasikan
     *
     */
    
    public int getId()
    {
        return id; //metode untuk mendapatkan nilai id
    }
    
    public String getName()
    {
        return name; //metode untuk mendapatkan nama barang
    }
    
    public int getStock()
    {
        return stock; //metode untuk mendapatkan jumlah barang yang ada
    }
    
    public int getPrice()
    {
        return price; //metode untuk mendapatkan harga barang yang dipilih
    }
    
    public String getCategory()
    {
        return category; //metode untuk mendapatkan kategori dari suatu barang
    }
    
    public Supplier getSupplier()
    {
        return supplier; //metode untuk mendapatkan nama supplier dari suatu barang
    }
    
    public void setId(int id)
    {
        this.id = id; //metode untuk menetapkan nilai yang nantinya akan diambil oleh metode get
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setStock(int stock)
    {
        this.stock = stock;
    }
    
    public void setPrice(int price)
    {
        this.price = price;
    }
    
    public void setCategory(String category)
    {
        this.category = category;
    }
    
    public void setSupplier(Supplier supplier)
    {
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
