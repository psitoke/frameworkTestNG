package frameworkTestNG;

import org.testng.annotations.Test;

public class PS1 {

	@Test
	public void math()
	{
		int a = 3;
		PS ps1=new PS(a);
		System.out.println(ps1.increment());
		System.out.println(ps1.decrement());
		System.out.println(ps1.multiplytwo());
		System.out.println(ps1.multiplythee());
	}
	
	
}
