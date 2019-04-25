package jstore;
import java.util.*;
import java.text.*;
/**
 * child dari class invoice
 *
 * @author Qurratu Aini Hasby
 * @version 11/04/2019
 */
public class Buy_Paid extends Invoice
{
   // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE = InvoiceType.Buy;
    private static InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private boolean isActive;
    private SimpleDateFormat dateFormat = new SimpleDateFormat ("dd MMM yyy");
    
    /**
     * Constructor for objects of class Buy_Paid
     */
    public Buy_Paid(ArrayList<Integer> item)
    {
        super(item);
        isActive = false;
    }

    /**
     * An example 
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
     * An example of our own
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
     *
     */    
    @Override
    public String toString()
    {
        System.out.println("ID = " + super.getId());
        ArrayList<Integer> listItemID = DatabaseInvoice.getInvoice(super.getId()).getItem();
        for(int tempID : listItemID)
        {
            System.out.println("Item = " + 
            DatabaseItem.getItemFromID(tempID).getName());
            System.out.println("Price = " + 
            DatabaseItem.getItemFromID(tempID).getPrice());
            System.out.println("Supplier ID = " + 
            DatabaseItem.getItemFromID(tempID).getSupplier().getId());
            System.out.println("Supplier name = " + 
            DatabaseItem.getItemFromID(tempID).getSupplier().getName());
        }
        System.out.println("Buy date = " + dateFormat.format(super.getDate().getTime()));
        System.out.println("Price total = " + super.getTotalPrice());
        System.out.println("Status = " + this.getInvoiceStatus());
        System.out.println("Buy success.");
        return "";
    }
    }