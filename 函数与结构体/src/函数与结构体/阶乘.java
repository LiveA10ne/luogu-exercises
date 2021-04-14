package 函数与结构体;

import java.util.Scanner;


public class 阶乘 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println((int)jc(n));
		
	}
	
	private static double jc(int n) {
		if (n == 1) {
			return 1;		
		}
		
		return n * jc(n - 1);
	}

}
