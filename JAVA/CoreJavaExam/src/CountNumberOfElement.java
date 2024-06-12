import java.util.Scanner;

public class CountNumberOfElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int count = 0;

		System.out.println("Enter array elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter value of X : ");
		int x = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > x) {
				count++;
			}
		}
		System.out.println("Output = " + count);
	}

}
