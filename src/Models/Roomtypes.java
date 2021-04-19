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
public class Roomtypes {
    
    private int RT_id;
    private String room_type;
    
    public Roomtypes(int RT_id,String room_type){
        this.RT_id=RT_id;
        this.room_type=room_type;
      
    
    }
    
    public int getRT_id(){
        return RT_id;
    }public String getroom_type(){
        return room_type;
    }
    
}
