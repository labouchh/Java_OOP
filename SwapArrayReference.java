package ClassWork;
import java.util.Scanner;
public class SwapArrayReference {
	public static void SwapArrayReference(int[] Arr1, int[] Arr2) {
		int[] tempArr = Arr1;
		Arr1 = Arr2;
		Arr2 = tempArr;
	}
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int[] mArr = {1 ,5 ,3 ,2 ,4};
		int [] nArr = {4, 1, 2, 3, 5};
		SwapArrayReference(mArr, nArr);
	}
}
//swap local values of an address