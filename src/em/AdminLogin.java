package em;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AdminLogin {
	 JLabel username,password;
	 JTextField jt1,jt2;
	 JButton login,reset;
	 
  public AdminLogin(){
		JFrame m = new JFrame("EmpManagement");
		username=new JLabel("Admin");
		username.setBounds(100, 50, 100, 30);
		jt1=new JTextField();
		jt1.setBounds(200, 50, 100, 30);
		m.add(jt1);
		m.add(username);
		password=new JLabel("password");
		password.setBounds(100, 100, 100, 30);
		m.add(password);
		jt2=new JTextField();
		jt2.setBounds(200, 100, 100, 30);
		m.add(jt2);
		login=new JButton("login");
		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			  try {
				PreparedStatement ps = connection.connction().prepareStatement("select * from admin" );
				ResultSet rs = ps.executeQuery();
				rs.next();
				String u=rs.getString(1);
				String p= String.valueOf(rs.getInt(2));
				if(jt1.getText().equals(u) && jt2.getText().equals(p)) {
//					System.out.println("login");
					new MenuBar();
				}else {
					System.out.println("not found");
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			  
				
			}
			
		});
		login.setBounds(60, 160, 100, 30);
		m.add(login);
		reset=new JButton("reset");
		reset.setBounds(200, 160, 100, 30);
		m.add(reset);
		m.setLayout(null);
		m.setSize(500,500);
	    m.setVisible(true);
	}
    public static void main(String[] args) {
	   new  AdminLogin(); 
  }
			

}
