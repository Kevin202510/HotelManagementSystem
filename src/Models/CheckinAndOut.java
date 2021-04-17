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
public class CheckinAndOut {
    
     private int cust_id,room_id;
    private String checkin_date,checkout_date,timein,timeout;
    
    public CheckinAndOut(int cust_id,int room_id,String checkin_date,String checkout_date,String timein,String timeout){
        this.cust_id=cust_id;
        this.room_id=room_id;
        this.checkin_date=checkin_date;
        this.checkout_date=checkout_date;
        this.timein=timein;
        this.timeout=timeout;
    }
    
    public int getcusId(){
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
    }
    
}
