package jstore;
/**
 * Write a description of class InvoiceAlreadyExistsException here.
 *
 * @author Qurratu Aini Hasby
 * @version 18/4/2019
 */
public class InvoiceAlreadyExistsException extends Exception
{
    // instance variables - replace the example below with your own
    private Invoice invoice_error;


    public InvoiceAlreadyExistsException(Invoice invoice_input){
        super(" Invoice with Item list: ");
        this.invoice_error= invoice_input;
        getMessage();

    }

    public String getMessage(){
    return super.getMessage() + invoice_error.getItem() + " already ordered by " + invoice_error.getCustomer().getUsername();

    }
}
