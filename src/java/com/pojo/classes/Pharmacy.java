package com.pojo.classes;
// Generated 14 Apr, 2016 5:18:49 PM by Hibernate Tools 4.3.1



/**
 * Pharmacy generated by hbm2java
 */
public class Pharmacy  implements java.io.Serializable {


     private String medicinename;
     private String saltbase;
     private String price;
     private String stock;
     private String reorderlevel;

    public Pharmacy() {
    }

	
    public Pharmacy(String medicinename) {
        this.medicinename = medicinename;
    }
    public Pharmacy(String medicinename, String saltbase, String price, String stock, String reorderlevel) {
       this.medicinename = medicinename;
       this.saltbase = saltbase;
       this.price = price;
       this.stock = stock;
       this.reorderlevel = reorderlevel;
    }
   
    public String getMedicinename() {
        return this.medicinename;
    }
    
    public void setMedicinename(String medicinename) {
        this.medicinename = medicinename;
    }
    public String getSaltbase() {
        return this.saltbase;
    }
    
    public void setSaltbase(String saltbase) {
        this.saltbase = saltbase;
    }
    public String getPrice() {
        return this.price;
    }
    
    public void setPrice(String price) {
        this.price = price;
    }
    public String getStock() {
        return this.stock;
    }
    
    public void setStock(String stock) {
        this.stock = stock;
    }
    public String getReorderlevel() {
        return this.reorderlevel;
    }
    
    public void setReorderlevel(String reorderlevel) {
        this.reorderlevel = reorderlevel;
    }




}


