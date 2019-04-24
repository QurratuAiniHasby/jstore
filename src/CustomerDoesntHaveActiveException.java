
/**
 * Write a description of class CustomerDoesntHaveActiveException here.
 *
 * @author Qurratu Aini Hasby
 * @version 18/4/2019
 */
public class CustomerDoesntHaveActiveException extends Exception
{
    // instance variables - replace the example below with your own
    private Customer customer_error;


    public CustomerDoesntHaveActiveException(Customer customer_input){
        super("Customer: ");
        this.customer_error= customer_input;

    }

    public String getExMessage(){
     return super.getMessage() + customer_error + " \n doesnt have active invoice";
    }
}
