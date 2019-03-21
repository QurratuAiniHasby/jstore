
/**
 * Enumeration class ItemCategory - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum ItemCategory
{
    Electronics("elektronik"), Furniture("furnitur"), Stationery("stationery");
    
    String category;
    
    ItemCategory(String category){
        this.category = category;
    }
    
    public String kategori(){
        return category;
    }
}
