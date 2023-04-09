package com.test.ng;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNGDemo1 {
	@AfterClass //Location doesn't matter, it will be run after all tests/methods in class
	
	public void closeFileData()
	{
		System.out.println("After Class");
	}
	
	@BeforeClass   //Executed before all methods/@Tests in the class
	public void  setUpFileData()
	{
		System.out.println("In Before Class");
	}
	
	@BeforeMethod // for common code 
	public void setUp()
	{
	System.out.println("Start Brower.... ");
	System.out.println("App Launched.... ");
	}
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("Browser Closed.... ");
	}
	
	
	
	
	
	//1Method = 1 test, Two Methods are two tests
	//TestNG is annotation which has predefined Code 
	@Test (priority=2) //No need of main method, if you remove @Test it will not be run but throw error
	public void logInTest()
	{
		
		System.out.println("Login Successful.... ");
		
	//	Assert.assertTrue(false);// We want to make it fail so that dependant method get skipped
        //Total tests run: 4, Passes: 2, Failures: 1, Skips: 1
		
		
	}
	@Test(priority=1)
	public void registrationTest()
	{
		
		System.out.println("Registration Successful.... ");
		
	}
	@Test(priority=4)
	public void forgotPasswrdTest()
	{
	
		System.out.println("Forgot Passwrd Retrival Successful.... ");
		
	}
	@Test(priority=3, dependsOnMethods="logInTest")//you need to login to change password, dependant
	public void changePasswrdTest()
	{

		System.out.println("Forgot Passwrd Retrival Successful.... ");
		
	}

}
