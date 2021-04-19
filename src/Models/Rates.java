/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Chelsea
 */
public class Rates {
    private int rate_id,rate_price;
   
    
    public Rates(int rate_id,int rate_price){
        this.rate_id=rate_id;
        this.rate_price=rate_price;
      
    
    }
    
    public int getrate_id(){
        return rate_id;
    }public int getrate_price(){
        return rate_price;
    }
}
