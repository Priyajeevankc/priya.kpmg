package exception.userdefined;

public class Test {

	public static void main(String[] args) {
		Sample obj=new Sample();
		obj.method1();
		try {
			obj.method2();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		Election ee =new Election();
			try {
				ee.checkEligibility(12);

			}catch(InvalidAgeException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}


