/**
 * Write a description of class Location here.
 *
 * @Qurratu Aini Hasby
 * @version 2.0
 * Since 28/01/2019
 */
public class Location
{
    private String province;
    private String description;
    private String city;

    /**
     * Constructor untuk class Location
     */
    public Location(String province, String description, String city)
    {
        this.province = province;
        this.description = description;
        this.city = city;
    }

    /**
     * Metode untuk mendapatkan lokasi dari supplier
     */
    public String getProvince()
    {
        return province;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public String getCity()
    {
        return city;
    }
    
    public void setProvince(String province)
    {
        this.province = province;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    public void setCity(String city)
    {
        this.city = city;
    }
    
    public void printData()
    {
        System.out.println("Province" + province);
        System.out.println("Description" + description);
        System.out.println("City" + city);
    }
}
