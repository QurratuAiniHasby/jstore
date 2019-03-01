
/**
 * Database untuk melihat list item yang ada di store,dan untuk melakukan
 * penambahan item atau menghapus item yang sudah ada
 *
 * @Qurratu Aini Hasby
 * @version 2.0
 * Since 28/01/2019
 */
public class DatabaseItem
{
    private String[] listItem;
    private Item item;
    /**
     * Constructor untuk class Database
     */
    public DatabaseItem()
    {
        // initialise instance variables
    }

    /**
     * class untuk database dari barang-barang JStore
     */
    public static boolean addItem()
    {
        return true;
    }
    
    public static boolean removeItem()
    {
        return true;
    }
    
    public Item getItem()
    {
        return item;
    }
    
    public String[] getItemDatabase()
    {
        return listItem; //mendapatkan list dari itemdatabase
    }
}
