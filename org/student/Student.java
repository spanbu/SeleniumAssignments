package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		
		System.out.println("Saran");
	}
	
	public void studentDept() {
		
		System.out.println("Physics");
	}
	
	public void studentId() {
		
		System.out.println("0114001");
	}

	public static void main(String[] args) {
		
		Student stud = new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.deptName();
		stud.studentId();
		stud.studentName();
		stud.studentDept();

	}

}
