import javax.swing.*;

import java.awt.*;

public class GUI_CGPA_CALCULATOR {
	public static void main(String []args){
		
		//creating the frame.
		JFrame myframe = new JFrame("GRAPHICAL USER INTERFACE CUMMULATIVE GRADE POINT AVERAGE CALCULATOR");
		myframe.setSize(1000,1500);
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//creating the container.
		Container mycon = myframe.getContentPane();
		GridLayout C = new GridLayout(8,3,1,1);
		mycon.setLayout(C);
		
		//adding the look and feel method to show the look and feel effect on the container
		look();
		
		//creating the panel added to the container.
		JPanel P1 = new JPanel();
		P1.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//creating the panel for the components to be added.
		JPanel P2 =new JPanel();
		P2.setLayout(new GridLayout(3,2));
		JLabel CC1 = new JLabel("CourseCode 1 ");
		JTextField CC_1 = new JTextField("Enter Your CourseCode 1");				
		JLabel CS1 = new JLabel("CourseScore 1");
		JComboBox<Integer> CS_1 = new JComboBox<Integer>();
		for(int i = 0; i<=100; i++){
			CS_1.addItem(i);
		}
		JLabel CU1 = new JLabel("courseUnit 1");
		JComboBox<Integer> CU_1 = new JComboBox<Integer>();
		for(int i = 0; i<=10; i++){
			CU_1.addItem(i);
		}
		
		//adding the components to the panel.
		P2.add(CC1);
		P2.add(CC_1);
		P2.add(CS1);
		P2.add(CS_1);
		P2.add(CU1);
		P2.add(CU_1);
		
		//adding the components-panel to the container-panel
		P1.add(P2);
		
		//creating the panel added to the container 
		JPanel P3 = new JPanel();
		P3.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//creating the panel for the components to be added
		JPanel P4 = new JPanel();
		P4.setLayout(new GridLayout(3,2));
		JLabel CC2 = new JLabel("CourseCode 2 ");
		JTextField CC_2 = new JTextField("Enter Your CourseCode 2");
		JLabel CS2 = new JLabel("CourseScore 2");
		JComboBox<Integer> CS_2 = new JComboBox<Integer>();
		for(int i = 0; i<=100; i++){
			CS_2.addItem(i);
		}
		JLabel CU2 = new JLabel("courseUnit 2");
		JComboBox<Integer> CU_2 = new JComboBox<Integer>();
		for(int i = 0; i<=10; i++){
			CU_2.addItem(i);
		}
		
		//adding the components to the panel
		P4.add(CC2);
		P4.add(CC_2);
		P4.add(CS2);
		P4.add(CS_2);
		P4.add(CU2);
		P4.add(CU_2);
		
		//adding the components-panel to the container-panel
		P3.add(P4);
		
		//creating the panel added to the container 
		JPanel P5 = new JPanel();
		P5.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//creating the panel for the components to be added
		JPanel P6 = new JPanel();
		P6.setLayout(new GridLayout(3,2));
		JLabel CC3 = new JLabel("CourseCode 3 ");
		JTextField CC_3 = new JTextField("Enter Your CourseCode 3");
		JLabel CS3 = new JLabel("CourseScore 3");
		JComboBox<Integer> CS_3 = new JComboBox<Integer>();
		for(int i = 0; i<=100; i++){
			CS_3.addItem(i);
		}
		JLabel CU3 = new JLabel("courseUnit 3");
		JComboBox<Integer> CU_3 = new JComboBox<Integer>();
		for(int i = 0; i<=10; i++){
			CU_3.addItem(i);
		}
		
		//adding the components to the panel 
		P6.add(CC3);
		P6.add(CC_3);
		P6.add(CS3);
		P6.add(CS_3);
		P6.add(CU3);
		P6.add(CU_3);
		
		//adding the components-panel to the container-panel
		P5.add(P6);
		
		//creating the panel added to the container
		JPanel P7 = new JPanel();
		P7.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//creating the panel for the components to be added
		JPanel P8 =new JPanel();
		P8.setLayout(new GridLayout(3,2));
		JLabel CC4 = new JLabel("CourseCode 4 ");
		JTextField CC_4 = new JTextField("Enter Your CourseCode 4");				
		JLabel CS4 = new JLabel("CourseScore 4");
		JComboBox<Integer> CS_4 = new JComboBox<Integer>();
		for(int i = 0; i<=100; i++){
			CS_4.addItem(i);
		}
		JLabel CU4 = new JLabel("courseUnit 4");
		JComboBox<Integer> CU_4 = new JComboBox<Integer>();
		for(int i = 0; i<=10; i++){
			CU_4.addItem(i);
		}
		
		//adding the components to the panel
		P8.add(CC4);
		P8.add(CC_4);
		P8.add(CS4);
		P8.add(CS_4);
		P8.add(CU4);
		P8.add(CU_4);
		
		//adding the components-panel to the container-panel
		P7.add(P8);
		
		//creating the panel added to the container
		JPanel P9 = new JPanel();
		P9.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//creating the panel for the components to be added
		JPanel P10 = new JPanel();
		P10.setLayout(new GridLayout(3,2));
		JLabel CC5 = new JLabel("CourseCode 5 ");
		JTextField CC_5 = new JTextField("Enter Your CourseCode 5");
		JLabel CS5 = new JLabel("CourseScore 5");
		JComboBox<Integer> CS_5 = new JComboBox<Integer>();
		for(int i = 0; i<=100; i++){
			CS_5.addItem(i);
		}
		JLabel CU5 = new JLabel("courseUnit 5");
		JComboBox<Integer> CU_5 = new JComboBox<Integer>();
		for(int i = 0; i<=10; i++){
			CU_5.addItem(i);
		}
		
		//adding the components to the panel
		P10.add(CC5);
		P10.add(CC_5);
		P10.add(CS5);
		P10.add(CS_5);
		P10.add(CU5);
		P10.add(CU_5);
		
		//adding the components-panel to the container-panel
		P9.add(P10);
		
		//creating the panel added to the container
		JPanel P11 = new JPanel();
		P11.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//creating the panel for the components to be added
		JPanel P12 = new JPanel();
		P12.setLayout(new GridLayout(3,2));
		JLabel CC6 = new JLabel("CourseCode 6 ");
		JTextField CC_6 = new JTextField("Enter Your CourseCode 6");
		JLabel CS6 = new JLabel("CourseScore 6");
		JComboBox<Integer> CS_6 = new JComboBox<Integer>();
		for(int i = 0; i<=100; i++){
			CS_6.addItem(i);
		}
		JLabel CU6 = new JLabel("courseUnit 6");
		JComboBox<Integer> CU_6 = new JComboBox<Integer>();
		for(int i = 0; i<=10; i++){
			CU_6.addItem(i);
		}
		
		//adding the components to the panel
		P12.add(CC6);
		P12.add(CC_6);
		P12.add(CS6);
		P12.add(CS_6);
		P12.add(CU6);
		P12.add(CU_6);
		
		//adding the components-panel to the container-panel
		P11.add(P12);
		
		//creating the panel added to the container
		JPanel P13 = new JPanel();
		P13.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//creating the panel for the components to be added
		JPanel P14 =new JPanel();
		P14.setLayout(new GridLayout(3,2));
		JLabel CC7 = new JLabel("CourseCode 7 ");
		JTextField CC_7 = new JTextField("Enter Your CourseCode 7");				
		JLabel CS7 = new JLabel("CourseScore 7");
		JComboBox<Integer> CS_7 = new JComboBox<Integer>();
		for(int i = 0; i<=100; i++){
			CS_7.addItem(i);
		}
		JLabel CU7 = new JLabel("courseUnit 7");
		JComboBox<Integer> CU_7 = new JComboBox<Integer>();
		for(int i = 0; i<=10; i++){
			CU_7.addItem(i);
		}
		
		//adding the components to the panel
		P14.add(CC7);
		P14.add(CC_7);
		P14.add(CS7);
		P14.add(CS_7);
		P14.add(CU7);
		P14.add(CU_7);
		
		//adding the components-panel to the container-panel
		P13.add(P14);
		
		//creating the panel added to the container
		JPanel P15 = new JPanel();
		P15.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//creating the panel for the components to be added
		JPanel P16 = new JPanel();
		P16.setLayout(new GridLayout(3,2));
		JLabel CC8 = new JLabel("CourseCode 8 ");
		JTextField CC_8 = new JTextField("Enter Your CourseCode 8");
		JLabel CS8 = new JLabel("CourseScore 8");
		JComboBox<Integer> CS_8 = new JComboBox<Integer>();
		for(int i = 0; i<=100; i++){
			CS_8.addItem(i);
		}
		JLabel CU8 = new JLabel("courseUnit 8");
		JComboBox<Integer> CU_8 = new JComboBox<Integer>();
		for(int i = 0; i<=10; i++){
			CU_8.addItem(i);
		}
		
		//adding the components to the panel
		P16.add(CC8);
		P16.add(CC_8);
		P16.add(CS8);
		P16.add(CS_8);
		P16.add(CU8);
		P16.add(CU_8);
		
		//adding the components-panel to the container-panel
		P15.add(P16);
		
		//creating the panel added to the container
		JPanel P17 = new JPanel();
		P17.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		//creating the panel for the components to be added
		JPanel P18 = new JPanel();
		P18.setLayout(new GridLayout(3,2));
		JLabel CC9 = new JLabel("CourseCode 9 ");
		JTextField CC_9 = new JTextField("Enter Your CourseCode 9");
		JLabel CS9 = new JLabel("CourseScore 9");
		JComboBox<Integer> CS_9 = new JComboBox<Integer>();
		for(int i = 0; i<=100; i++){
			CS_9.addItem(i);
		}
		JLabel CU9 = new JLabel("courseUnit 9");
		JComboBox<Integer> CU_9 = new JComboBox<Integer>();
		for(int i = 0; i<=10; i++){
			CU_9.addItem(i);
		}
		
		//adding the components to the panel
		P18.add(CC9);
		P18.add(CC_9);
		P18.add(CS9);
		P18.add(CS_9);
		P18.add(CU9);
		P18.add(CU_9);
		
		//adding the components-panel to the container-panel
		P17.add(P18);
		
		//creating the panel added to the container
				JPanel P19 = new JPanel();
				P19.setLayout(new FlowLayout(FlowLayout.CENTER));
				
				//creating the panel for the components to be added
				JPanel P20 = new JPanel();
				P20.setLayout(new GridLayout(3,2));
				JLabel CC10 = new JLabel("CourseCode 10 ");
				JTextField CC_10 = new JTextField("Enter Your CourseCode 10");
				JLabel CS10 = new JLabel("CourseScore 10");
				JComboBox<Integer> CS_10 = new JComboBox<Integer>();
				for(int i = 0; i<=100; i++){
					CS_10.addItem(i);
				}
				JLabel CU10 = new JLabel("courseUnit 10");
				JComboBox<Integer> CU_10 = new JComboBox<Integer>();
				for(int i = 0; i<=10; i++){
					CU_10.addItem(i);
				}
				
				//adding the components to the panel
				P20.add(CC10);
				P20.add(CC_10);
				P20.add(CS10);
				P20.add(CS_10);
				P20.add(CU10);
				P20.add(CU_10);
				
				//adding the components-panel to the container-panel
				P19.add(P20);
		
		//adding the panels on the same columns together
		P1.add(P17);
		P3.add(P20);
		
		
		
		
		
		
		
		
		
		
		//adding the container-panels to the container
		mycon.add(P1);
		mycon.add(P3);
		mycon.add(P5);
		mycon.add(P7);
		mycon.add(P9);
		mycon.add(P11);
		mycon.add(P13);
		mycon.add(P15);
		
		//setting the visibility of the frame
		myframe.setVisible(true);
	}	
		
	//creating UIManager(look and feel) and adding the try and catch exception to it
		public static void look(){

			try{
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			}
			catch(Exception c){
				JOptionPane.showMessageDialog(null,"Design didn't work...sorry");
			}
		}
}