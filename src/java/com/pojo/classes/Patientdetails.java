package com.pojo.classes;
// Generated 14 Apr, 2016 5:18:49 PM by Hibernate Tools 4.3.1



/**
 * Patientdetails generated by hbm2java
 */
public class Patientdetails  implements java.io.Serializable {


     private String patientid;
     private String firstname;
     private String lastname;
     private String paddress;
     private String pnumber;
     private String pgender;
     private String age;
     private String pheight;
     private String pweight;
     private String ptype;
     private String pneed;

    public Patientdetails() {
    }

	
    public Patientdetails(String patientid) {
        this.patientid = patientid;
    }
    public Patientdetails(String patientid, String firstname, String lastname, String paddress, String pnumber, String pgender, String age, String pheight, String pweight, String ptype, String pneed) {
       this.patientid = patientid;
       this.firstname = firstname;
       this.lastname = lastname;
       this.paddress = paddress;
       this.pnumber = pnumber;
       this.pgender = pgender;
       this.age = age;
       this.pheight = pheight;
       this.pweight = pweight;
       this.ptype = ptype;
       this.pneed = pneed;
    }
   
    public String getPatientid() {
        return this.patientid;
    }
    
    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getPaddress() {
        return this.paddress;
    }
    
    public void setPaddress(String paddress) {
        this.paddress = paddress;
    }
    public String getPnumber() {
        return this.pnumber;
    }
    
    public void setPnumber(String pnumber) {
        this.pnumber = pnumber;
    }
    public String getPgender() {
        return this.pgender;
    }
    
    public void setPgender(String pgender) {
        this.pgender = pgender;
    }
    public String getAge() {
        return this.age;
    }
    
    public void setAge(String age) {
        this.age = age;
    }
    public String getPheight() {
        return this.pheight;
    }
    
    public void setPheight(String pheight) {
        this.pheight = pheight;
    }
    public String getPweight() {
        return this.pweight;
    }
    
    public void setPweight(String pweight) {
        this.pweight = pweight;
    }
    public String getPtype() {
        return this.ptype;
    }
    
    public void setPtype(String ptype) {
        this.ptype = ptype;
    }
    public String getPneed() {
        return this.pneed;
    }
    
    public void setPneed(String pneed) {
        this.pneed = pneed;
    }




}

