package 数组;

import java.util.Scanner;

public class 彩票摇奖 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] lotteryArr = new int[7];
		int[] winLottery = new int[7];
		for (int i = 0; i < 7; i++) {
			lotteryArr[i] = scanner.nextInt();
		}
		while (n-- > 0) {
			int sum = 0;
			for (int i = 0; i < 7; i++) {
				if (contain(lotteryArr, scanner.nextInt())) {
					sum++;
				}
			}
			if (sum != 0) {
				winLottery[7 - sum]++;
			}

		}
		for (int i : winLottery) {
			System.out.print(i+" ");
		}
	}
	
	private static boolean contain(int[] arr, int n) {
		for (int i : arr) {
			if (i == n) {
				return true;
			}
		}
		return false;
	}

}
