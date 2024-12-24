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

public class Neemp {
	JLabel admin,id;
	JTextField ad,idd;
	JButton login,reset;
	public Neemp() {
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
		
	
	new Neemp();
	}

}
