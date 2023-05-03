import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class GP_CALCULATOR {
		public static void main(String[] args){
			look();

			double A =(float) 5;
			double AB =(float)4;
			double B = (float)3;
			double C =(float) 2;
			double D = (float)1;
			double F = (float)0;
			double gp =(float) 0;
			double STU =(float)0;
			double STGP =(float)0;
			double CGPA =(float) 0;
			String Grade;
			
			int noOfcourses = Integer.parseInt(JOptionPane.showInputDialog("Input Number Of Courses Offered")); 
			for ( int courses = 0;courses < noOfcourses;courses++){
			String CourseCode = (JOptionPane.showInputDialog("Enter CourseCode"));
			int Score = Integer.parseInt(JOptionPane.showInputDialog("Enter"+CourseCode+"Score"));
			int Unit = Integer.parseInt(JOptionPane.showInputDialog("Enter"+CourseCode+"Unit"));
			
			if ((Score >= 70) && (Score <= 100)) {
				gp = Unit * A;
			}
			if ((Score >= 60) && (Score <= 99)) {
				gp = Unit * AB;
			}
			if ((Score >= 50) && (Score <= 59)) {
				gp = Unit * B;
			}
			if ((Score >= 45) && (Score <= 49)) {
				gp = Unit * C;
			}
			if ((Score >= 40) && (Score <= 44)) {
				gp = Unit * D;
			}
			if ((Score >= 0) && (Score <= 39)) {
				gp = Unit * F;
			}
			STU += Unit;
			STGP += gp;
			CGPA = STGP/STU;	
			}
			
			{
			if ((CGPA >= 0.00) && (CGPA <=0.90)) {
				Grade = "FAIL";
				JOptionPane.showMessageDialog(null,"Your CGPA is"+CGPA+"Your Class is"+Grade);
			}else{
			if ((CGPA >= 1.00) && (CGPA <=1.4)) { 
				Grade = "PASS";
				JOptionPane.showMessageDialog(null,"Your CGPA is"+CGPA+"Your Class is"+Grade);
			}else{
			if ((CGPA >= 1.5) && (CGPA <=2.39)) {
				Grade = "THIRD CLASS";
				JOptionPane.showMessageDialog(null,"Your CGPA is"+CGPA+"Your Class is"+Grade);
			}else{
			if ((CGPA >= 2.40) && (CGPA <=3.49)) {
				Grade = "SECOND-CLASS LOWER";
				JOptionPane.showMessageDialog(null,"Your CGPA is"+CGPA+"Your Class is"+Grade);
			}else{
			if ((CGPA >= 3.50) && (CGPA <=4.49)) {
				Grade = "SECOND-CLASS UPPER";
				JOptionPane.showMessageDialog(null,"Your CGPA is"+CGPA+"Your Class is"+Grade);
			}else{
			if ((CGPA >= 4.50) && (CGPA <=5.00)) {
				Grade = "FIRST CLASS";
				JOptionPane.showMessageDialog(null,"Your CGPA is"+CGPA+"Your Class is"+Grade);
						}
						}
					}	
				}		
			}
		}
	}
		}


	public static void look(){

		try{
			
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			
		}
		
		
		catch(Exception c){
			
			System.out.print("Design didn't work oops!");
			
		}


	}
}
