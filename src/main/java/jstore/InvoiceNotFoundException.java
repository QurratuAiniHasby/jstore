package jstore;
/**
 * Write a description of class InvoiceNotFoundException here.
 *
 * @author Qurratu Aini Hasby
 * @version 18/4/2019
 */
public class InvoiceNotFoundException extends Exception
{
    // instance variables - replace the example below with your own
    private int invoice_error;


    public InvoiceNotFoundException(int invoice_input){
        super("Invoice ID: ");
        this.invoice_error= invoice_input;
        getMessage();

    }

    public String getMessage(){
     return super.getMessage() + invoice_error + " not found.";
    }
}
