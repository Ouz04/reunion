package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Department implements Serializable{

	private String depNo,depName,address;
	private List<Employee> empList;
	
	public Department()
	{
		empList=new ArrayList<>();
	}

	public String getDepNo() {
		return depNo;
	}

	public void setDepNo(String depNo) {
		this.depNo = depNo;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
	
}
