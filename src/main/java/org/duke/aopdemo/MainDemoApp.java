package org.duke.aopdemo;

import org.duke.aopdemo.dao.AccountDao;
import org.duke.aopdemo.dao.MembershipDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {
    public static void main(String[] args) {

        //Read Spring config Java class
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(DemoConfig.class);

        //Get the bean from the container
        AccountDao theAccountDao = context.getBean("accountDao", AccountDao.class);

        //Get membership bean from Spring container
        MembershipDao theMembershipDao = context.getBean("membershipDao", MembershipDao.class);

        //Call the business method
        theAccountDao.addAccount();

        //Call the membership business method
        theMembershipDao.addAccount();
        theMembershipDao.returnsBoolean();


        //Close the context
        context.close();
    }
}
