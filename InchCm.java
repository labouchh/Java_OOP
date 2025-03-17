package ClassWork;
import java.util.Scanner;
public class InchCm {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a number in inches: ");
		int inches = scnr.nextInt();
		//ToCm(inches);
		//System.out.println(ToCm(inches));//IMP CALLING
		//or
		double result = ToCm(inches); //IMP CALLING
		System.out.println("The result is " + result + " centimeters");
	}
		public static double ToCm(int inches) { //IMP WHAT TYPE?
			double result = inches * 2.54; // IMP FUNCTION? value is returned the variable
			return(result); //IMP
		}

	}
