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
    private String userid;
    @Column(length = 10)
    private String password;
    @Column(length = 50)
    private String username;
    private Character usertype;
    private Integer validfordays;
    private Boolean neverexpires; 
    private Date passworddate;
    private Boolean active;
    @Column(length = 4)
    private String branchid;
    private Character deptid;
    private Character jobgroup;
    private Integer counter;
    private Date lastupdate;
    @Column(length = 10)
    private String lastuserid;
    private Date createddate;
    @Column(length = 10)
    private String creatorid;
    private Date lastlogin;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Character getUsertype() {
        return usertype;
    }

    public void setUsertype(Character usertype) {
        this.usertype = usertype;
    }

    public Integer getValidfordays() {
        return validfordays;
    }

    public void setValidfordays(Integer validfordays) {
        this.validfordays = validfordays;
    }

    public Boolean getNeverexpires() {
        return neverexpires;
    }

    public void setNeverexpires(Boolean neverexpires) {
        this.neverexpires = neverexpires;
    }

    public Date getPassworddate() {
        return passworddate;
    }

    public void setPassworddate(Date passworddate) {
        this.passworddate = passworddate;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getBranchid() {
        return branchid;
    }

    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    public Character getDeptid() {
        return deptid;
    }

    public void setDeptid(Character deptid) {
        this.deptid = deptid;
    }

    public Character getJobgroup() {
        return jobgroup;
    }

    public void setJobgroup(Character jobgroup) {
        this.jobgroup = jobgroup;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getLastuserid() {
        return lastuserid;
    }

    public void setLastuserid(String lastuserid) {
        this.lastuserid = lastuserid;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public String getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(String creatorid) {
        this.creatorid = creatorid;
    }

    public Date getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }

    
    
}
