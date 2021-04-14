package 数组;

import java.util.Scanner;

public class 压缩技术续集 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		StringBuilder input = new StringBuilder();
		String s1 = scanner.nextLine();
		int n = s1.length();
		input.append(s1);
		for (int i = 0; i < n - 1; i++) {
			input.append(scanner.nextLine());
		}
		System.out.print(n+" ");
		char[] arr = input.toString().toCharArray();
		int sum = 1;
		for (int i = 1; i < arr.length; i++) {			
			if (arr[i] == arr[i - 1]) {
				sum++;
			}else {
				System.out.print(sum+" ");
				sum = 1;
			}
		}
		System.out.print(sum);
	}

}
