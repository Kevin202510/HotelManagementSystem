/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.RoomModels;

/**
 *
 * @author Chelsea
 */
public class Rooms {
    
    
        private int room_id ,bed_id,RT_id,rate_id;
   
    
    public Rooms(int room_id,int bed_id,int RT_id,int rate_id){
        this.room_id=room_id;
        this.bed_id=bed_id;
        this.RT_id=RT_id;
        this.rate_id=rate_id;

    }
    
    public int getroom_id(){
        return room_id;
    }public int getbed_id(){
        return bed_id;
    }public int getRT_id(){
        return RT_id;
    }public int getrate_id(){
        return rate_id; 
    }
    

    
}