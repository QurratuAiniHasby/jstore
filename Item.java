
/**
 * Kelas yang digunakan untuk informasi dari Item di Jstore beseta itemnya
 *
 * @author Qurratu Aini Hasby
 * @version 28/01/2019
 */
public class Item
{
    //variabel yang digunakan
    private int id;
    private String name;
    private int stock;
    private int price;
    private String category;
    private static Supplier supplier;
        
    /**
     * Konstruktor dari kelas Item
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

    //Menampilkan nomor id
    /**
     * Method getId()
     * @return id
     */    
    public int getId()
    {
        return id; //metode untuk mendapatkan nilai id
    }
    
    //Menampilkan nama Item
    /**
     * Method getName()
     * @return name
     */
    public String getName()
    {
        return name; //metode untuk mendapatkan nama barang
    }
    
    //Menampilkan stock Item
    /**
     * Method getStock()
     * @return stock
     */
    public int getStock()
    {
        return stock; //metode untuk mendapatkan jumlah barang yang ada
    }
    
    //Menampilkan harga Item
    /**
     * Method getPrice()
     * @return price
     */
    public int getPrice()
    {
        return price; //metode untuk mendapatkan harga barang yang dipilih
    }
    
    //Menampilkan kategori Item
    /**
     * Method getCategory()
     * @return category
     */
    public String getCategory()
    {
        return category; //metode untuk mendapatkan kategori dari suatu barang
    }
    
    //Menampilkan supplier Item
    /**
     * Method getSupplier()
     * @return supplier
     */
    public Supplier getSupplier()
    {
        return supplier; //metode untuk mendapatkan nama supplier dari suatu barang
    }
    
    //Mengganti nomor id
    /**
     * Method setId()
     * @param id
     */
    public void setId(int id)
    {
        this.id = id; //metode untuk menetapkan nilai yang nantinya akan diambil oleh metode get
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
    
    //Mengganti stock Item
    /**
     * Method setStock()
     * @param stock
     */
    public void setStock(int stock)
    {
        this.stock = stock;
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
    public void setCategory(String category)
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
    
    //Mencetak nama Item
    /**
     * Method printData()
     */
    public void printData()
    {
        System.out.println("Nama" + name);
    }
}
