package 字符串;

import java.util.Scanner;

public class 笨小猴 {
	
	private static boolean[] primeList = new boolean[100];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initPrime();
		int[] store = new int[30];
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		char[] arr = input.toCharArray();
		for (char c : arr) {
			store[c - 'a']++;
		}
			
		int min = 100, max = 0;
		for (int i : store) {
			if (i != 0 && i < min) {
				min = i;
			}
			if (i > max) {
				max = i;
			}
		}
		int rel = max - min;
		if (primeList[rel]) {
			System.out.println("Lucky Word");
			System.out.println(rel);
		}else {
			System.out.println("No Answer");
			System.out.println(0);
		}
	}
	
	private static void initPrime() {
		for (int i = 2; i < primeList.length; i++) {
			primeList[i] = true;
		}
		for (int i = 0; i < primeList.length; i++) {
			if (!primeList[i]) {
				continue;
			}
			for (int j = 2 * i; j < primeList.length; j += i) {
				primeList[j] = false;
			}
		}
	}
	

}
