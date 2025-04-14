package dailyPrograms;
/*
 * https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true
 */

import java.util.Scanner;

public class SubArrayHackerrank {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter the elements"); 
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
				if(sum<0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
