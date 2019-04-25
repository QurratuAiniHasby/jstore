package jstore;
/**
 * Enumeration class InvoiceType - write a description of the enum class here
 *
 * @author Qurratu Aini Hasby
 * @version 11/04/2019
 */
public enum InvoiceType
{
    Buy("Beli"), Sell("Jual");    
    
    private String type;
    
    private InvoiceType(String type){
        this.type = type;
    }
    
    public String toString(){
        return type;
    }
}
