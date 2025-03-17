package ClassWork;
import java.util.Scanner;
public class MethodinMethod {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
			System.out.println("Enter radius and height: ");
			int R = scnr.nextInt();
			int h = scnr.nextInt();
			double V = method2(R, h);
			System.out.printf("The volume is: ", V);
			scnr.close();
		
	} //main
	public static double method2 (int x , int y) {//input parameter
		double V;
		double A = method1(x);
		V = A * y;
		return V;
	} //end method2
	public static double method1 (int R) { //POTENTIAL MCQ QUESTION "Correct header?"
		double A  = Math.PI * R * R;
		return A;
	}
}//end 
