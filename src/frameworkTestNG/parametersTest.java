package frameworkTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametersTest {
	
	@Parameters({"URL","Uname"})
	@Test
	public void param(String urlname, String Uname)
	{
		System.out.println("URL" + urlname);
		System.out.println("UserName" + Uname);
	}

}
