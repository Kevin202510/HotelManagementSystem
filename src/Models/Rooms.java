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
public class Rooms {
    
    
        private int room_id ,bed_id,RT_id,rate_id,rates;
        private String roomtype,bed,statuss,promodescription;
        private int status,rate_price,promoid;
    
    public Rooms(int room_id,int bed_id,int RT_id,int rate_id,int status){
        this.room_id=room_id;
        this.bed_id=bed_id;
        this.RT_id=RT_id;
        this.rate_id=rate_id;
        this.status=status;
    }
    
    public Rooms(int room_id,String bed_quantity,String room_type,int rate_price,int status){
        this.room_id=room_id;
        this.bed=bed_quantity;
        this.roomtype=room_type;
        this.rate_price=rate_price;
        this.status=status;
    }
    
    public int getroom_id(){
        return room_id;
    }public int getpromoid(){
        return promoid;
    }public int getbed_id(){
        return bed_id;
    }public int getRT_id(){
        return RT_id;
    }public int getrate_id(){
        return rate_id; 
    }public int getrates(){
        return rate_price; 
    }public String getbed(){
        return bed; 
    }public String getroomtype(){
        return roomtype; 
    }public String getstatus(){
            if (status==1) {
                statuss="Available";
            }else{
                statuss="Not Available";
            }
            return statuss;
    }public int getstatusid(){
            return status;
    }
    

    
}
