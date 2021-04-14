package 数组;

import java.util.ArrayList;
import java.util.Scanner;

public class 冰雹猜想 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(n);
		while (n > 1) {
			if (n % 2 == 0) {
				n /= 2;
				list.add(n);
			}else {
				n = n * 3 + 1;
				list.add(n);
			}
		}
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i) + " ");
		}
	}
}
