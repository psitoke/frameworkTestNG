package frameworkTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderAnnotation {

	@Test(dataProvider="getData")
	public void login(String Uname, String Pass)
	{
		System.out.println("Login to webapp with "+ Uname + "  " + Pass);
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		//three combination for login function
		//1st valid data
		//2nd invalid data
		//3rd incomplete data
		Object[][] data = new Object[3][2];
		data[0][0]="uname1";
		data[0][1]="pass1";
		
		data[1][0]="uname2";
		data[1][1]="pass2";
	
		data[2][0]="uname3";
		data[2][1]="pass3";
		return data;
	}
}
