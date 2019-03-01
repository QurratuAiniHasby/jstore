
/**
 * Database untuk melihat list supplier yang ada di jstore,dan untuk melakukan
 * penambahan supplier atau menghapus supplier yang sudah ada
 *
 * @Qurratu Aini Hasby
 * @version 2.0
 * Since 28/01/2019
 */
 public class DatabaseSupplier
 {
    private String[] listSupplier;
    private static Supplier supplier;
    /**
     * Constructor untuk class DatabaseSupplier
     */
    public DatabaseSupplier()
    {
        // initialise instance variables
    }

    /**
     * List untuk supplier barang
     */
    public static boolean addSupplier()
    {
        return true;
    }
    
    public static boolean removeSupplier()
    {
        return true;
    }
    
    public Supplier getSupplier()
    {
        return supplier;
    }
    
    public String[] getListSupplier()
    {
        return listSupplier;
    }
 }
