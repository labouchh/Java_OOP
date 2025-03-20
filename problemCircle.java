package ClassWork;
import java.util.Scanner;

public class problemCircle {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double radius = scnr.nextDouble();
		Circle C1 = new Circle();
		double Area = C1.CircleArea();
		System.out.println("The circle's area is " + Area);
		scnr.close();
	}
}
