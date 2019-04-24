
/**
 * Write a description of class ItemNotFoundException here.
 *
 * @author Qurratu Aini Hasby
 * @version 18/4/2019
 */
public class ItemNotFoundException extends Exception
{
    // instance variables - replace the example below with your own
    private int item_error;


    public ItemNotFoundException(int item_input){
        super("Item ID: ");
        this.item_error= item_input;

    }

    public String getExMessage(){
     return super.getMessage() + item_error + " not found.";
    }
}
