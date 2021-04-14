package 数组;

import java.awt.RenderingHints.Key;
import java.util.Scanner;

public class 压缩技术 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n * n];
		int sum = 0, i = 0;
		int key = 0;
		while (sum < n * n) {
			
			
			int count = scanner.nextInt();
			for (int j = 0; j < count; j++) {
				arr[i++] = key;
				sum++;
			}
			if (key == 0) {
				key = 1;
			}else {
				key = 0;
			}
		}
		int tag = 0;
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]);
			tag++;
			if (tag % n == 0) {
				System.out.println();
			}
		}
	}

}
