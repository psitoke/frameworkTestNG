package frameworkTestNG;

public class PS extends PS2{

	public PS(int a) 
	{
		super(a);
	}

	
	public int increment()
	{
		a=a+1;
		return a;
	}
	
	public int decrement()
	{
		a=a-1;
		return a;
	}
	
}
