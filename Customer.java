    import java.util.Calendar;
    import java.util.GregorianCalendar;
    import java.text.SimpleDateFormat;
    import java.util.*;
    import java.text.*;
    import java.util.regex.*;
    /**
     * Write a description of class Customer here.
     *
     * @author (your name)
     * @version (a version number or a date)
     */
 public class Customer
    {
        // instance variables - replace the example below with your own
        private String name;
        private String email;
        private String username;
        private String password;
        private int id;
        private Calendar birthDate;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(String name, String email, String username, String password, int id, Calendar birthDate)
    {
        // initialise instance variables
        this.name=name;
        this.email=email;
        this.username=username;
        this.password=password;
        this.id=id;
        this.birthDate=birthDate;
         
    }
   
    public Customer(String name, String email, String username, String password, int id, int year, int month, int dayOfMonth)
    {
        // initialise instance variables
        this.name=name;
        this.email=email;
        this.username=username;
        this.password=password;
        this.id=id;
        this.birthDate=birthDate;
        this.birthDate = new GregorianCalendar(year, month, dayOfMonth);
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
         // SimpleDateFormat ft = new SimpleDateFormat("dd MMMMMMMMMMMMMM YYY");
        // System.out.println("Birth Date:" + ft.format(birthDate.getTime()));
        // return birthDate;
        System.out.printf("%1$s %2$td %2$tB %2$tY", "Birth date:", birthDate);
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
        String pattern =  "^[a-zA-Z0-9_+&*-]+(?:\\."+  
                            "[a-zA-Z0-9_+&*-]+)*@" +  
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +  
                            "A-Z]{2,7}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);
        if (m.find()) {
            System.out.println("Email : " + m.group());
            this.email = email;
        } else {
            System.out.println("Email : null");
            this.email = email;
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
        return "";
    }
}