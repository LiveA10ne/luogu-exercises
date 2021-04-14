package 数组;

import java.util.Scanner;

public class 小鱼的数字游戏 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[100];
		int index = 0;
		for (; ;) {
			int input = scanner.nextInt();
			if (input == 0) {
				break;
			}
			arr[index] = input;
			index++;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
