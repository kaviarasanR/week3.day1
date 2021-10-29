package week3.day1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("id: " + id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("id: " + id);
		System.out.println("name: " + name);
	}

	public void getStudentInfo(String email, String phonenumber) {
		System.out.println("email: " + email);
		System.out.println("phonenumber: " + phonenumber);

	}

	public static void main(String[] args) {
		Students info = new Students();
		info.getStudentInfo(57);
		info.getStudentInfo(57, "kaviarasan");
		info.getStudentInfo("kaviarasancr498@gmail.com", "6382537741");
	}
}
