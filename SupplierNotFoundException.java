
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

    }

    public String getExMessage(){
      return super.getMessage() + supplier_error + " not found.";

    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getMessage()
    {
        // put your code here
        return "";
    }
}
