package em;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
	
	public static Connection connction() {
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("mck");
	}
	 Connection cn=null;
	   try {
		cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/info?useSSL=false","root","Rupesh@123");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   return cn;
	}

}
