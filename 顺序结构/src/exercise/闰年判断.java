package exercise;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class 闰年判断 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		GregorianCalendar instanceCalendar = new GregorianCalendar();
		boolean isLeap = instanceCalendar.isLeapYear(year);
		if (isLeap) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

}
