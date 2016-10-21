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
 * Cash Class 
 */

public class Cash extends Asset{

public Cash(double q){
 super();
 this.setQuantity(q);
 this.setPrice(1);
}

@Override
public String toString() 
{
	return "Current cash balance: $" + getQuantity()*getPrice() + 0;
}

} //EOF