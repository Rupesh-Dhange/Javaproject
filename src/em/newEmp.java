package em;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class newEmp {
	 JLabel username,password,mess;
	 JTextField jt1,jt2;
	 JButton login,reset;
	 
  public newEmp(){
		JFrame m = new JFrame("EmpManagemen");
		username=new JLabel("Ename:");
		username.setBounds(100, 50, 100, 30);
		jt1=new JTextField();
		jt1.setBounds(200, 50, 100, 30);
		m.add(jt1);
		m.add(username);
		password=new JLabel("Eid:");
		password.setBounds(100, 100, 100, 30);
		m.add(password);
		jt2=new JTextField();
		jt2.setBounds(200, 100, 100, 30);
		m.add(jt2);
		pojo p = new pojo();
		login=new JButton("Add");
		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
			 p.setName(jt1.getText());
			 try {
			 p.setId(Integer.parseInt(jt2.getText()));
			 new imp().insert(p); 
		     mess.setText("Data inserted");
			 }catch(Exception ee) {
				 mess.setText("id in number format");
			 }
//			     new imp().insert(p); 
//			     mess.setText("Data inserted");
			
			
		}});
		login.setBounds(60, 160, 100, 30);
		m.add(login);
		reset=new JButton("reset");
		reset.setBounds(200, 160, 100, 30);
		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jt1.setText("");
				jt2.setText("");
				mess.setText("");
				
			}
			
		});
		JButton back=new JButton("back");
		back.setBounds(50, 400, 100, 30);
		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			new	MenuBar();
				
			}
			
		});
		m.add(back);
		m.add(reset);
		mess=new JLabel();
		mess.setBounds(200, 300, 200, 30);
		mess.setFont(new Font("Arial",Font.BOLD,18));
		m.add(mess);
		m.setLayout(null);
		m.setSize(500,500);
	    m.setVisible(true);
	    m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
  public static void main(String[] args) {
//        new newEmp();
}
			

}
