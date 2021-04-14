package 数组;

import java.util.Scanner;

public class 爱与愁的心痛 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), m = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int min = 0;
		for (int i = 0; i < m; i++) {
			min += arr[i];
		}
		
		for (int i = 0; i <= n - m; i++) {
			int sum = 0;
			for (int j = i; j < i + m; j++) {
				sum += arr[j];
			}
			if (sum < min) {
				min = sum;
			}
			
		}
		
		System.out.println(min);
		
	}

}
