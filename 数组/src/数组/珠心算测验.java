package 数组;

import java.util.Arrays;
import java.util.Scanner;

public class 珠心算测验 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		Arrays.sort(arr);
		int count = 0;
		outer:
		for (int i = 2; i < n; i++) {
			for (int j = 1; j < i; j++) {
				for (int k = 0; k < j; k++) {
					if (arr[k] + arr[j] == arr[i]) {
						count++;
						continue outer;
					}
				}
			}
		}
		System.out.println(count);
	}

}
