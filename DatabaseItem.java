
/**
 * Kelas yang berisi database informasi list item yang ada di store
 * dan dapat digunakan untuk melakukan penambahan atau penghapusan item
 *
 * @author Qurratu Aini Hasby
 * @version 28/01/2019
 */
public class DatabaseItem
{
    //variabel yang digunakan pada kelas ini
    private String[] listItem;
    private Item item;
    
    //Penambahan item
    /**
     * Method addItem()
     * @param item
     * @return false
     */
    public static boolean addItem(Item item)
    {
        return false;
    }
    
    //Penghapusan Item
    /**
     * Method removeItem()
     * @param item
     * @return false
     */
    public static boolean removeItem(Item item)
    {
        return false;
    }
    
    //Menampilkan Item
    /**
     * Method getItem()
     * @return item
     */
    public Item getItem()
    {
        return item;
    }
    
    //Menampilkan database list item
    /**
     * Method getItemDatabase()
     * @return listItem
     */
    public String[] getItemDatabase()
    {
        return listItem;
    }
}
