
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaction
{

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void orderNewItem(Item item)
    {
        System.out.println("=====Order New Item=====");
        Invoice invoice= new Buy_Paid(1, item, "21 Maret 2019", 100, item.getPrice());

        
        if (invoice instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah, Invoice Type bulan Sell_Paid");
        }
    }
    public void orderSecondItem(Item item)
    {
        Invoice invoice= new Buy_Paid(1, item, "21 Maret 2019", 100, item.getPrice());

        if (invoice instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah, Invoice Type bulan Sell_Paid");
        }
    }
    
    public void orderRefurbishedItem(Item item)
    {
        System.out.println("=====Order Refurbished Item=====");
        Invoice invoice= new Buy_Paid(1, item, "21 Maret 2019", 100, item.getPrice());

        
        if (invoice instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah, Invoice Type bulan Sell_Paid");
        }
   }
    
    public void sellItemPaid(Item item, Customer customer)
    {
        System.out.println("=====Sell Item Paid=====");
        Invoice invoice1= new Sell_Paid(2, item, "21 Maret 2019", 100, item.getPrice());
        InvoiceStatus invoicestatus1 = InvoiceStatus.Paid;
        ItemStatus itemstatus1 = ItemStatus.Sold;

        invoice1.setInvoiceStatus(invoicestatus1);
        item.setStatus(itemstatus1);
        
        item.printData();
        invoice1.printData();
    }
    
    public void sellItemUnpaid(Item item, Customer customer)
    {
        Invoice invoice3 = new Sell_Unpaid(3, item, "21 Mar 2019", 100, item.getPrice(), "12-maret 2019");
        InvoiceStatus invoicestatus5 = InvoiceStatus.Unpaid;
        ItemStatus itemstatus3 = ItemStatus.Sold;

        item.setStatus(itemstatus3);

        item.printData();
        invoice3.printData();
    }
    
    public void sellItemInstallment(Item item, Customer customer)
    {
        Invoice invoice4= new Sell_Installment(4, item, "21 Mar 2019", 100, item.getPrice(), 40, 3);
        InvoiceStatus invoicestatus6 = InvoiceStatus.Installment;
        ItemStatus itemstatus4 = ItemStatus.Sold;

        item.setStatus(itemstatus4);

        item.printData();
        invoice4.printData();
    }
}
