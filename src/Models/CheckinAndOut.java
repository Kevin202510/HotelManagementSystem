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
public class CheckinAndOut{
    
     private int cust_id,room_id,checkinout;
     private double total,Hourscheckin;
    private String checkin_date,checkout_date,timein,timeout,cust_fullname;
    
    public CheckinAndOut(int checkinout,int cust_id,int room_id,String checkin_date,String checkout_date,String timein,String timeout,double total){
        this.checkinout=checkinout;
        this.cust_id=cust_id;
        this.room_id=room_id;
        this.checkin_date=checkin_date;
        this.checkout_date=checkout_date;
        this.timein=timein;
        this.timeout=timeout;
        this.total=total;
    }
    
    public CheckinAndOut(int checkinout,double Hourscheckin,String cust_fullname,int room_id,String checkin_date,String checkout_date,String timein,String timeout,double total){
        this.checkinout=checkinout;
        this.Hourscheckin=Hourscheckin;
        this.cust_fullname=cust_fullname;
        this.room_id=room_id;
        this.checkin_date=checkin_date;
        this.checkout_date=checkout_date;
        this.timein=timein;
        this.timeout=timeout;
        this.total=total;
    }
    
    public int getcheckInOut(){
        return checkinout;
    } public int getcusId(){
        return cust_id;
    }public int getroomId(){
        return room_id;
    }public String getcheckin_date(){
        return checkin_date;
    }public String getcheckout_date(){
        return checkout_date;
    }public String gettimein(){
        return timein;
    }public String gettimeout(){
        return timeout;
    }public double gettotal(){
        return total;
    }public double getHourscheckin(){
        return Hourscheckin;
    }public String getCustFullname(){
        return cust_fullname;
    }
    
}
