package frameworkTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class inheritance {
	@Test
	public void action()
	{
		System.out.println("execut the logic");
	}
	@BeforeMethod
	public void before()
	{
		System.out.println("execute before method");
	}
	@AfterMethod
	public void after()
	{
		System.out.println("execute after method");
	}
//	@BeforeClass
//	public void beforeclass()
//	{
//		System.out.println("execute before class");
//	}
//	@AfterClass
//	public void afterclass()
//	{
//		System.out.println("execute after class");
//	}

}
