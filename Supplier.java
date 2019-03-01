/**
 * Kelas untuk mendapatkan data supplier dari JStore
 *
 * @Qurratu Aini Hasby
 * @version 2.0
 * Since 28/01/2019
 */
public class Supplier
{
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private static Location location;

    /**
     * Constructor untuk objek dari class Supplier
     */
    public Supplier(int id, String name, String Email, String phoneNumber, Location location)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }
    
    /**
     * Metode untuk mendapatkan nilai dari variable yang telah diinisiasikan
     *
     */
    public int getId()
    {
        return id; //untuk mendapatkan nilai dari hasil setIId
    }
    
    public String getName()
    {
        return name; //metode untuk mendapatkan nama supplier dari metode setNamae
    }
    
    public String getEmail()
    {
        return email; //metode untuk mendapatkan email supplier dari metode setEmail
    }
    
    public String getPhoneNumber()
    {
        return phoneNumber; //metode untuk mendapatkan nomor HP dari metode setPhoneNumber
    }
    
    public Location getLocation()
    {
        return location; //metode untuk mendapatkan lokasi dari metode setLocation
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setName(String name)
    {
        this.name = name; //metode untuk menetapkan nama dari supplier
    }
    
    public void setEmail(String email)
    {
        this.email = email; //metode untuk menetapkan email dari supplier
    }
    
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber; //metode untuk menetapkan nilai nomorHP dari supplier
    }
    
    public void setLocation(Location location)
    {
        this.location = location; //metode untuk menetapkan lokasi dari supplier yang didapatkan dari class location
    }
    
    public void printData()//metode untuk mencetak nilai-nilai yang telah didapatkan dari metode get
    {
        System.out.println("id" + id);
        System.out.println("Nama supplier" + name);
        System.out.println("Email" + email);
        System.out.println("Nomor HP supplier" + phoneNumber);
        System.out.println("Lokasi dari supplier" + location);
    }
}
