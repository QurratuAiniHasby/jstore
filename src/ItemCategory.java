
/**
 * Enumeration class ItemCategory - write a description of the enum class here
 *
 * @author Qurratu Aini Hasby
 * @version 11/04/2019
 */
public enum ItemCategory
{
    Electronics("elektronik"), Furniture("furnitur"), Stationery("stationery");
    
    private String category;
    
    private ItemCategory(String category){
        this.category = category;
    }
    
    public String toString(){
        return category;
    }
}
