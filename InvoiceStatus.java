
/**
 * Enumeration class InvoiceStatus - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum InvoiceStatus
{
    Paid("paid"), Unpaid("unpaid"), Installment("installment");
    
    String invoice;
    
    InvoiceStatus(String invoice){
        this.invoice = invoice;
    }
    
    public String invoice(){
        return invoice;
    }
}
