package model;

import java.io.Serializable;

public class Employee implements Serializable{

	private String empno, firstName,lastName, role;
	

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", firstName=" + firstName + ", lastName=" + lastName + ", role=" + role
				+ "]";
	}

	public Employee() {
		
	}
	
	
}
