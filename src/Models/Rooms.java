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
        private String roomtype,bed;
    
    public Rooms(int room_id,int bed_id,int RT_id,int rate_id){
        this.room_id=room_id;
        this.bed_id=bed_id;
        this.RT_id=RT_id;
        this.rate_id=rate_id;
    }
    
    public Rooms(int rooms_id,String bed,String roomtype,int rates){
        this.room_id=rooms_id;
        this.bed=bed;
        this.roomtype=roomtype;
        this.rates=rates;
    }
    
    public int getroom_id(){
        return room_id;
    }public int getbed_id(){
        return bed_id;
    }public int getRT_id(){
        return RT_id;
    }public int getrate_id(){
        return rate_id; 
    }public int getrates(){
        return rates; 
    }public String getbed(){
        return bed; 
    }public String getroomtype(){
        return roomtype; 
    }
    

    
}
