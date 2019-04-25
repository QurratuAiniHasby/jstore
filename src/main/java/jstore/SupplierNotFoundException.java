package jstore;
/**
 * Write a description of class SupplierNotFoundException here.
 *
 * @author Qurratu Aini Hasby
 * @version 18/4/2019
 */
public class SupplierNotFoundException extends Exception
{
    // instance variables - replace the example below with your own
    private int supplier_error;

   /**
     * Constructor for objects of class SupplierNotFoundException
     */
    public SupplierNotFoundException(int supplier_input){
        super();
        this.supplier_error= supplier_input;
        getMessage();

    }

    public String getMessage(){
      return super.getMessage() + supplier_error + " not found.";

    }

}
