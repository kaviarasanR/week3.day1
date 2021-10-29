package week3.day1;

public class AxisBank extends BankInfo{
 @Override
public void deposit() {
	 System.out.println("your deposit is 100,000");
}
 public static void main(String[] args) {
	 AxisBank obj=new AxisBank();
	 obj.saving();
	 obj.fixed();
	 obj.deposit();
 }
	
}
