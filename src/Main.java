import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {
	// GUI
	// JFrame !!!
	public static void main(String[] args) {
		
		
		

		/*
		// JFrame = is a GUI window to add components
		JFrame frame = new JFrame();// Create a Frame
		// 1. Make the frame visible
		frame.setVisible(true);// make frame visible
		// 2. Increase the size
		frame.setSize(420, 420); // sets x-dimension and y-dimension of frame
		// 3.Change the title
		frame.setTitle("JFrame title goes here ");// sets title of our frame - left upper corner
		// 4.Close out of our program
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of our application d
		// 5. Prevent our windows from being resized
		frame.setResizable(false); // prevent frame from being resized
		// 6. Change the logo on the left upper corner

		ImageIcon image = new ImageIcon("bird_2.jpg"); // creates an image icon
		frame.setIconImage(image.getImage()); // change an icon of frame 
		
		// 7. change background color
		//Method Chaining is the practice of calling different methods
		//in a single line instead of calling other methods with the same object reference separately.
		
		// getContentPane() retrieves the content pane object from the frame object so that other
		//objects (text boxes, buttons, etc) may be applied to it or properties (color, etc) may be changed.
		frame.getContentPane().setBackground(new Color(123,50,20)); //Change color of background // or Color.red 
		//U can also add hexadecimal color 
		
		*/
		
		//Important !!!!
		/*Two different ways of creating a Frame 
		 * = > 1 Create an instance and give it a name 
		 * = > 2 Use JFrame as a parent class to a child class
		 * */
		
		
		// 2nd way 
		//With this we can make changes 
		MyFrame myframe = new MyFrame();
		new SecondFrame();

	}

}
