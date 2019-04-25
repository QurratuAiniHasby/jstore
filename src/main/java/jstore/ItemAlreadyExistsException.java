package jstore;
/**
 * Write a description of class ItemAlreadyExistsException here.
 *
 * @author Qurratu Aini Hasby
 * @version 18/4/2019
 */
public class ItemAlreadyExistsException extends Exception
{
    private Item item_error;


    public ItemAlreadyExistsException(Item item_input){
        super("Item Name: ");
        this.item_error= item_input;
        getMessage();

    }

    public String getMessage(){
      return super.getMessage() + item_error.getName() + " ,Category: " + item_error.getCategory() +" ,Status: " + item_error.getStatus() + " from: " + item_error.getSupplier().getName()+ " already exists.";
    }

}