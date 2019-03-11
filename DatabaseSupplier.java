
/**
 * Kelas untuk database  yang berisi informasi supplier 
 *
 * @author Qurratu Aini Hasby
 * @version 28/01/2019
 */
 public class DatabaseSupplier
 {
    //variabel yang digunakan pada kelas ini
    private String[] listSupplier;
    private static Supplier supplier;

    //Menambah supplier
    /**
     * Method addSupplier()
     * @param supplier
     * @return false
     */
    public static boolean addSupplier()
    {
        return true;
    }
    
    //Menghapus supplier
    /**
     * Method remove Supplier()
     * @param supplier
     */
    public static boolean removeSupplier()
    {
        return true;
    }
    
    //Menampilkan nama supplier
    /**
     * Method getSupplier()
     * @return supplier
     */
    public Supplier getSupplier()
    {
        return supplier;
    }
    
    //Menampilkan list supplier
    /**
     * Method getListSupplier()
     * @return listSupplier
     */
    public String[] getListSupplier()
    {
        return listSupplier;
    }
 }
