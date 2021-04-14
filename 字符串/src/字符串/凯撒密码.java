package 字符串;

import java.util.Scanner;

public class 凯撒密码 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String password = scanner.next();
		char[] arr = password.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (char) ('a' + (arr[i] - 'a' + n) % 26);
		}
		for (char c : arr) {
			System.out.print(c);
		}
		scanner.close();
	}

}
