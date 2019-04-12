import java.util.*; 
import java.text.*;
/**
 * child dari class invoice
 *
 * @author Qurratu Aini Hasby
 * @version 11/04/2019
 */ 
public class Sell_Unpaid extends Invoice
{
    private static InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS = InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Customer customer;
    private boolean isActive;
    private SimpleDateFormat dateFormat = new SimpleDateFormat ("dd MMM yyy");
    
    /**
     * Constructor for objects of class Sell_Unpaid
     */
    public Sell_Unpaid(ArrayList<Integer> item, Customer customer)
    {
        super(item);
        this.dueDate = new GregorianCalendar();
        dueDate.add((GregorianCalendar.DATE), 1);
        this.customer = customer;
        this.isActive = true;
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
    public Calendar getDueDate()
    {
        return dueDate;
    }
    
    /**
     * An 
     *
     * @param   
     * @return 
     */
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    
    /**
     * An 
     *
     * @param   
     * @return 
     */
    public void setDueDate(Calendar dueDate)
    {
        this.dueDate = dueDate;
    }
    
    /**
     * Me
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
        System.out.println("Customer ID = " + customer.getId());
        System.out.println("Customer name = " + customer.getName());
        System.out.println("Status = " + INVOICE_STATUS);
        System.out.println("Due date = " + dateFormat.format(dueDate));
        System.out.println(
        "If payment is not received by dueDate, transaction will be cancelled.");
        return "";
    }    
}
        