package StaticFinal;

public class FinalTest {

	public static void main(String[] args) {
		FinalSample obj = new FinalSample();
		System.out.println( obj.y);
		FinalSample obj1 = new FinalSample(2000);
		System.out.println( obj1.y);
		//obj1.y = 3000; it cannot be changed
		//to use math class 
		System.out.println(Math.max(10,20));
	}

}
