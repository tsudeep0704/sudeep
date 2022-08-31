package com.ui.test;

import com.utility.config.ConfigFactory;
import org.testng.annotations.Test;

public class PropertyTest {

    @Test
    public void testBrowserName(){
        System.out.println("Browser Name is : " + ConfigFactory.getConfig().browser());
    }

    @Test
    public void testApplicationName(){
        System.out.println("Application Name is : " + ConfigFactory.getConfig().application());
    }

    @Test
    public void testEnvironment(){
        System.out.println("Environment is : " + ConfigFactory.getConfig().environment());
    }

    @Test
    public void testWebURL(){
        System.out.println("Web URL is : " + ConfigFactory.getConfig().webURL());
    }

    @Test
    public void testDBConnectionString(){
        System.out.println("DB Connection String is : " + ConfigFactory.getConfig().dbConnectionString());
    }

    @Test
    public void testDBUserName(){
        System.out.println("DB User Name is : " + ConfigFactory.getConfig().dbUserName());
    }

    @Test
    public void testDBPassword(){
        System.out.println("DB Password is : " + ConfigFactory.getConfig().dbPassword());
    }
}
