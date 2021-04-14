package exercise;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

public class 小学数学N合一 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if (n == 1) {
			System.out.println("I love Luogu!");
		}else if (n == 2) {
			System.out.println(6+" "+4);
		}else if (n == 3) {
			System.out.println(3);
			System.out.println(12);
			System.out.println(2);
		}else if (n == 4) {
			System.out.printf("%.3f",500/3.0);
		}else if (n == 5) {
			System.out.println((260 + 220) / 32);
		}else if (n == 6) {
			System.out.println(Math.sqrt(6 * 6 + 9 * 9));
		}else if (n == 7) {
			System.out.println(110);
			System.out.println(90);
			System.out.println(0);
		}else if (n == 8) {
			System.out.println(10 * 3.141593);
			System.out.println(3.141593 * 5 * 5);
			System.out.println(4 * 3.141593 * 125 / 3.0);
		}else if (n == 9) {
			System.out.println(22);
		}else if (n == 10) {
			System.out.println(9);
		}else if (n == 11) {
			BigDecimal a = new BigDecimal("100");
			BigDecimal b = new BigDecimal("3");
			System.out.println(a.divide(b, 9, RoundingMode.HALF_UP));
		}else if (n == 12) {
			System.out.println((int)('M' - 'A' + 1));
			System.out.println((char)('A' + 17));
		}else if (n == 13) {
			System.out.println((int)Math.pow(4.0 / 3 * 3.141593 * (Math.pow(4, 3) + Math.pow(10, 3)), 1.0*1/3));
		}else if (n == 14) {
			System.out.println(50);
		}
	}

}
