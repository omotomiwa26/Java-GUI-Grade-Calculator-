//package gpcalculator2;

import javax.swing.*;
public class CGPAMain extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args){
		JFrame frame = new JFrame("GP Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainpage panel = new mainpage();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}

