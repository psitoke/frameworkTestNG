package frameworkTestNG;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class secondtestNG {
	
	@AfterMethod
	public void aftrmthd()
	{
		System.out.println("=======print after every method=======");
	}
	@BeforeMethod
	public void bfrmthd()
	{
		System.out.println("**********print brfore every test**********");
	}
	
	@AfterSuite
	public void webprac5()
	{
		System.out.println("execute last after suite");
	}
	
	@BeforeClass
	public void bfrclass()
	{
		System.out.println("executing before class");
	}
	
	@Test (groups={"Sanity"})
	public void webprac1()
	{
		System.out.println("weblogin 1st run");
	}
	
	
	@Parameters({"URL"})
	@Test
	public void param(String urlname)
	{
		System.out.println("weblogin Invalid Cred ===> " + urlname);
	}
	
	
	@Test
	public void webprac2()
	{
		System.out.println("weblogin Invalid Cred ");
	}
	@Test
	public void webprac3()
	{
		System.out.println("weblogin Blank Cred");
	}
	@Test
	public void webprac4()
	{
		System.out.println("weblogin Forgot Cred");
	}
}
