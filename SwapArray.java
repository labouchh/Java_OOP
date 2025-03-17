package ClassWork;
import java.util.Scanner;
public class SwapArray {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int[] Arr = {7, 3, 2, 10};
		for (int i = 0; i < 4; i++) {
			System.out.print(Arr[i] + " ");
		} SwapArray(Arr);
	}
		public static void SwapArray(int[] Arr) {
			int temp;
			temp = Arr[0];
			Arr[0] = Arr[1];
			Arr[1] = temp;
		}
	}
