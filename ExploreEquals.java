package week3.day1;

public class ExploreEquals {

	public static void main(String[] args) {
		String first="I am Learning Java";
		String second="I am learning java?";   
		if(first==second) {
		System.out.println("both are same");
		}
		else{
		System.out.println("both are different");	
		}

		if(first.equals(second)) {
			System.out.println("both are same");
			}
			else{
			System.out.println("both are different");	
			}
	if(first.equalsIgnoreCase(second)) {
		System.out.println("both are same");
		}
		else{
		System.out.println("both are different");	
		}
	
	
	
}
}
