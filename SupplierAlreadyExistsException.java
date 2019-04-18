
/**
 * Write a description of class SupplierAlreadyExistsException here.
 *
 * @author Qurratu Aini Hasby
 * @version 18/4/2019
 */
public class SupplierAlreadyExistsException extends Exception {
    private Supplier supplier_error;


    public SupplierAlreadyExistsException(Supplier supplier_input){
        super("Supplier ID: ");
        this.supplier_error=supplier_input;

    }

    public String getExMessage(){
        return super.getMessage() + supplier_error.getEmail() + " ,or phoneNumber: " + supplier_error.getPhoneNumber()+" already exists.";

    }

}