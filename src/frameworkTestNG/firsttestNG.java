package frameworkTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class firsttestNG {
	
	@Test
	public void login()
	{
		System.out.println("log in");
	}
	@Test
	public void logout()
	{
		System.out.println("log out");
	}
	
	@Test(dependsOnMethods={"login","logout"})
	public void aatestlogin()
	{
		System.out.println("user logged in");
	}
	
	
	
	@BeforeSuite
	public void prac5()
	{
		System.out.println("1 execute first before suite");
	}
	
	@BeforeTest 
	public void prac4()
	{
		System.out.println("2 execute before test mobile Forgot Cred");
	}
	
	@AfterClass(enabled=false)
	public void afrclass()
	{
		System.out.println("*5* executing After each class");
	}
	
	@Test (groups={"Sanity"})
	public void prac1()
	{
		System.out.println("3 mobile login 1st run");
	}
	

	@Test (groups={"Sanity"})
	public void prac3()
	{
		System.out.println("4 mobile Blank Cred");
	}
	
	@AfterTest
	public void prac2()
	{
		System.out.println("6 Execute After test mobile Invalid Cred");
	}

}
