import java.util.Scanner;

public class ArraysDriver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int SIZE = 5;
		int[] integerArr = new int[SIZE];

		for (int i = 0; i < integerArr.length; i++) {
			System.out.println("Enter integer #" + i);
			integerArr[i] = scan.nextInt();
		}

		// printing the array
		for (int i = 0; i < integerArr.length; i++)
			System.out.println(integerArr[i]);

		// finding max and min

		int max = integerArr[0];
		int min = integerArr[0];

		int sum = integerArr[0];

		for (int i = 1; i < integerArr.length; i++) {

			if (integerArr[i] > max)
				max = integerArr[i];

			if (integerArr[i] < min)
				min = integerArr[i];

			sum = sum + integerArr[i];
		}

		System.out.println("Maximum :" + max);
		System.out.println("Minimum :" + min);
		System.out.println("Sum :" + sum);

		// search the array for a value 50

		int searchVal = 50;
		int pos = -1;
		int count = 0;

		for (int i = 0; i < integerArr.length; i++) {

			if (integerArr[i] == searchVal) {
				pos = i;
				count = count + 1;
			}
		}

		System.out.println(searchVal + " found at position: " + pos);
		System.out.println(searchVal + " found " + count + " times");

	}

}
