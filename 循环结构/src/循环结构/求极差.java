package 循环结构;

import java.util.Arrays;
import java.util.Scanner;

public class 求极差 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[n-1] - arr[0]);
	}

}
