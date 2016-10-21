/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trader;

import java.util.ArrayList;

/**
 *
 * @author linux
 */
public class User {
    
    private String username;
    private String password;
    private String name;
    private String email;
    private String address;
    ArrayList<String> depositAccounts = new ArrayList<String>();
    ArrayList<String> withdrawAccounts = new ArrayList<String>();
    
    public User()
    {
        
    }
    
    public User(String u, String p, String n, String e, String a)
    {
        this.setUsername(u);
        this.setPassword(p);
        this.setName(n);
        this.setEmail(e);
        this.setAddress(a);
        
    }
    
    
    public User(String u, String p, String n, String e, String a, ArrayList dList, ArrayList wList)
    {
        this.setUsername(u);
        this.setPassword(p);
        this.setName(n);
        this.setEmail(e);
        this.setAddress(a);
        this.setDepositAccounts(dList);
        this.setWithdrawAccounts(wList);
        
    }
    
    public String toString()
    {
        return "Username: " + this.getUsername() + "\n " +
            "Name: " + this.getName() + "\n " +
            "Email: " + this.getEmail() + "\n " +
            "Address: " + this.getAddress() + "\n\n";
    }
    
    public void setUsername(String u)
    {
        username = u; 
    }
  
    public void setPassword(String p)
    {
        password = p;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public void setEmail(String e)
    {
        email = e;
    }
    
    public void setAddress(String n)
    {
        address = n;
    }
    
    public void setDepositAccounts(ArrayList list)
    {
        depositAccounts = list;
    }
    
    public void setWithdrawAccounts(ArrayList list)
    {
        withdrawAccounts = list;
    }
    
    public String getUsername()
    {
        return username;
    }
    
     public String getPassword()
    {
        return password;
    }
     
      public String getName()
    {
        return name;
    }
      
       public String getEmail()
    {
        return email;
    }
       
        public String getAddress()
    {
        return address;
    }
}
