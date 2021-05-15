/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author CALUAG FAMILY
 */
public class SukiCustomers {
    int id,custo_id;
    String sukicode,custo_name;
    double points;
    
    public SukiCustomers(int id,int custo_id,String sukicode,double points){
     this.id=id;
     this.custo_id=custo_id;
     this.sukicode=sukicode;
     this.points=points;
    }
    
    public SukiCustomers(int id,String custo_name,String sukicode,double points){
     this.id=id;
     this.custo_name=custo_name;
     this.sukicode=sukicode;
     this.points=points;
    }
    
    public int getId(){
        return id;
    }public int getcustoId(){
        return custo_id;
    }public String getsukiCode(){
        return sukicode;
    }public double getpoints(){
        return points;
    }public String getcustomerName(){
        return custo_name;
    }
}
