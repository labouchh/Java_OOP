
public class FoodItems {
	private double FatVal;
	private double CarbVal;
	private double ProVal;
	/*public void setData(double fat, double carb, double pro) {
		FatVal = fat;
		CarbVal = carb;
		ProVal = pro;
	}*/
	public void setFatVal(double fat) {
		FatVal = fat;
	}
	public double getFatVal() {
		return FatVal;
	}
	public void setCarbVal(double carb) {
		CarbVal = carb;
	}
	public double getCarbVal() {
		return CarbVal;
	}
	public void setProVal(double pro) {
		ProVal = pro;
	}
	public double getProVal() {
		return ProVal;
	}
	public double calcCalories() {
		double Calories = (FatVal * 9) + (CarbVal * 4) + (ProVal * 4);
		return Calories;	
	}
	public void printInfo() {
		System.out.println("Total Calories: " + calcCalories() + " calories (per serving)");
	}
}
