package com.pojo.classes;
// Generated 14 Apr, 2016 5:18:49 PM by Hibernate Tools 4.3.1



/**
 * Ward generated by hbm2java
 */
public class Ward  implements java.io.Serializable {


     private String code;
     private String description;
     private String dailycharge;

    public Ward() {
    }

	
    public Ward(String code) {
        this.code = code;
    }
    public Ward(String code, String description, String dailycharge) {
       this.code = code;
       this.description = description;
       this.dailycharge = dailycharge;
    }
   
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDailycharge() {
        return this.dailycharge;
    }
    
    public void setDailycharge(String dailycharge) {
        this.dailycharge = dailycharge;
    }




}


