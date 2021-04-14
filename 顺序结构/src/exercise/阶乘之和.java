package exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class 阶乘之和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		BigInteger sum = new BigInteger("0");
		for (int i = 1; i <= n; i++) {
			sum = sum.add(stepMul(i));
		}
		System.out.println(sum);
	}
	
	private static BigInteger stepMul(int n) {
		BigInteger mul = new BigInteger("1");
		while (n > 0) {
			mul = mul.multiply(BigInteger.valueOf(n--));
		}
		return mul;
	}

}
