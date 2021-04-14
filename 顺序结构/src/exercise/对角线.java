package exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class 对角线 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		BigInteger bigN = BigInteger.valueOf(n);
		BigInteger rel = bigN.multiply(bigN.subtract(BigInteger.valueOf(1))).multiply(bigN.subtract(BigInteger.valueOf(2)).multiply(bigN.subtract(BigInteger.valueOf(3)))).divide(BigInteger.valueOf(24));
		System.out.println(rel);
	}

}
