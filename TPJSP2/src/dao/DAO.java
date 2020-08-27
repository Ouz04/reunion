package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public abstract class DAO<T> {

	
	private Connection cn=null;
	
	public DAO()
	{
		 String url="jdbc:mysql://localhost/empdep";
		 String login="root";
		 String password="root";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		
		cn= DriverManager.getConnection(url, login, password);
		} catch (ClassNotFoundException e) {
			//System.err.println("erreur de chargement du driver");
			e.printStackTrace();
		}
 catch (SQLException e) {
	System.err.println("erreur de chargement du driver");
	e.printStackTrace();
}
	}

	public Connection getCn() {
		return cn;
	}
	
	public abstract List<T> findAll();
	public abstract void create (T ressource );
	public abstract void update (T resource);
	public abstract void delete (T resource);
	
}
