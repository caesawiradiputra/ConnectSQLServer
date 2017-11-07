/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.id.testing.demo.ConnectSQLServer.controller;

import com.id.testing.demo.ConnectSQLServer.dao.UserDao;
import com.id.testing.demo.ConnectSQLServer.domain.User;
import com.id.testing.demo.ConnectSQLServer.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Caesa
 */

@RestController
@RequestMapping("/api/user")
public class UserApiController {
    
    Logger logger = LoggerFactory.getLogger(UserApiController.class);
    
    @Autowired
    private UserDao userDao;
    
    @GetMapping("/")
    public Page<User> getUserId(Pageable page) {
        
        return userDao.findAll(page);
    }
    
    @GetMapping("/{userid}")
    public User getUserId(@PathVariable("userid") String userId) {
        
        return userDao.findOne(userId);
    }
}
