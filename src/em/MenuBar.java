package em;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar { 
	JMenuBar bar;
	JMenu employee,manager,staff;
	JMenuItem insert,update,delete,show;
	
	public MenuBar() {
		JFrame m=new JFrame("emp");
		bar=new JMenuBar();
		 m.setJMenuBar(bar);
		employee=new JMenu("Employee");
		manager=new JMenu("Manager");
		staff=new JMenu("Staff");
		bar.add(employee);
		bar.add(manager);
		bar.add(staff);
		insert=new JMenuItem("insert");
		insert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			  new newEmp();
				
			}
			
		});
		update=new JMenuItem("update");
		update.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new UpdateEmp();
				
			}
			
		});
		delete=new JMenuItem("delete");
		delete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new DeleteEmp();
				
			}
			
		});
		show=new JMenuItem("show");
		show.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			   new ShowEmp();
			}
			
		});
		employee.add(insert);
		employee.add(update);
		employee.add(delete);
		employee.add(show);
		m.setLayout(new FlowLayout());
		m.setSize(400,400);
		m.setVisible(true);
		
	}

}
