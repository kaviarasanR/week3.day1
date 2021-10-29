package week3.day1;

public class Execution {

	public static void main(String[] args) {
	System.out.println("this is for Bmw car");
	Bmw b=new Bmw();
	b.accelerate();
	b.applyBrake();
    b.closeDoor();
	b.drive();
	b.enableAirbag();
	b.shiftGear();
	System.out.println("the number of wheel in bmw is: "+b.wheelcar); 
	System.out.println("this is for Audi car");
	Audi a=new Audi();
	a.shiftGear();
	a.applyBrake();
	a.drive();
	System.out.println("this is for Auto ");
	Bajaj ba=new Bajaj();
	ba.fillFuel();
	ba.applyBrake();
	System.out.println("the number of wheel in auto is: "+ba.wheelauto);
	
	
	
	
	
	}

}
