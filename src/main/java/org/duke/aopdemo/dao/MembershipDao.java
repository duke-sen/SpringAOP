package org.duke.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDao {

    public void addAccount(){
        System.out.println( getClass() + " Doing tests : Adding a membership account!");
    }

    public boolean returnsBoolean(){
        System.out.println(getClass() + " Doing Tests : This method always returns true");
        return true;
    }
}
