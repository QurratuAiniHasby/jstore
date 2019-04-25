package jstore;
/**
 * Kelas untuk mendapatkan data supplier dengan lokasinya
 *
 * @author Qurratu Aini Hasby
 * @version 11/04/2019
 */
public class Supplier
{
    //variabel yang digunakan
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private static Location location;

    /**
     * Konstruktor dari kelas Supplier
     */
    public Supplier(String name, String email, String phoneNumber, Location location)
    {
        this.id = DatabaseSupplier.getLastSupplierID() + 1;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }
    
    //Menampilkan nomor id supplier
    /**
     * Method getId()
     * @return id supplier
     */
    public int getId()
    {
        return id;
    }
    
    //Menampilkan nama supplier
    /**
     * Method getName()
     * @return nama supplier
     */
    public String getName()
    {
        return name;
    }
    
    //Menampilkan email supplier
    /**
     * Method getEmail()
     * @return email supplier
     */
    public String getEmail()
    {
        return email;
    }
    
    //Menampilkan nomor telepon supplier
    /**
     * Method getPhoneNumber()
     * @return phoneNumber supplier
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    //Menampilkan lokasi supplier
    /**
     * Method getLccation()
     * @return lokasi supplier
     */
    public Location getLocation()
    {
        return location; 
    }
    
    //Mengubah id supplier
    /**
     * Method setId()
     * @param id
     */
    public void setId(int id)
    {
        this.id = id;
    }
    
    //Mengubah nama supplier
    /**
     * Method setName()
     * @param name
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    //Mengubah email supplier
    /**
     * Method setEmail()
     * @param email
     */
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    //Mengubah nomor telepon supplier
    /**
     * Method setPhoneNumber()
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
    //Mengubah lokasi supplier
    /**
     * Method setLocation()
     * @param location
     */
    public void setLocation(Location location)
    {
        this.location = location;
    }
    
    //Mencetak nama supplier
    /**
     * Method printData()
     */
     public String toString() 
    { 
        System.out.println("==========SUPPLIER==========");
        System.out.println("ID : " + id);
        System.out.println("Nama supplier : " + name);
        System.out.println("Email : " + email);
        System.out.println("Nomor telepon : " + phoneNumber);
        System.out.println("Lokasi : " + location.getCity());
        return ""; 
    }
}
