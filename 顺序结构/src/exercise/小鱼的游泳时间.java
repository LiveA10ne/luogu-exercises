package exercise;

import java.util.Calendar;
import java.util.Scanner;

public class 小鱼的游泳时间 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Calendar  time1 = Calendar.getInstance();
		Calendar  time2 = Calendar.getInstance();
		time1.set(Calendar.HOUR_OF_DAY, scanner.nextInt());
		time1.set(Calendar.MINUTE, scanner.nextInt());
		time2.set(Calendar.HOUR_OF_DAY, scanner.nextInt());
		time2.set(Calendar.MINUTE, scanner.nextInt());
		long minutes  = (time2.getTimeInMillis() - time1.getTimeInMillis()) / (60 * 1000);
		long hour = minutes / 60;
		long minute = minutes - hour * 60;
		System.out.println(hour + " " + minute);
	}

}
