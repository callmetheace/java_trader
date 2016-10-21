/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trader;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Aaron Villavicencio
 * 
 * Trading software
 * 
 * Driver
 */

public class Driver {

    public static void main(String[] args) {
      
        
        //Array of stocks/bonds FEED
        Asset[] marketList = {
            new Stock("GOOG", 570, 0),
            new Stock("AAPL", 125, 0),
            new Stock("BAC", 16, 0),
            new Stock("JPM", 50, 0),
            new Stock("C", 44, 0),
            new Stock("NFLX", 225, 0),
            new Stock("TSLA", 97, 0),
            new Stock("F", 7, 0),
            new Stock("WMT", 78, 0),
            new Stock("AMZN", 345, 0),
            new Stock("EBAY", 54, 0),
            new Bond("A17", 100, 0),
            new Bond("A20", 100, 0),
            new Bond("A22", 100, 0),
            new Bond("A23", 100, 0),
            new Bond("AA17", 100, 0),
            new Bond("AA18A", 100, 0),
            new Bond("AA19", 98, 0),
            new Bond("AAPL22", 100, 0),
            new Bond("AA37", 99, 0),
            
        }; 
        
        //Margin Accounts
        double STARTING_BALANCE = 100000;
        Account MyAccount = new Account(STARTING_BALANCE);
        Account YourAccount = new Account(STARTING_BALANCE);
        
        //Initialize Users
        User newUser = new User("aarondavid07","password","Aaron Villavicencio","mr.aaronv@yahoo.com","860 NE 207TH TERR APT 106 Miami, FL 33179");
        MyAccount.users.add(newUser);
       
        //Purchase Assets
        MyAccount.buy(marketList[1], 10);
        MyAccount.buy(marketList[2], 20);
        MyAccount.buy(marketList[3], 10);
        MyAccount.buy(marketList[4], 50);
        MyAccount.buy(marketList[5], 20);
        MyAccount.buy(marketList[6], 10);
        MyAccount.buy(marketList[7], 10);
        MyAccount.buy(marketList[8], 10);
        MyAccount.buy(marketList[9], 20);
        MyAccount.buy(marketList[10], 30);
        MyAccount.buy(marketList[11], 10);
        MyAccount.buy(marketList[12], 10);
        MyAccount.buy(marketList[13], 120);
        MyAccount.buy(marketList[14], 130);
        MyAccount.buy(marketList[15], 22);
        MyAccount.buy(marketList[16], 10);
        MyAccount.buy(marketList[17], 14);
        MyAccount.buy(marketList[18], 10);
        MyAccount.buy(marketList[19], 12);

        boolean enter = true;
        
        while(enter)
        {
                //Menu
                MyAccount.printUsers();
                MyAccount.printMenu();
           

                try
                {
                    Scanner one = new Scanner(System.in);
                    int choice = one.nextInt();


                        switch  (choice)
                        {    
                        case 1 :
                        //Select Asset to Print
                        for(int index = 0; index < MyAccount.getAssetListLength(); index++)
                        {
                            System.out.println("Asset " + index);
                        }

                        System.out.println("Enter in Asset From the list: ");

                        Scanner keyboard = new Scanner(System.in);

                        int selection = keyboard.nextInt();

                        MyAccount.printAsset(selection);
                        break;
                        case 2 :
                        //Print all Assets
                        MyAccount.printAssets();
                        break;
                          //Exit       
                        case 99:
                            enter = false;
                        break;

                        default:
                            System.out.println("Your selection does not exist");
                }
            }
            catch(InputMismatchException e)
            {
                System.out.println("Your selection needs to be a number!");
            }
                
        }//end while
    }
    
} //EOF