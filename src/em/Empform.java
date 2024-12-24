package em;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Empform {
	JLabel us,pa,em,gender;
	JTextField u,p,e,g;
	JButton bn;
	Empform(){
		JFrame m = new JFrame();
		
		us=new JLabel("Username:");
		us.setFont(new Font("Arial",Font.BOLD,15));
		us.setBounds(50, 50, 100, 30);
		m.add(us);
		u=new JTextField();
		u.setBounds(160, 50, 100, 30);
		m.add(u);
		pa=new JLabel("Password:");
		pa.setBounds(50, 100, 100, 30);
		m.add(pa);
		p=new JTextField();
		p.setBounds(160, 100, 100, 30);
		m.add(p);
		em=new JLabel("Email:");
		em.setBounds(73, 150, 100, 30);
		m.add(em);
		e=new JTextField();
		e.setBounds(160, 150, 100, 30);
		m.add(e);
		gender=new JLabel("Gender:");
		gender.setBounds(60, 200, 100, 30);
		m.add(gender);	
		g=new JTextField();
		g.setBounds(160, 200, 100, 30);
		m.add(g);
		bn=new JButton("submit");
		bn.setBounds(100, 250, 100, 30);
		m.add(bn);
		
		m.setLayout(null);
		m.setSize(500, 500);
		m.setVisible(true);
	}
	public static void main(String[] args) {
		new Empform();
	}

}
