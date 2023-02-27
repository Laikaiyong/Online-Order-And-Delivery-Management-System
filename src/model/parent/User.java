package model.parent;

import misc.Security;

public class User {
     /**
     * Attributes
     */
    public String personalId;
    public String username;
    public String password;
    public char gender;
    
    /*
    * Setters
    */
    public void setUsername(String userName)
    {
        this.username = userName;
    }
    
    public void setPersonalId(String customerPersonalId)
    {
        this.personalId = customerPersonalId;
    }
    
    public void setGender(char customerGender)
    {
        this.gender = customerGender;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
 
    /*
    * Getters
    */
    public String getUsername()
    {
        return this.username;
    }
    
    public String getPersonalId()
    {
        return this.personalId;
    }
    
    public char getGender()
    {
        return this.gender;
    }
    
    public String getPassword()
    {
        return this.password;
    }
    
    // Login to Access System. 
    public Object login(String username, String password)
    {
        Security secureAgent = new Security();
        secureAgent.decrypt(password);
        return new User();
    }
}
