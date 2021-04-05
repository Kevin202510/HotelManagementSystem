/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.UserModel;

/**
 *
 * @author CALUAG FAMILY
 */
public class Users {
    
    private int user_id,role_id;
    private String user_Fname,user_Mname,user_Lname,user_address,user_DOB,user_contactnum,user_username,user_password;
    
    public Users(int user_id,int role_id,String user_Fname,String user_Mname,String user_Lname,String user_address,String user_DOB,String user_contactnum,String user_username,String user_password){
        this.user_id=user_id;
        this.role_id=role_id;
        this.user_Fname=user_Fname;
        this.user_Mname=user_Mname;
        this.user_Lname=user_Lname;
        this.user_address=user_address;
        this.user_DOB=user_DOB;
        this.user_contactnum=user_contactnum;
        this.user_username=user_username;
        this.user_password=user_password;
    }
    
    public int getuser_id(){
        return user_id;
    }public int getrole_id(){
        return role_id;
    }public String getuser_Fname(){
        return user_Fname;
    }public String getuser_Mname(){
        return user_Mname;
    }public String getuser_Lname(){
        return user_Lname;
    }public String getuser_address(){
        return user_address;
    }public String getuser_DOB(){
        return user_DOB;
    }public String getuser_contactnum(){
        return user_contactnum;
    }public String getuser_username(){
        return user_username;
    }public String getuser_password(){
        return user_password;
    }
    
}
