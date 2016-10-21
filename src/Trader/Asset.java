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
 * Asset Class (Superclass)
 */

public class Asset {

private String symbol;
protected double quantity;
private double price;
private double rate;
private String type;

public Asset(){
    
}

@Override
public String toString()
{
    return  "Type: " + this.getType() + ", " +
            "Symbol: " + this.getSymbol() + ", " +
            "Price: $" + this.getPrice() + "0, " +
            "Quantity: " + this.getQuantity() + "\n";
            
}

protected void setType(String t)
{
        type = t;
}

protected void setSymbol(String s)
{
	symbol = s;
}

protected void setQuantity(double q)
{
	quantity = q;
}

protected void setPrice(double p)
{
	price = p;
}
protected void setRate(double r)
{
	rate = r;
}

public String getType()
{
        return type;
}

public String getSymbol()
{
	return symbol;
}

protected double getQuantity()
{
	return quantity;
}

protected double getPrice()
{
	return price;
}

protected double getRate()
{
	return rate;
}

} // EOF