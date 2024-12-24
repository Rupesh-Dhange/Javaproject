package newemp;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Adminlogin {
	JLabel admin,id;
	JTextField ad,idd;
	JButton login,reset;
	public Adminlogin() {
		JFrame m = new JFrame();
		admin=new JLabel("admin");
		id=new JLabel("id");
		m.add(admin);
		m.add(id);
		ad=new JTextField(20);
		idd=new JTextField(20);
		m.add(ad);
		m.add(idd);
		login=new JButton("login");
		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			 try {
				PreparedStatement ps = Conn.getConnection().prepareStatement("select * from admin");
				ResultSet s= ps.executeQuery();
				s.next();
				String a = s.getString(1);
				String b = String.valueOf(s.getInt(2));
				if(ad.getText().equals(a) && idd.getText().equals(b)) {
				    System.out.println("login");  
				    new Jmenu();
				}else {
					System.out.println("invald");
				}
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 
				
			}
			
		});
		reset=new JButton("reset");
		m.add(login);
	
		m.add(reset);
		
		m.setLayout(new FlowLayout());
		m.setSize(500, 500);
		m.setVisible(true);
	}
	public static void main(String[] args) {
		
	
	new Adminlogin();
	}

}
