package jstore;
import java.util.*;
/**
 * Write a description of class JStore here.
 *
 * @author Qurratu Aini Hasby
 * @version 18/4/2019
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication

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
                    "081208921453", lokasi));
        }
        catch (SupplierAlreadyExistsException a)
        {
            System.out.println(a.getMessage());
        }
        try
        {
            DatabaseSupplier.addSupplier(new Supplier("Dila", "dila@gmail.com",
                    "081208921453", lokasi));
        }
        catch (SupplierAlreadyExistsException a)
        {
            System.out.println(a.getMessage());
        }
        try
        {
            DatabaseSupplier.addSupplier(new Supplier("Aldin", "aldin@gmail.com",
                    "081280921843", lokasi));
        }
        catch (SupplierAlreadyExistsException a)
        {
            System.out.println(a.getMessage());
        }

        /**for(Supplier data : DatabaseSupplier.getSupplierDatabase())
        {
            data.toString();
        }*/

        try
        {
            DatabaseCustomer.addCustomer(new Customer("haha", "haha@gmail.com",
                    "hahai", "h4h4cAn", 1998, 4, 10));
        }
        catch (CustomerAlreadyExistsException a)
        {
            System.out.println(a.getMessage());
        }
        try
        {
            DatabaseCustomer.addCustomer(new Customer("erna", "erna@gmail.com",
                    "erna", "ern4cAn", 1998, 4, 10));
        }
        catch (CustomerAlreadyExistsException a)
        {
            System.out.println(a.getMessage());
        }
        try
        {
            DatabaseCustomer.addCustomer(new Customer("tina", "tina@yahoo.com",
                    "tina", "t1nAcAn", 1998, 4, 10));
        }
        catch (CustomerAlreadyExistsException a)
        {
            System.out.println(a.getMessage());
        }

        /**for(Customer data : DatabaseCustomer.getCustomerDatabase())
        {
            data.toString();
        }*/

        try
        {
            DatabaseItem.addItem(new Item("hp", 10, 50000,
                    ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(1)));
        }
        catch (ItemAlreadyExistsException a)
        {
            System.out.println(a.getMessage());
        }
        try
        {
            DatabaseItem.addItem(new Item("toshiba", 12, 40000,
                    ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(2)));
        }
        catch (ItemAlreadyExistsException a)
        {
            System.out.println(a.getMessage());
        }
        try
        {
            DatabaseItem.addItem(new Item("lenovo", 15, 70000,
                    ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(3)));
        }
        catch (ItemAlreadyExistsException a)
        {
            System.out.println(a.getMessage());
        }

        /**for(Item data : DatabaseItem.getItemDatabase())
        {
            data.toString();
        }*/

        ArrayList<Integer> item = new ArrayList<Integer>();
        item.add(DatabaseItem.getItemFromID(1).getId());
        item.add(DatabaseItem.getItemFromID(2).getId());
        try
        {
            DatabaseInvoice.addInvoice(new Sell_Installment(item,5, DatabaseCustomer.getCustomer(1)));
        }
        catch (InvoiceAlreadyExistsException a)
        {
            System.out.println(a.getMessage());
        }

        ArrayList<Integer> item2 = new ArrayList<Integer>();
        item2.add(DatabaseItem.getItemFromID(1).getId());
        item2.add(DatabaseItem.getItemFromID(3).getId());
        try
        {
            DatabaseInvoice.addInvoice(new Sell_Unpaid(item2, DatabaseCustomer.getCustomer(2)));
        }
        catch (InvoiceAlreadyExistsException a)
        {
            System.out.println(a.getMessage());
        }

        SpringApplication.run(JStore.class, args);
    }
}