import java.util.*;
import java.text.*;
import java.util.regex.*;
    /**
     * Kelas yang berisi informasi seorang customer.
     *
     * @author Qurratu Aini Hasby
     * @version 11/04/2019
     */
    
public class Customer
{
        // instance variables - replace the example below with your own
        private int id;
        private String name;
        private String email;
        private String username;
        private String password;
        private Calendar birthDate;
        private SimpleDateFormat dateFormat = new SimpleDateFormat ("dd MMM yyy");

    /**
     * Constructor for objects of class Customer
     */
    public Customer(String name, String email, String username, String password, 
    Calendar birthDate)
    {
        this.id = DatabaseCustomer.getLastCustomerID() + 1;
        this.name = name; 
        this.email = email;
        this.username = username;
        this.password = password;
        this.birthDate = birthDate;
    }
    
    public Customer(String name, String email, String username, String password, 
    int year, int month, int dayOfMonth)
    {
        this.id = DatabaseCustomer.getLastCustomerID() + 1;
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.id = id;
        this.birthDate = new GregorianCalendar(year, (month-1), dayOfMonth);
    }

    /**
    * An example of a method - replace this comment with your own
    *
    * @param  y  a sample parameter for a method
    * @return    the sum of x and y
    */
    public String getName()
    {
        // put your code here
        return name;
    }
    
    public String getEmail()
    {
        // put your code here
         
        return email;
    }
    
    public String getUsername()
    {
        // put your code here
        return username;
    }
    
    public String getPassword()
    {
        // put your code here
        return password;
    }
    
    public int getId()
    {
        // put your code here
        return id;
    }
    
    public Calendar getBirthDate()
    {
        System.out.println("Birth date: " + dateFormat.format(birthDate.getTime()));
        return birthDate;
    }
    
    public void setName(String name)
    {
        // put your code here
        this.name=name;
    }
    
    public void setEmail(String email)
    {
        // put your code here
        if(Pattern.matches("^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$", email))
        {
            this.email = email;
        }
        else
        {
            this.email = "";
        }
    }
    
    public void setUsername(String username)
    {
         if(Pattern.matches("\\w+[\\_\\.\\&\\*\\~]?\\w+\\@\\w+\\-", email))
        {
            this.email = email;
        }
        else
        {
            this.email = "";
        }
    }
    public void setPassword(String password)
    {
        if(Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$", password))
        {
            this.password = password;
        }
        else
        {
            this.password = "";
        }
    }
    
    public void setId(int id)
    {
        // put your code here
        this.id=id;
    }
    
    public void setBirthDate(Calendar birthDate)
    {
        // put your code here
        this.birthDate=birthDate;
    }
    
    public void setBirthDate(int year, int month, int dayOfMonth)
    {
        // put your code here
        
    }
    
   public String toString()
    {
        // put your code here
       return name + "" + email + "" + username + "" + password + "" + id + "" + birthDate + "";
    }
}