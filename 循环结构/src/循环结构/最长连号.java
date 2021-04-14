package 循环结构;

import java.util.Scanner;

public class 最长连号 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		int theMaxLen = 0;
		int count = 1;
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		if (n == 1) {
			System.out.println(1);
			return;
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - arr[i - 1] == 1) {
				count++;
			}
			else {
				count = 1;
			}
			if (count > theMaxLen) {
				theMaxLen = count;
			}
			
		}
		System.out.println(theMaxLen);
	}

}
