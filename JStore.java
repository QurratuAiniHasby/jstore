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
               
        home.printData();
        supplier1.printData();
        
        Transaction bayar = new Transaction();
        bayar.orderNewItem(supplier1);
        Transaction tesbayar = new Transaction();
        tesbayar.orderNewItem(supplier1);
        tesbayar.orderSecondItem(supplier1);
        tesbayar.orderRefurbishedItem(supplier1);
        tesbayar.sellItemPaid(DatabaseItem.getItem());
        tesbayar.sellItemUnpaid(DatabaseItem.getItem());
        tesbayar.sellItemInstallment(DatabaseItem.getItem());
    }
            
}
