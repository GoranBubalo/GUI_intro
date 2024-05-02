import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class SecondFrame extends JFrame {
	
	SecondFrame(){
		this.setVisible(true);
		this.setTitle("This is a new Title");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		ImageIcon image = new ImageIcon("bird_2.jpg");//Create n ImageeIcon
		this.setIconImage(image.getImage()); // Change the image icon 
		this.getContentPane().setBackground(Color.blue);
		this.setSize(450,450);
	}
	

}
