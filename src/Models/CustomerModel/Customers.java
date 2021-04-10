/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.CustomerModel;

/**
 *
 * @author CALUAG FAMILY
 */
public class Customers {
    
    private int cust_id;
    private String cust_Fname,cust_Mname,cust_Lname,cust_address,cust_contactnum;
    
    public Customers(int cust_id,String cust_Fname,String cust_Mname,String cust_Lname,String cust_address,String cust_contactnum){
        this.cust_id=cust_id;
        this.cust_Fname=cust_Fname;
        this.cust_Mname=cust_Mname;
        this.cust_Lname=cust_Lname;
        this.cust_address=cust_address;
        this.cust_contactnum=cust_contactnum;

    }
    
    public int getcust_id(){
        return cust_id;
    }public String getcust_Fname(){
        return cust_Fname;
    }public String getcust_Mname(){
        return cust_Mname;
    }public String getcust_Lname(){
        return cust_Lname;
    }public String getcust_address(){
        return cust_address;
    }public String getcust_contactnum(){
        return cust_contactnum;
    }public String getcust_fullname(){
        String fullname = cust_Fname + "   " + cust_Mname + "   " + cust_Lname;
        return fullname;
    }
    
}
