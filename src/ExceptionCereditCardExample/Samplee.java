package ExceptionCereditCardExample;

public class Samplee {

//handle the exception
	public void method1()
	{
		try {
			int x=10;
			int y=2;
			int z=x/y;
	}catch(ArithmeticException e)
		{
		System.out.println("number exception");
		System.out.println(e.getMessage());
		}
	}
	public void method2() throws Exception
	{
		int x=10;
		int y=2;
		int z=x/y;
	}
}

