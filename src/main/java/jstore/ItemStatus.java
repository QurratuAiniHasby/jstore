package jstore;
/**
 * Enumeration class ItemStatus - write a description of the enum class here
 *
 * @author Qurratu Aini Hasby
 * @version 11/04/2019
 */
public enum ItemStatus
{
   New("new"), Second("second"), Refurbished("refurbished"), Sold("sold");
    
    private String status;
    
    private ItemStatus(String status)
    {
        this.status = status;
    }
    
    public String toString()
    {
        return status;
    }
}
