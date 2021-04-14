package exercise;

import java.util.Scanner;

public class 小玉在游泳 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double distance = scanner.nextDouble();
		double sum = 0;
		double stepLen = 2.0;
		int steps = 0;
		while (sum < distance) {
			sum += stepLen;
			stepLen *= 0.98;
			steps++;
		}
		System.out.println(steps);
	}

}
