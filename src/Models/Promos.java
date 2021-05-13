/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author ❤Kevin Felix Caluag❤
 */
public class Promos {
    
    private int id;
    private double discount;
    private String description;
    
    public Promos(int id,String desctiptions,double discount){
        this.id=id;
        this.description=desctiptions;
        this.discount=discount;
    }
    
    public int getPromoId(){
        return id;
    }public String getDescription(){
        return description;
    }public double getDiscount(){
        return discount;
    }
    
}
