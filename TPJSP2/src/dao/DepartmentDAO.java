package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import model.Department;
import model.Employee;

public class DepartmentDAO extends DAO{

	public List<Department> findAll()
	{
		List<Department> l=new ArrayList<>();
		try {
			Statement st=super.getCn().createStatement();
			ResultSet res=st.executeQuery("Select * from department");
			while(res.next()) {
				Department d=new Department();
				d.setAddress(res.getString("addressD"));
				d.setDepName(res.getString("nameD"));
				d.setDepNo(res.getString("idD"));
				l.add(d);
			}	
		}catch (Exception e) {
			e.printStackTrace();
		}
		return l;
	}
	
	public List<Employee> findEmpByDep(String depno)
	{
		List<Employee> l=new ArrayList<>();
		try {
			Statement st=super.getCn().createStatement();
			ResultSet res=st.executeQuery("Select * from employe where idD="+depno);
			while(res.next()) {
				Employee d=new Employee();
				d.setFirstName(res.getString("firstnameE"));
				d.setLastName(res.getString("lastNameE"));
				d.setRole(res.getString("roleE"));
				l.add(d);   
			}	
		}catch (Exception e) {
			e.printStackTrace();
		}
		return l;
	}
	@Override
	public void create(Object ressource) {
		// TODO Auto-generated method stub

	}
	@Override
	public void update(Object resource) {
		// TODO Auto-generated method stub

	}
	@Override
	public void delete(Object resource) {
		// TODO Auto-generated method stub

	}
}
