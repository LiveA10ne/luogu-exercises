package 数组;

import java.util.Scanner;

public class BovineBonesG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int s1 = scanner.nextInt(), s2 = scanner.nextInt(), s3 = scanner.nextInt();
		int[] store = new int[s1 + s2 + s3 + 1];
		for (int i = 1; i <= s1; i++) {
			for (int j = 1; j <= s2; j++) {
				for (int k = 1; k <=s3; k++) {
					store[i + j + k]++;
				}
			}
		}
		int max = 0, index = 0;
		for (int i = 3; i < store.length; i++) {
			if (store[i] > max) {
				max = store[i];
				index = i;
			}
		}
		System.out.println(index);
	}

}
