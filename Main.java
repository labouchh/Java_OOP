import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double FatVal = 0.0;
		double CarbVal = 0.0;
		double ProVal = 0.0;
		System.out.println("What food did you have? ");
		String FoodName = scnr.next();
		System.out.println("Fat value of one " + FoodName + " serving (g): ");
		FatVal = scnr.nextDouble();
		System.out.println("Carbohydrates per serving of " + FoodName + " (g): ");
		CarbVal = scnr.nextDouble();
		System.out.println("Protein value of " + FoodName + " (g): ");
		ProVal = scnr.nextDouble();
		
		FoodItems myvals = new FoodItems();
		myvals.setFatVal(FatVal);
		myvals.setCarbVal(CarbVal);
		myvals.setProVal(ProVal);
		//must be in the same object instance since the output combines all three inputs
		myvals.printInfo();
		
//did not call get method as i only need the values to be seen by the calcCalories method to print out calories only.
		



		scnr.close();
	} 

}
