package jstore;
/**
 * Write a description of class CustomerNotFoundException here.
 *
 * @author Qurratu Aini Hasby
 * @version 18/4/2019
 */
public class CustomerNotFoundException extends Exception
{
    // instance variables - replace the example below with your own
    private int customer_error;


    public CustomerNotFoundException(int customer_input){
        super("Customer ID: ");
        this.customer_error= customer_input;
        getMessage();

    }

    public String getMessage(){
       return super.getMessage() + customer_error + " not found.";

    }
}
