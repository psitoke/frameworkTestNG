package frameworkTestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListner is a Interface which implements testNG Listeners

public class Listeners implements ITestListener{
	@Override
	public void onTestSuccess(ITestResult Result) {
		
		System.out.println("Listener sucess");
	}

	
	
}
