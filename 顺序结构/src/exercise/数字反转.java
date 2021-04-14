package exercise;

import java.util.Scanner;

public class 数字反转 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		System.out.println(new StringBuilder(input).reverse());
	}

}
