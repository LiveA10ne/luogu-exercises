package exercise;

import java.util.Scanner;

public class 分类平均 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(),
				k = scanner.nextInt();
		int sum = 0;
		for (int i = k; i <= n; i = i+k) {
			sum += i;
		}
		System.out.printf("%.1f ",(double)sum / (n / k));
		sum = (1 + n) * n / 2 -sum;
		System.out.printf("%.1f",(double)sum / (n - n /k));
	}

}
