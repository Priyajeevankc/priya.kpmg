package StaticFinal;

public class Calculator {
 int x=10;
 int y=30;
 public int sum() 
 {
	 return x+y;
 }
 public int sum(int a, int b)
 {
	 return a+b;
 }
 public float sum(float a, float b)
 {
	 return a+b;
 }
 public float sum(int a, float b)
 {
	 return a+b;
 }
 public float sum(float a, int b)
 {
	 return a+b;
 }
}

//overloading 
// we can have two or more methods with same name  provided they differ in
//numberr of args
//datatype of args
// order of args
//Note : Return type is not calcualated
