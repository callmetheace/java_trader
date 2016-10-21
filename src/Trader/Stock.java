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
 * Stock Class 
 */

public class Stock extends Asset{

public Stock(String s, double p, double q){
    super();
    this.setType("Stock");
    this.setSymbol(s);
    this.setPrice(p);
    this.setQuantity(q);
}


} // EOF
