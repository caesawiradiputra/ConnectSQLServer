/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.id.testing.demo.ConnectSQLServer.domain;

import java.sql.Date;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Caesa
 */

@Entity
@Table(name = "prfuser")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length = 10)
    private String Userid;
    @Column(length = 10)
    private String Password;
    @Column(length = 50)
    private String Username;
    private Character Usertype;
    private Integer Validfordays;
    private Boolean Neverexpires; 
    private Date Passworddate;
    private Boolean Active;
    @Column(length = 4)
    private String Branchid;
    private Character Deptid;
    private Character Jobgroup;
    private Integer Counter;
    private Date Lastupdate;
    @Column(length = 10)
    private String Lastuserid;
    private Date Createddate;
    @Column(length = 10)
    private String Creatorid;
    private Date Lastlogin;

    public String getUserid() {
        return Userid;
    }

    public void setUserid(String Userid) {
        this.Userid = Userid;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public Character getUsertype() {
        return Usertype;
    }

    public void setUsertype(Character Usertype) {
        this.Usertype = Usertype;
    }

    public Integer getValidfordays() {
        return Validfordays;
    }

    public void setValidfordays(Integer Validfordays) {
        this.Validfordays = Validfordays;
    }

    public Boolean getNeverexpires() {
        return Neverexpires;
    }

    public void setNeverexpires(Boolean Neverexpires) {
        this.Neverexpires = Neverexpires;
    }

    public Date getPassworddate() {
        return Passworddate;
    }

    public void setPassworddate(Date Passworddate) {
        this.Passworddate = Passworddate;
    }

    public Boolean getActive() {
        return Active;
    }

    public void setActive(Boolean Active) {
        this.Active = Active;
    }

    public String getBranchid() {
        return Branchid;
    }

    public void setBranchid(String Branchid) {
        this.Branchid = Branchid;
    }

    public Character getDeptid() {
        return Deptid;
    }

    public void setDeptid(Character Deptid) {
        this.Deptid = Deptid;
    }

    public Character getJobgroup() {
        return Jobgroup;
    }

    public void setJobgroup(Character Jobgroup) {
        this.Jobgroup = Jobgroup;
    }

    public Integer getCounter() {
        return Counter;
    }

    public void setCounter(Integer Counter) {
        this.Counter = Counter;
    }

    public Date getLastupdate() {
        return Lastupdate;
    }

    public void setLastupdate(Date Lastupdate) {
        this.Lastupdate = Lastupdate;
    }

    public String getLastuserid() {
        return Lastuserid;
    }

    public void setLastuserid(String Lastuserid) {
        this.Lastuserid = Lastuserid;
    }

    public Date getCreateddate() {
        return Createddate;
    }

    public void setCreateddate(Date Createddate) {
        this.Createddate = Createddate;
    }

    public String getCreatorid() {
        return Creatorid;
    }

    public void setCreatorid(String Creatorid) {
        this.Creatorid = Creatorid;
    }

    public Date getLastlogin() {
        return Lastlogin;
    }

    public void setLastlogin(Date Lastlogin) {
        this.Lastlogin = Lastlogin;
    }
    
    
}
