package 数组;

import java.util.Scanner;

public class 梦中的统计 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[10];
		int start = scanner.nextInt(), end = scanner.nextInt();
		for (int i = start; i <= end; i++) {
			int temp = i; 
			while (temp > 0) {
				int num = temp % 10;
				arr[num]++;
				temp = temp / 10;
			}
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
