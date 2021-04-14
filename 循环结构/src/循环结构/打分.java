package 循环结构;

import java.util.Arrays;
import java.util.Scanner;

public class 打分 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		Arrays.sort(arr);
		int sum = 0;
		for (int i = 1; i < n - 1; i++) {
			sum += arr[i];
		}
		System.out.printf("%.2f",1.0 * sum / (n - 2));
	}

}
