/*This Program Calculates The Cumulative Grade Point Average(CGPA) Of Students Of Federal School Of Statistics. 
And Also Gives The Class Of Grade Of The Student*/ 
import javax.swing.*;

public class CGPA_CALCULATOR {
		public static void main(String[] args){
			look();

			double A =(float) 4.00;
			double AB =(float) 3.63;
			double B = (float)3.13;
			double C =(float) 2.63;
			double D = (float)2.13;
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
			
			if ((Score >= 80) && (Score <= 100)) {
				gp = Unit * A;
			}
			if ((Score >= 70) && (Score <= 79)) {
				gp = Unit * AB;
			}
			if ((Score >= 60) && (Score <= 69)) {
				gp = Unit * B;
			}
			if ((Score >= 50) && (Score <= 59)) {
				gp = Unit * C;
			}
			if ((Score >= 40) && (Score <= 49)) {
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
			if ((CGPA >= 0.00) && (CGPA <=1.99)) {
				Grade = "PASS";
				JOptionPane.showMessageDialog(null,"Your CGPA is"+CGPA+"Your Class is"+Grade);
			}else{
			if ((CGPA >= 2.00) && (CGPA <=2.99)) { 
				Grade = "LOWER CREDIT";
				JOptionPane.showMessageDialog(null,"Your CGPA is"+CGPA+"Your Class is"+Grade);
			}else{
			if ((CGPA >= 3.00) && (CGPA <=3.49)) {
				Grade = "UPPER CREDIT";
				JOptionPane.showMessageDialog(null,"Your CGPA is"+CGPA+"Your Class is"+Grade);
			}else{
			if ((CGPA >= 3.50) && (CGPA <=4.00)) {
				Grade = "DINSTICTION";
				JOptionPane.showMessageDialog(null,"Your CGPA is"+CGPA+"Your Class is"+Grade);
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

