package jstore;
import java.util.*;
import java.text.*;
/**
 * child dari class invoice
 *
 * @author Qurratu Aini Hasby
 * @version 11/04/2019
 */
public class Sell_Paid extends Invoice
{
    private static InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private Customer customer;
    private boolean isActive;
    private SimpleDateFormat dateFormat = new SimpleDateFormat ("dd MMM yyy");

    /**
     * Constructor for objects of class Sell_Paid
     */
    public Sell_Paid(ArrayList<Integer> item, Customer customer)
    {
        super(item);
        isActive = false;
    }

    /**
     * An 
     *
     * @param  
     * @return
     */
    public Customer getCustomer()
    {
        return customer;
    }
    
    /**
     * An 
     *
     * @param 
     * @return
     */
    @Override
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    /**
     * An 
     *
     * @param  
     * @return 
     */
    @Override
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    
    /**
     *
     * @param
     * @return
     */
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    
    /**
     * 
     *
     */    
    @Override
    public String toString()
    {
        String string="==========INVOICE=======";
        string += "\nID ="+getId();
        string += "\nBuy date =" + getDate();
        for (Integer invoice : getItem())
        {
            Item item = DatabaseItem.getItemFromID(invoice.intValue());
            string += "\nItem: " + item.getName();
            string += "\nAmount: " + getItem().size();
            string += "\nPrice: " + item.getPrice();
            string += "\nSupplier ID: " + item.getSupplier().getId();
            string += "\nSupplier Name: " + item.getSupplier().getName();
        }
        return "===============INOVOICE==============="
       + "\nPrice Total: " + getTotalPrice()
       + "\nCustomer Name: " + customer
       + "\nStatus: " + INVOICE_STATUS
       + "\nSell Success";
        
        
    }
}