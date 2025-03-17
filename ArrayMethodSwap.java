package ClassWork;
import java.util.Scanner;
public class ArrayMethodSwap {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int[] Arr = {4, 3, 10, 7};
		System.out.print("Before: ");
		for (int i= 0; i< 4; ++i) {
		System.out.print(Arr[i] + " ");
		}
		swap2by2(Arr); //always call method
	} 
	public static void swap2by2(int[] Arr) {
		int tempVal; 
		tempVal = Arr[0];
		Arr[0] = Arr[1];
		Arr[1] = tempVal;
		tempVal = Arr[2];
		Arr[2] = Arr[3];
		Arr[3] = tempVal;
		System.out.print("\nAfter: ");
		for (int i = 0; i < 4; ++i) {
		System.out.print(Arr[i] + " ");
		}
	} 

}
