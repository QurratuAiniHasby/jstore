package jstore;
/**
 * Write a description of class CustomerAlreadyExistsException here.
 *
 * @author Qurratu Aini Hasby
 * @version 18/4/2019
 */
public class CustomerAlreadyExistsException extends Exception
{
    // instance variables - replace the example below with your own
    private Customer customer_error;


    public CustomerAlreadyExistsException(Customer customer_input){
        super("Customer Email: ");
        this.customer_error= customer_input;
        getMessage();

    }

    public String getMessage(){
       return super.getMessage() + customer_error.getEmail() + " ,or Username:"+ customer_error.getUsername() + " already exists.";

    }
}
