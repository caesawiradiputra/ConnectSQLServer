/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.id.testing.demo.ConnectSQLServer.dao;

import com.id.testing.demo.ConnectSQLServer.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author Caesa
 */
public interface UserDao extends PagingAndSortingRepository<User, String>{
    
}
