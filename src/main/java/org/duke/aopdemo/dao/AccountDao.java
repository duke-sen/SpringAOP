package org.duke.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDao {

    public void addAccount(){
        System.out.println( getClass() + " Doing My db work : Adding an account");
    }
}
