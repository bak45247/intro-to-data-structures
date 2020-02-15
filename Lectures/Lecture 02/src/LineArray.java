
import java.util.Scanner;

public class LineArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int SIZE = 3;
		Line[] lineArr = new Line[SIZE];

		for (int i = 0; i < lineArr.length; i++) {
			System.out.println("Enter line #" + i);
			System.out.println("Enter start-x of line #" + i);
			int startX = scan.nextInt();
			System.out.println("Enter start-y of line #" + i);
			int startY = scan.nextInt();
			System.out.println("Enter end-x of line #" + i);
			int endX = scan.nextInt();
			System.out.println("Enter end-y of line #" + i);
			int endY = scan.nextInt();

			lineArr[i] = new Line(startX, startY, endX, endY);
		}

		// printing the array
		for (int i = 0; i < lineArr.length; i++)
			System.out.println(lineArr[i]);

		// finding max and min

		double max = lineArr[0].length();
		int maxPos = 0;
		double min = lineArr[0].length();
		int minPos = 0;
		double sum = lineArr[0].length();

		for (int i = 1; i < lineArr.length; i++) {

			if (lineArr[i].length() > max) {
				max = lineArr[i].length();
				maxPos = i;
			}

			if (lineArr[i].length() < min) {
				min = lineArr[i].length();
				minPos = i;
			}

			sum = sum + lineArr[i].length();
		}

		System.out.println("Maximum :" + max + " line " + maxPos);
		System.out.println("Minimum :" + min + " line " + minPos);
		System.out.println("Sum :" + sum);

		// search the array for a value 50

		Point searchVal = new Point(15, 15);
		int pos = -1;
		int count = 0;

		for (int i = 0; i < lineArr.length; i++) {

			if (lineArr[i].midPoint().equals(searchVal)) {
				pos = i;
				count = count + 1;
			}
		}

		System.out.println(searchVal + " found at position: " + pos);
		System.out.println(searchVal + " found " + count + " times");

	}

}
