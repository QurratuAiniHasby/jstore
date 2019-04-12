import java.util.*;
import java.text.*;
/**
 * child dari class invoice
 *
 * @author Qurratu Aini Hasby
 * @version 11/04/2019
 */
public class Sell_Installment extends Invoice
{
    private static InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;
    private boolean isActive; 
    private SimpleDateFormat dateFormat = new SimpleDateFormat ("dd MMM yyy");
    
    /**
     * Constructor untuk class Sell_Installment
     */
    public Sell_Installment(ArrayList<Integer> item, int installmentPeriod,
    Customer customer)
    {
        super(item);
        this.installmentPeriod = installmentPeriod;
        this.isActive = true;
    }

    /**
     *
     * @return installmentPeriod
     */
    public int getInstallmentPeriod()
    {
        return installmentPeriod;
    }
    
    /**
     *
     * @return installmentPrice
     */
    public int getInstallmentPrice()
    {
        return installmentPrice;
    }
    
    /**
     *  
     * @return INVOICE_STATUS
     */
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    /**
     * 
     * @return INVOICE_TYPE
     */
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    
    /**
     *  
     * @return customer
     */
    public Customer getCustomer()
    {
        return customer;
    }
    
    /**
     * 
     * @param totalPrice
     * @return InstallmentPrice
     */
    public void setInstallmentPrice(int totalPrice)
    {
        installmentPrice = (int)(1.02 * (totalPrice / installmentPeriod));
    }
    
    /**
     * 
     * @param installmentPeriod
     * @return
     */
    public void setTotalPrice(int installmentPeriod)
    {
        int totalPrice = installmentPrice * installmentPeriod;
        super.setTotalPrice(totalPrice);
    }
    
    /**
     * 
     * @return customer
     */
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    
    /**
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
            System.out.println("Harga = " + 
            DatabaseItem.getItemFromID(tempID).getPrice());
            System.out.println("Supplier ID = " + 
            DatabaseItem.getItemFromID(tempID).getSupplier().getId());
            System.out.println("Supplier name = " + 
            DatabaseItem.getItemFromID(tempID).getSupplier().getName());
        }
        System.out.println("Buy date = " + dateFormat.format(super.getDate().getTime()));
        System.out.println("Price total = " + super.getTotalPrice());
        System.out.println("Installment price = " + installmentPrice);
        System.out.println("Customer ID = " + customer.getId());
        System.out.println("Customer name = " + customer.getName());
        System.out.println("Status = " + INVOICE_STATUS);
        System.out.println("Installment period = " + installmentPeriod);
        System.out.println("Sell success.");
        return "";
    }
 }