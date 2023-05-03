
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class mainpage extends JPanel{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel courseLabel, unitLabel, gradeLabel;
	private JTextField course, unit;
	private JButton addCourseButton,calcGPbutton, clearAllButton;
	private JTextArea tArea;
	@SuppressWarnings("rawtypes")
	private JComboBox grade;
	List<String>gradeArray = new ArrayList<String>();
	List<Integer>unitArray =new ArrayList<Integer>();
	Map<String, Double>grades = new HashMap<String, Double>();
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public mainpage(){
		this.populateGrades();
		setLayout(null);
		setPreferredSize (new Dimension(500, 500));
		setBackground (Image.UndefinedProperty);
		courseLabel = new JLabel ("Course Code : ");
		course = new JTextField(33);
		course.addActionListener(new TempListener());
		gradeLabel = new JLabel ("Grade: ");
		grade = new JComboBox (grades.keySet().toArray());
		grade.addActionListener(new TempListener());
		unitLabel = new JLabel ("Course Unit");
		unit = new JTextField (6);
		unit.addActionListener(new TempListener());
		addCourseButton = new JButton ("Add Another Course");
		addCourseButton.addActionListener(new TempListener());
		calcGPbutton =new JButton ("Calculate GP");
		calcGPbutton.addActionListener(new TempListener());
		clearAllButton = new JButton ("Clear All");
		clearAllButton.addActionListener(new TempListener());
		tArea =new JTextArea (5, 5);
		tArea.setEditable(false);
		add (courseLabel);
		add (course);
		add (gradeLabel);
		add (grade);
		add (unitLabel);
		add (unit);
		add (addCourseButton);
		add (calcGPbutton);
		add (clearAllButton);
		add (tArea);
		//Position of GUI elements
		courseLabel.setBounds(20, 20, 150, 20);
		course.setBounds(120, 20, 350, 20);
		gradeLabel.setBounds(20, 50, 50, 20);
		grade.setBounds(120, 50, 50, 20);
		unitLabel.setBounds(20, 80, 100, 20);
		unit.setBounds(120, 80, 50, 20);
		addCourseButton.setBounds(20, 120, 200, 30);
		calcGPbutton.setBounds(300, 400, 175, 30);
		clearAllButton.setBounds(20, 440, 120, 30);
		tArea.setBounds(20, 170, 450, 250);
	}
	private void setBackground(Object undefinedproperty) {
		// TODO Auto-generated method stub
		
	}
	private void populateGrades(){
		grades.put("80-100", 4.00);
		grades.put("70-79", 3.63);
		grades.put("60-69", 3.13);
		grades.put("50-59", 2.63);
		grades.put("40-49", 2.13);
		grades.put("0-39", 0.00);
	}
	private class TempListener implements ActionListener{
		String tCrPoints;
		int tCrPoint; 
		int tUnits  ; 
		int tGP ;
		String status;
		public void actionPerformed(ActionEvent event){
			double grad = 0.00;
			if (event.getSource() == addCourseButton){
				gradeArray.add(grade.getSelectedItem().toString());
				unitArray.add(Integer.parseInt(unit.getText()));	
					for (String grade : gradeArray){
					grades.get(grade);
					
					for (Integer unit : unitArray){
					grad = (unit * grades.get(grade));
					
						}
					}
					//Double.parseDouble(tCrPoints);
					tCrPoint += grad;
					
				
				tArea.append(course.getText() + "\t\t" +grade.getSelectedItem() + "\t" + grad + "\t" + tCrPoint + "\n");
				course.setText("");
				unit.setText("");
				
				}
			
				
				if (event.getSource()== calcGPbutton){
					
					tCrPoints += tCrPoint;
					for (Integer unit : unitArray){
						tUnits += unit;
					
					tGP = Double.parseDouble(tCrPoints) / tUnits;
					if (tGP >= 2)
						status = ("Pass");
					else
						status = ("Fail");
					}
					//Output for text area
					tArea.setText("Total Credit Points : "+ tCrPoints + "\n" +"Total Units : "+ tUnits  +"\n\n"+ "GPA : "+ tGP +"\n"+"Status : "+status);
					}
				
			if (event.getSource()==clearAllButton){
				tArea.setText("");
				unit.setText("");
				grade.setSelectedIndex(0);
				tUnits =0;
				
				
				}
			}
		}
		
	}
