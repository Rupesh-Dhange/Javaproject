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

public class NewEmpp {
	JLabel admin,id;
	JTextField ad,idd;
	JButton login,reset;
	public NewEmpp() {
		JFrame m = new JFrame();
		admin=new JLabel("admin");
		id=new JLabel("id");
		m.add(admin);
		m.add(id);
		ad=new JTextField(20);
		idd=new JTextField(20);
		m.add(ad);
		m.add(idd);
		pojoo p=new pojoo();
		login=new JButton("login");
		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
       	    new take().show();
				
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
		
	
	new NewEmpp();
	}

}
