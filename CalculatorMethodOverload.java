package week3.day1;

public class CalculatorMethodOverload {
	public void add(int x,int y,int z) {
		int sum=x+y+z;
		System.out.println("the sum of three number is: "+sum);
	}
	public void add(int x,int y) {
		int sum=x+y;
		System.out.println("the sum of two number is: "+sum);
	}
	public void multi(int x,int y,int z) {
		int multiply=x*y*z;
		System.out.println("the multiply of three number is: "+multiply);
	}
	public void multi(int x,double y) {
		double multiply= x*y;
		System.out.println("the multiply of two number is: "+multiply);
	}
	public void sub(int x,int y) {
		int dif= x-y;
		System.out.println("the difference of two number is: "+dif);
	}
	public void sub(double x,double y) {
		double dif= x-y;
		System.out.println("the difference of two number is: "+dif);
	}
	public void div(int x,int y) {
		int divide= x/y;
		System.out.println("the division of two number is: "+divide);
	}
	public void div(int x,double y) {
		double divide= x/y;
		System.out.println("the division of two number is: "+divide);
	}
	public static void main(String args[]) {
		CalculatorMethodOverload obj=new CalculatorMethodOverload();
		obj.add(5, 5);
		obj.add(5, 10, 15);
		obj.sub(10, 5);
		obj.sub(0.10, 0.02);
		obj.multi(5, 10, 15);
		obj.multi(5, 0.02);
		obj.div(10, 2);
	    obj.div(5, 0.02);
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
