package 字符串;

import java.util.Scanner;

public class 手机 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] keyboard = {
				1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,4,1,2,3,1,2,3,4
		};
		String input = scanner.nextLine();
		char[] arr = input.toCharArray();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 'a' && arr[i] <= 'z') {
				sum += keyboard[arr[i] - 'a'];
			}
			if (arr[i] == ' ') {
				sum++;
			}
		}
		System.out.println(sum);
	}

}
