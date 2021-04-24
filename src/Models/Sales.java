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
public class Sales {
        private int id,amount,user_id;
        private String sales_date;
    
        public Sales(int id,String sales_date,int amount,int user_id){
        this.id=id;
        this.amount=amount;
        this.user_id=user_id;
        this.sales_date=sales_date;
    }
    public int getid(){
        return id;
    }public int getamount(){
        return amount;
    }public int getuser_id(){
        return user_id;
    }public String getsales_date(){
        return sales_date; 
    }
    

    
}
