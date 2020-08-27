package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import model.Employee;
import model.User;

public class UserDAO extends DAO{


	public UserDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User find(String userName, String pass){
		User u=new User();
		try {
			Statement st=super.getCn().createStatement();
			ResultSet res=st.executeQuery("Select * from user where login='"+userName+"' and password='"+pass+"'");

			res.next();
			String idemp; 
			u.setUsername(res.getString("login"));
			u.setPassword(res.getString("password"));
			idemp=res.getString("idE");
			EmployeeDAO empDAO= new EmployeeDAO();
			u.setEmp(empDAO.findEmployee(idemp));
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
