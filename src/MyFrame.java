import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	MyFrame() {
		this.setVisible(true);

		this.setSize(420, 420);
		this.setTitle("JFrame title goes here ");

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		ImageIcon image = new ImageIcon("bird_2.jpg");
		this.setIconImage(image.getImage());

		this.getContentPane().setBackground(new Color(123, 50, 20));

	}
}
