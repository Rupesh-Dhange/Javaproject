package em;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Jimage {
	 Jimage(){
		 JFrame jm=new JFrame();
		 JButton jb = new JButton(new ImageIcon("https://tse2.mm.bing.net/th?id=OIP.B8u7c37kE5ZdM5ZCRm-4hwHaFF&pid=Api&P=0&h=180")); 
		   jb.setBounds(50, 50, 300, 300);
		   jm.add(jb);
//		  jm.setLayout(new FlowLayout());
	       jm.setSize(500, 500);
	       jm.setVisible(true);
	     
	 }
	 public static void main(String[] args) {
		new Jimage();
	}

}
