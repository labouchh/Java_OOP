package ClassWork;

public class Circle {
	private double radius = 0;
	public void setradius(double r) {
		radius = r;
	}
	public double CircleArea() {
		double Area = Math.PI * Math.pow(radius, 2); 
		return Area;
	}
}
