/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trader;


/**
 *
 * @author Aaron Villavicencio
 *
 * Account Class 
 */

//import java.util.Arrays;

public class Account {

    private static double interestRate;
    private static double dividendRate;
    
    final int CASH = 0;
    
    //Array of 20 Assets
    final int NUM_ITEMS = 20;
    private Asset[] assetList = new Asset[NUM_ITEMS];
    
    public Account()
    {        
    }
    
    public Account(double deposit)
    {
        assetList[CASH] = new Cash(deposit);
    }
    
    //Increase and decrease cash
    public void deposit(double amount)
    {   
        assetList[CASH].quantity += amount;
          
    }
    
    public void withdraw(double amount)
    {
        assetList[CASH].quantity -= amount;  
    }
    
    //Increase and decrease stock/bond
    public void buy(Asset itemName, int amount)
    {
        for(int index = 1; index < assetList.length; index++)
          {  
              if(assetList[index] == itemName &&
                  assetList[index].getPrice() == itemName.getPrice()) 
              {
                double totalPurchase = assetList[index].getPrice() * amount;
                assetList[index].quantity += amount;
                assetList[CASH].quantity -= totalPurchase;
                //exit
                index = assetList.length;
              } else if(assetList[index] == null)                
              {
                double totalPurchase = itemName.getPrice() * amount;
                assetList[index] = itemName;
                assetList[index].setQuantity(amount);
                assetList[CASH].quantity -= totalPurchase;
                //exit
                index = assetList.length;
              }
          }                
    }
    
    public void sell(Asset itemName, int amount)
    {
        for(int index = 1; index < assetList.length; index++)
        {
            if(itemName == assetList[index])
            {
              if(assetList[index].quantity != 0 
		&& assetList[index].getQuantity() >= amount)
              {
                double totalSalePrice = itemName.getPrice() * amount;
                assetList[index].quantity -= amount;
                assetList[CASH].quantity += totalSalePrice;
                //Exit 
                index = assetList.length;
              } else{
                    System.out.println(
			"You do not have enough of this asset to sell, " 
		        + itemName.getSymbol() );
              }
            }
        }
    }
    
    //add cash to accounts
    public void accrueInterest(Bond item)
    {
       assetList[CASH].quantity += ((item.getQuantity() * item.getPrice()) * (getInterestRate()/100));
    }
    
    public void payDividend(Stock item)
    {
       assetList[CASH].quantity += ((item.getQuantity()* item.getPrice()) * (getDividendRate()/100));
    }
    
    
    public void transferFrom(Account Sender, double c)
    {
        this.deposit(c);
        Sender.withdraw(c);
        
        System.out.println("Transfer of funds was successful!");
        
    }
    
    public void transferTo(Account Receiver, double c)
    {
        Receiver.deposit(c);
        withdraw(c);
        
        System.out.println("Transfer of funds was successful!");
        
    }

    
    public void setInterestRate(double r)
    {
        interestRate = r;
    }
    
    public void setDividendRate(double dr)
    {
        dividendRate = dr;
    }
   
    
    public double getInterestRate()
    {
        return interestRate;
    }
    
    public double getDividendRate()
    {
        return dividendRate;
    }
    
    public void printAsset(int index)
    {
        System.out.println(assetList[index]);
    }
    
    //Output array of Assets
    public void printAssets()
    {
        
        for(int index = CASH; index < assetList.length; index++)
        {
            if(index == CASH)
            {
                System.out.println(assetList[CASH] + "\n");
            }else{
                System.out.println("Asset " + (index +1) + " - " 
		+ assetList[index]);
            }
        }
    }
    
    public int getAssetListLength()
    {
        return assetList.length;
    }
    
    public Account switchAccount(Account accountName)
    {
        return accountName;
    }
    
    
} // EOF
