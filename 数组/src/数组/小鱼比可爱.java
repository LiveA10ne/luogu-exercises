package 数组;

import java.util.Scanner;

public class 小鱼比可爱 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i]) {
					count++;
				}
			}
			System.out.print(count+" ");
		}
	}

}
