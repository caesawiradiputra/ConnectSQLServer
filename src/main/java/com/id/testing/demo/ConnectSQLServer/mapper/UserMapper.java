/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.id.testing.demo.ConnectSQLServer.mapper;

import com.id.testing.demo.ConnectSQLServer.domain.User;
import java.sql.Date;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

/**
 *
 * @author Caesa
 */
public class UserMapper implements FieldSetMapper<User>{

    @Override
    public User mapFieldSet(FieldSet fieldSet) throws BindException {
        User user = new User();
        user.setUserid(fieldSet.readString("userid"));
        user.setPassword(fieldSet.readString("username"));
        user.setUsername(fieldSet.readString("username"));
        user.setUsertype(fieldSet.readChar("username"));
        user.setValidfordays(fieldSet.readInt("username"));
        user.setNeverexpires(fieldSet.readBoolean("username"));
        user.setPassworddate((Date) fieldSet.readDate("username"));
        user.setActive(fieldSet.readBoolean("username"));
        user.setBranchid(fieldSet.readString("username"));
        user.setDeptid(fieldSet.readChar("username"));
        user.setJobgroup(fieldSet.readChar("username"));
        user.setCounter(fieldSet.readInt("username"));
        user.setLastupdate((Date) fieldSet.readDate("username"));
        user.setLastuserid(fieldSet.readString("username"));
        user.setCreateddate((Date) fieldSet.readDate("username"));
        user.setCreatorid(fieldSet.readString("username"));
        user.setLastlogin((Date) fieldSet.readDate("username"));
        
        return user;
    }
    
    
}
