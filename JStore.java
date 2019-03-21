import java.util.*;
/**
 * Write a description of class JStore here.
 *
 * @author Qurratu Aini Hasby
 * @version (a version number or a date)
 */

public class JStore
{
    // instance variables - replace the example below with your own
       /**
     * Constructor for objects of class JStore
     */
    public JStore()
    {
        
    }
    
    public static void main(String[] args)
    {
        Location home = new Location("JABAR", "Ramai", "Bekasi");
        Supplier supplier1 = new Supplier(1, "Aini", "qurratuainihasby@gmail.com", "081283929086", home);
        Transaction Transaction = new Transaction();
        Item item = new Item(1, "Tas", 100, 10000, ItemCategory.Electronics, ItemStatus.New, supplier1);
        
        DatabaseItem.addItem(item);
        Transaction.orderNewItem(item);
        Transaction.sellItemPaid(item);
        Transaction.sellItemUnpaid(item);
        Transaction.sellItemInstallment(item);
    }
            
}
