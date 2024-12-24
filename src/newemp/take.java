package newemp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import newemp.Conn;

public class take implements Op
{
	@Override
	public void insert(pojoo p) {
	 try {
		PreparedStatement ps = Conn.getConnection().prepareStatement("insert into emp values(?,?)");
		ps.setString(1, p.getName());
		ps.setInt(2, p.getId());
		ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	@Override
	public void update(pojoo p) {
		 try {
				PreparedStatement ps = Conn.getConnection().prepareStatement("select * from admin");
			   	ResultSet s= ps.executeQuery();
				while(s.next()) {
					System.out.println(s.getString(1));
					System.out.println(s.getInt(2));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(pojoo p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		 try {
				PreparedStatement ps = Conn.getConnection().prepareStatement("select * from emp");
			   	ResultSet s= ps.executeQuery();
				while(s.next()) {
					System.out.println(s.getString(1));
					System.out.println(s.getInt(2));
					System.out.println("---------------------------------------");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	// TODO Auto-generated method stub
		
	}

}
