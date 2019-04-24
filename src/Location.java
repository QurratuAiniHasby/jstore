/**
 * Kelas yang digunakan untuk informasi lokasi dari supplier
 *
 * @Qurratu Aini Hasby
 * @version 11/04/2019
 */
public class Location
{
    //variabel yang digunakan
    private String province;
    private String description;
    private String city;

    /**
     * Konstruktor dari kelas Supplier
     */
    public Location(String province, String description, String city)
    {
        this.province = province;
        this.description = description;
        this.city = city;
    }

    //Menampilkan nama provinsi
    /**
     * Method getProvince()
     * @return province
     */
    public String getProvince()
    {
        return province;
    }
    
    //Menampilkan deskripsi lokasi
    /**
     * Method getDescription()
     * @return description
     */
    public String getDescription()
    {
        return description;
    }
    
    //Menampilkan nama kota
    /**
     * Method getCity()
     * @return city
     */
    public String getCity()
    {
        return city;
    }
    
     //Mengganti nama provinsi
    /**
     * Method setProvince()
     * @param province
     */
    public void setProvince(String province)
    {
        this.province = province;
    }
    
    //Mengganti deskripsi lokasi
    /**
     * Method setDescription()
     * @param description
     */
    public void setDescription(String description)
    {
        this.description = description;
    }
    
     //Mengganti nama kota
    /**
     * Method setCity()
     * @param city
     */
    public void setCity(String city)
    {
        this.city = city;
    }
    
    //Mencetak nama provinsi
    /**
     * Method printData()
     */
     public String toString() 
    { 
        System.out.println("==========LOCATION==========");
        System.out.println("Provinsi : " + province);
        System.out.println("Kota : " + city);
        System.out.println("Deskripsi : " + description);
        return ""; 
    }
}
