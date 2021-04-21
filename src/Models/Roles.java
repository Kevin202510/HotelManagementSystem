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
public class Roles {
    private int role_id;
        private  String role_displayname;
   
    
    public Roles(int role_id,String role_displayname){
        this.role_id=role_id;
        this.role_displayname=role_displayname;
      
    
    }
    
    public int getrole_id(){
        return role_id;
    }public String getrole_displayname(){
        return role_displayname;
    }
    }


