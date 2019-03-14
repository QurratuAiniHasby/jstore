
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
    public void orderNewItem(Supplier supplier)
    {
        System.out.println("=====Order New Item=====");
        Item item1 = new Item(1, "tas", 12, 30000, ItemCategory.Furniture, ItemStatus.New, supplier);
        Invoice struk1 = new Invoice(1, item1, "3/14/2019", item1.getPrice(), 2, InvoiceStatus.Paid);     
       
        DatabaseItem.addItem(item1);
        
        item1.setStatus(ItemStatus.New);
        struk1.setInvoiceStatus(InvoiceStatus.Paid);
        
        struk1.printData();
        item1.printData();
    }
    
    public void orderSecondItem(Supplier supplier)
    {
        System.out.println("=====Order Second Item=====");
        Item item1 = new Item(1, "tas", 12, 30000, ItemCategory.Furniture, ItemStatus.New, supplier);
        Invoice struk1 = new Invoice(1, item1, "3/14/2019", item1.getPrice(), 2, InvoiceStatus.Paid);     
       
        DatabaseItem.addItem(item1);
        
        item1.setStatus(ItemStatus.Second);
        struk1.setInvoiceStatus(InvoiceStatus.Paid);
        
        struk1.printData();
        item1.printData();
    }
    
    public void orderRefurbishedItem(Supplier supplier)
    {
        System.out.println("=====Order Refurbished Item=====");
        Item item1 = new Item(1, "tas", 12, 30000, ItemCategory.Furniture, ItemStatus.New, supplier);
        Invoice struk1 = new Invoice(1, item1, "3/14/2019", item1.getPrice(), 2, InvoiceStatus.Paid);     
       
        DatabaseItem.addItem(item1);
        
        item1.setStatus(ItemStatus.Refurbished);
        struk1.setInvoiceStatus(InvoiceStatus.Paid);
        
        struk1.printData();
        item1.printData();
    }
    
    public void sellItemPaid(Item item)
    {
        System.out.println("=====Sell Item Paid=====");
        Invoice struk1 = new Invoice(1, item, "3/14/2019", item.getPrice(), 2, InvoiceStatus.Paid);   
        
        struk1.setInvoiceStatus(InvoiceStatus.Paid);
        item.setStatus(ItemStatus.Sold);
        struk1.printData();
    }
    
    public void sellItemUnpaid(Item item)
    {
        System.out.println("=====Sell Item Unpaid=====");
        Invoice struk1 = new Invoice(1, item, "3/14/2019", item.getPrice(), 2, InvoiceStatus.Paid);
        
        struk1.setInvoiceStatus(InvoiceStatus.Unpaid);
        item.setStatus(ItemStatus.Sold);
        struk1.printData();
    }
    
    public void sellItemInstallment(Item item)
    {
        System.out.println("=====Sell Item Installment=====");
        Invoice struk1 = new Invoice(1, item, "3/14/2019", item.getPrice(), 2, InvoiceStatus.Paid);  
        struk1.setInvoiceStatus(InvoiceStatus.Installment);
        item.setStatus(ItemStatus.Sold);
        struk1.printData();
    }
}
