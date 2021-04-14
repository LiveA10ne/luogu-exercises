package 数组;

import java.util.Scanner;

public class 校门外的树 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner(System.in);
		int l = scanner.nextInt();
		int[] arr = new int[l + 1];
		int m = scanner.nextInt();
		for (int i = 0; i < m; i++) {
			int star = scanner.nextInt();
			int end = scanner.nextInt();
			for (int j = star; j < end + 1; j++) {
				arr[j] = 1;
			}
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				sum++;
			}
		}
		System.out.println(sum);
	}

}
