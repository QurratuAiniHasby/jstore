
/**
 * Enumeration class ItemStatus - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum ItemStatus
{
    New("new"), Second("second"), Refurbished("refurbished"), Sold("sold");
    
    String status;
    
    ItemStatus(String status){
        this.status = status;
    }
    
    public String status(){
        return status;
    }
}
