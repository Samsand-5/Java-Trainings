package twoDimentionalArray;

import java.util.Scanner;

public class Programs {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		findSymmetric(arr);
		display(rotateClockWise(transpose(arr)));
	}

	public static int[][] createArray() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter rows");
		int row = scan.nextInt();
		System.out.println("Enter columns");
		int col = scan.nextInt();
		int[][] arr = new int[row][col];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter array element");
				arr[i][j] = scan.nextInt();
			}
		}
		return arr;
	}

	public static void findSymmetric(int[][] arr) {
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr[i].length; j++) {
				if (arr[i][j] != arr[j][i]) {
					flag = false;
					break;
				}
			}
			if (!flag) {
				break;
			}
		}
		if (flag) {
			System.out.println("Symmetric");
		} else {
			System.out.println("Not symmetric");
		}
	}

	public static int[][] transpose(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr[i].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		return arr;
	}

	public static int[][] rotateClockWise(int[][] arr) {
		int left = 0;
		int right = arr[0].length - 1;

		for (int i = 0; i < arr.length; i++) {
			while(left<right) {
				int temp = arr[i][left];
				arr[i][left] = arr[i][right];
				arr[i][right] = temp;
				
				left++;
				right--;
			}
		}
		

		return arr;
	}

	public static void display(int[][] arr) {
		for (int[] array : arr) {
			for (int i : array) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
