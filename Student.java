package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Studentname: kaviarasan R");
	}

	public void studentDept() {
		System.out.println("Dept: Cse");
	}

	public void studentId() {
		System.out.println("Id: 16tucs057");
	}

	public static void main(String[] args) {
		Student obj = new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		

	}

}
