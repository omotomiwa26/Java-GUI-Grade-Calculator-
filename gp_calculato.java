/*This Program Calculates The Cumulative Grade Point Average(CGPA) Of Students Of Federal School Of Statistics. 
And Also Gives The Class Of Grade Of The Student*/ 
import javax.swing.*;

public class gp_calculato {
		public static void main(String[] args){
			look();

			double A = (float)7.00;
			double B =(float) 6.00;
			double C = (float)5.00;
			double D =(float) 4.00;
			double E = (float)3.00;
			double F = (float)2.00;
			double G = (float)1.00;
			double H = (float)0.00;
			
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
			if ((Score >= 65) && (Score <= 69)) {
				gp = Unit * B;
			}
			if ((Score >= 60) && (Score <= 64)) {
				gp = Unit * C;
			}
			if ((Score >= 55) && (Score <= 59)) {
				gp = Unit * D;
			}
			if ((Score >= 50) && (Score <= 54)) {
				gp = Unit * E;
			}
			if ((Score >= 45) && (Score <= 49)) {
				gp = Unit * F;
			}
			if ((Score >= 40) && (Score <= 44)) {
				gp = Unit * G;
			}
			if ((Score >= 0) && (Score <= 39)) {
				gp = Unit * H;
			}
			STU += Unit;
			STGP += gp;
			CGPA = STGP/STU;	
			}
			
			{
			if ((CGPA >= 0.00) && (CGPA <=1.4)) {
				Grade = "PASS";
				JOptionPane.showMessageDialog(null,"Your CGPA is"+CGPA+"Your Class is"+Grade);
			}else{
			if ((CGPA >= 1.5) && (CGPA <=2.6)) { 
				Grade = "THIRD-CLASS";
				JOptionPane.showMessageDialog(null,"Your CGPA is"+CGPA+"Your Class is"+Grade);
			}else{
			if ((CGPA >= 2.7) && (CGPA <=4.5)) {
				Grade = "SECOND-CLASS LOWER";
				JOptionPane.showMessageDialog(null,"Your CGPA is"+CGPA+"Your Class is"+Grade);
			}else{
			if ((CGPA >= 4.6) && (CGPA <=5.9)) {
				Grade = "SECOND-CLASS UPPER";
				JOptionPane.showMessageDialog(null,"Your CGPA is"+CGPA+"Your Class is"+Grade);
			}else{
				if ((CGPA >= 6.0) && (CGPA <=7.0)) {
					Grade = "FISRT-CLASS";
					JOptionPane.showMessageDialog(null,"Your CGPA is"+CGPA+"Your Class is"+Grade);
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

