package ClassWork;

public class ArraySwap2 {
	public class ArraySwap {
		public static void main(String[] args) {
			int[] myarray = {2, 3, 4};
			int[] mynewarray;
			mynewarray = AddArr(myarray);
			for (int i = 0; i < mynewarray.length; i++) {
				System.out.print(mynewarray[i] + " ");
			}
		}
		public static int[] AddArr(int[] A) {
			int[] mycopyarray = new int[A.length];
			for (int i = 0; i < A.length; i++) {
				int n = i + 1;
				mycopyarray[i] = A[n];
			}
			return mycopyarray;
		}
	}
} //data remains the same, no change in original data