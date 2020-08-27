package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import model.Employee;
import model.User;

public class EmployeeDAO extends DAO{

	public EmployeeDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee findEmployee(String id)
	{Employee u=new Employee();
		try {
			Statement st=super.getCn().createStatement();
			ResultSet res=st.executeQuery("Select * from employe where idE='"+id+"'");
			
			res.next();
				u.setEmpno(res.getString("IdE")); 
				u.setFirstName(res.getString("firstNameE"));
				u.setLastName(res.getString("lastNameE"));
				u.setRole(res.getString("RoleE"));
			res.close();
			
			
			}catch (Exception e) {
				e.printStackTrace();
			}
			return u;	
	}

	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return null;
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
