
/**
 * Enumeration class InvoiceStatus - write a description of the enum class here
 *
 * @author Qurratu Aini Hasby
 * @version 11/04/2019
 */
public enum InvoiceStatus
{
    Paid("paid"), Unpaid("unpaid"), Installment("installment");
    
    private String invoice;
    
    private InvoiceStatus(String invoice){
        this.invoice = invoice;
    }
    
    public String toString(){
        return invoice;
    }
}
