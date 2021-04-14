package 字符串;

import java.util.Scanner;

public class 标题统计 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine().replaceAll("\\s", "");
		System.out.println(input.length());
		scanner.close();
	}

}
