package em;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class imp implements Operation {

	@Override
	public void insert(pojo p) {
		try {
			PreparedStatement ps = connection.connction().prepareStatement("insert into emp values(?,?)");
			ps.setString(1, p.getName());
			ps.setInt(2, p.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception ee) {
			ee.printStackTrace();
		}
		
		
	}

	@Override
	public void update(pojo p) {
		try {
			PreparedStatement ps = connection.connction().prepareStatement("update emp set name = ? where id = ?");
			ps.setString(1, p.getName());
			ps.setInt(2, p.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception ee) {
			ee.printStackTrace();
		}
		
	}

	@Override
	public void delete(pojo p) {
		try {
			PreparedStatement ps = connection.connction().prepareStatement("delete from emp where id = ?");
//			ps.setString(1, p.getName());
			ps.setInt(1, p.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}	// TODO Auto-generated method stub
		
	

	@Override
	public void show() {
		try {
			PreparedStatement ps = connection.connction().prepareStatement("select * from emp");
			ResultSet s= ps.executeQuery();
			while(s.next()) {
				
			System.out.println(s.getString(1));
			System.out.println(s.getInt(2));
			System.out.println("---------------------");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
			
		
	}

}
