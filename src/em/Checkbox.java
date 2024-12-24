package em;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Checkbox {
	JCheckBox jc1,jc2,jc3;
	JButton bn;
	JLabel jt;
	Checkbox(){
       JFrame jm=new JFrame();
       jc1=new JCheckBox("shoes");
       jc2=new JCheckBox("shirt");
       jc3=new JCheckBox("pant");
       jm.add(jc1);
       jm.add(jc2);
       jm.add(jc3);
       bn=new JButton("total");
       bn.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
		  int amount=0;
		  String s=" ";
		  if(jc1.isSelected()) {
			  amount+=100;
		  }if(jc2.isSelected()) {
			  amount+=100;
			  
		  }if(jc3.isSelected()) {
			  amount+=100;
		  }
		  jt.setText("amount is "+amount);
		}
	
    	   
       });
       jm.add(bn);
        jt=new JLabel();
       jt.setBounds(50, 50, 100, 30);
       jm.add(jt);
       jm.setLayout(new FlowLayout());
       jm.setSize(500, 500);
       jm.setVisible(true);
} 
	public static void main(String[] args) {
		new Checkbox();
	}
		
	
}
