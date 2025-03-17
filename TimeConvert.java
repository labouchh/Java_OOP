package ClassWork;

//123 -> 2hrs 3mins 123%60=3mins 123/60=2hrs

import java.util.Scanner;
public class TimeConvert {
	Scanner scnr = new Scanner(System.in);
	
	public static void MinHour(int timeVal, int hour, int min) { //only the input/value is stored not the variable
		hour = timeVal / 60;
		min = timeVal % 60;
	} //can have loops and if statements in methods
	public static void main(String[] args) {
		int totalTime = 0;
		int userHour = 0;
		int userMin = 0;
		totalTime = 143;
		MinHour(totalTime, userHour, userMin); //calling the method
		System.out.print(userHour + userMin);
	}

}
