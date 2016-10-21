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
 * Bond Class 
 */

public class Bond extends Asset{

public Bond(String s, double p, double q){
    super();
    this.setType("Bond");
    this.setSymbol(s);
    this.setPrice(p);
    this.setQuantity(q);
    
}

} //EOF