package jstore;
import java.util.*;
/**
 * Kelas yang digunakan untuk memberikan informasi Invoice pembelian barang beserta itemnya
 *
 * @author Qurratu Aini Hasby
 * @version 11/04/2019
 */
public abstract class Invoice
{
    //variabel yang digunakan
    private int id;
    private ArrayList<Integer> item;
    private Calendar date;
    private int totalPrice;
    private boolean isActive;
    private Customer customer;
    private static InvoiceStatus status;

    /**
     * Constructor untuk class Invoice
     */
    public Invoice(ArrayList<Integer> item)
    {
        this.id = DatabaseInvoice.getLastInvoiceID() + 1;
        this.item = item;
        this.date = new GregorianCalendar();
    }

    /**
     * Method mengembalikan nilai id
     * @return id
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Method mengembalikan nilai item
     *
     * @return item
     */
    public ArrayList<Integer> getItem()
    {
        return item;
    }
    
    /**
     * Method mengembalikan tanggal pembelian
     *
     * @return tanggal
     */
    public Calendar getDate()
    {
        return date;
    }
    
    /**
     * Method mengembalikan nilai dari total harga item yang dibeli
     *
     * @return total harga
     */
    public int getTotalPrice()
    {
        return totalPrice;
    }
        
    /**
     * 
     * @param invoiceStatus
     */
    public abstract InvoiceStatus getInvoiceStatus();
    
    /**
     * 
     * @param invoiceType
     */
    public abstract InvoiceType getInvoiceType();
      
    /**
     * Method untuk mengubah id invoice
     *
     * @param  id  id dari suatu invoice
     */
    public boolean getIsActive()
    {
        return isActive;
    }
    
    /**
     * Method untuk mengubah id invoice
     *
     * @param  id  id dari suatu invoice
     */
    public Customer getCustomer()
    {
        return customer;
    }
    
    /**
     * Method untuk mengubah id invoice
     *
     * @param  id  id dari suatu invoice
     */
    public void setId(int id)
    {
        this.id = id;
    }
    
    /**
     * Method untuk mengubah item pada invoice
     *
     * @param  item  objek item dari suatu invoice
     */
    public void setItem(ArrayList<Integer> item)
    {
        this.item = item;
    }
    
    /**
     * Method untuk mengubah tanggal invoice
     *
     * @param  date  tanggal dari suatu invoice
     */
    public void setDate(Calendar date)
    {
        this.date = date;
    }
    
    /**
     * Method mengubah total harga
     *
     * @param  totalPrice suatu invoice
     */
    public void setTotalPrice(int totalPrice)
    {
        ArrayList<Integer> listItemID = DatabaseInvoice.getInvoice(id).getItem();
        for(int tempID : listItemID)
        {
            this.totalPrice = totalPrice + DatabaseItem.getItemFromID(tempID).getPrice();
        }
    }
       
    /**
     * 
     * @param status
     */
    public void setInvoiceStatus(InvoiceStatus status)
    {
        this.status = status;
    }
    
    /**
     * 
     * @param isActive
     */
    public void setIsActive(boolean isActive)
    {
        this.isActive = isActive;
    }
    
    /**
     * 
     * @param customer 
     */
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    
    /**
     * Method untuk menampilkan keseluruhan total harga pada invoice
     *
     */
    public abstract String toString();

    
        
    
    
  
    
}
