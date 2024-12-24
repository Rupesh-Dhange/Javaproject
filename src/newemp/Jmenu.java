package newemp;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Jmenu {
	JMenuBar jb ;
	JMenu emp,manager,staff;
	JMenuItem insert,update,delete,show;
	Jmenu(){
		JFrame j= new JFrame();
		jb=new JMenuBar();
		j.setJMenuBar(jb);
//		jb=new JMenuBar();
		emp=new JMenu("employee");
		manager=new JMenu("Manager");
		staff=new JMenu("Staff");
		 jb.add(emp);
		 jb.add(manager);
		 jb.add(staff);
		 insert=new JMenuItem("Insert");
		 insert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			new NewEmpp();
				
			}
			 
		 });
		 update=new JMenuItem("Update");
		 delete=new JMenuItem("Delete");
		 show=new JMenuItem("show");
		 show.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
				new NewEmpp();
					
				}
				 
			 });
		 emp.add(insert);
		 emp.add(update);
		 emp.add(delete);
		 emp.add(show);
		j.setLayout(new FlowLayout());
		j.setSize(500, 500);
		j.setVisible(true);
		
	}
	public static void main(String[] args) {
//		 new Jmenu();
	}

}
