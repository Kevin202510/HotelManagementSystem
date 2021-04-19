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
public class Beds {
     private int bed_id;
    private String bed_quality;
    
    public Beds(int bed_id,String bed_quality){
        this.bed_id=bed_id;
        this.bed_quality=bed_quality;
    }
    
    public int getbed_id(){
        return bed_id;
    }public String getbed_quality(){
        return bed_quality;
    }
}
