package ClassWork;
import java.util.Scanner;
public class SwapMethod {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int x =5;
		int y = 7;
		System.out.println("Before: " + x + " " + y);
		Swap(x, y); //if print was after swap. then the method's print will print first and whatever is after goes second.
	}
	public static void Swap(int t ,int r){
		int temp = t;
		t = r;
		r = temp;
		System.out.println("After: " + t + " " + r);
	}
}
//return an array
