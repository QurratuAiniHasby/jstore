import java.util.*;
/**
 * Kelas yang digunakan untuk memberikan database informasi Invoice pembelian barang beserta itemnya
 *
 * @author Qurratu Aini Hasby
 * @version 11/04/2019
 */
public class DatabaseInvoice
{
    // variabel yang digunakan dalam class
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int LAST_INVOICE_ID = 0;

    /**
     * Constructor for objects of class DatabaseInvoice
     */
    public DatabaseInvoice()
    {
        // initialise instance variables
    }
    
    /**
     * Method untuk mengembalikan supplier
     *
     * @return INVOICE_DATABASE
     */
    public static ArrayList<Invoice> getInvoiceDatabase()
    {
        return INVOICE_DATABASE;
    }
    
    /**
     * Method mengembalikan list supplier
     *
     * @return LAST_INVOICE_ID
     */
    public static int getLastInvoiceID()
    {
        return LAST_INVOICE_ID;
    }
    
    /**
     * Method untuk menambahkan supplier kedalam list
     *
     * @return false
     */
    public static boolean addInvoice(Invoice invoice)
    {
        INVOICE_DATABASE.add(invoice);
        return true;
    }
    
    /**
     * Method mengembalikan nilai variabel supplier
     *
     * @return supplier
     */
    public static Invoice getInvoice(int id)
    {
        for(Invoice temp : INVOICE_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                return temp;
            }
        }
        return null;
    }
    
    /**
     * Method mengembalikan nilai variabel supplier
     *
     * @return supplier
     */
    public static Invoice getActiveOrder(Customer customer)
    {
        for(Invoice temp : INVOICE_DATABASE) 
        {
            if((temp.getInvoiceStatus() == InvoiceStatus.Unpaid || 
            temp.getInvoiceStatus() == InvoiceStatus.Installment) && 
            temp.getIsActive() == true) 
            {
                return temp;
            }
        }
        return null;
    }
        
    /**
     * Method menghapus supplier dari database
     *
     */
    public static boolean removeInvoice(int id)
    {
        for(Invoice temp : INVOICE_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                if(temp.getIsActive() == true) 
                {
                    temp.setIsActive(false);
                    INVOICE_DATABASE.remove(temp);
                    return true;
                }
            }
        }
        return false;
    }
}