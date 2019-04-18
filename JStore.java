import java.util.*;
/**
 * Write a description of class JStore here.
 *
 * @author Qurratu Aini Hasby
 * @version 18/4/2019
 */

public class JStore
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class JStore
     */
    public JStore()
    {
        // initialise instance variables
    }

    /**
     * Fungsi utama yang akan dijalankan
     */    
    public static void main(String[] args)
    {
        Location lokasi = new Location("Bekasi", "JABAR", "Home");

        try
        {
            DatabaseSupplier.addSupplier(new Supplier("Dhea", "dhea@gmail.com",
                    "081283949086", lokasi));
        }
        catch (SupplierAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
        try
        {
            DatabaseSupplier.addSupplier(new Supplier("Dila", "dila@gmail.com",
                    "081208921453", lokasi));
        }
        catch (SupplierAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
        try
        {
            DatabaseSupplier.addSupplier(new Supplier("Up", "upi@yahoo.com",
                    "081278192781", lokasi));
        }
        catch (SupplierAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }

        for(Supplier data : DatabaseSupplier.getSupplierDatabase())
        {
            data.toString();
        }

        try
        {
            DatabaseCustomer.addCustomer(new Customer("aldy", "aldy@yahoo.com",
                    "aldy", "ald1gAn", 1998, 4, 10));
        }
        catch (CustomerAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
        try
        {
            DatabaseCustomer.addCustomer(new Customer("jati", "jati@yahoo.com",
                    "jati", "jAt1gAn", 1998, 8, 15));
        }
        catch (CustomerAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
        try
        {
            DatabaseCustomer.addCustomer(new Customer("tina", "tina@yahoo.com",
                    "tina", "t1nAgAn", 1998, 4, 10));
        }
        catch (CustomerAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }

        for(Customer data : DatabaseCustomer.getCustomerDatabase())
        {
            data.toString();
        }

        try
        {
            DatabaseItem.addItem(new Item("asus", 10, 5000,
                    ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(1)));
        }
        catch (ItemAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
        try
        {
            DatabaseItem.addItem(new Item("acer", 12, 3000,
                    ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(2)));
        }
        catch (ItemAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
        try
        {
            DatabaseItem.addItem(new Item("lenovo", 15, 6000,
                    ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(3)));
        }
        catch (ItemAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }

        for(Item data : DatabaseItem.getItemDatabase())
        {
            data.toString();
        }

        ArrayList<Integer> item = new ArrayList<Integer>();
        item.add(DatabaseItem.getItemFromID(1).getId());
        item.add(DatabaseItem.getItemFromID(2).getId());
        try
        {
            DatabaseInvoice.addInvoice(new Sell_Installment(item,
                    5, DatabaseCustomer.getCustomer(1)));
        }
        catch (InvoiceAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }

        ArrayList<Integer> item2 = new ArrayList<Integer>();
        item2.add(DatabaseItem.getItemFromID(1).getId());
        item2.add(DatabaseItem.getItemFromID(3).getId());
        try
        {
            DatabaseInvoice.addInvoice(new Sell_Unpaid(item2,
                    DatabaseCustomer.getCustomer(2)));
        }
        catch (InvoiceAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
    }
}