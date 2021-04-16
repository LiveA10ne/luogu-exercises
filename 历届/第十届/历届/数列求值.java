package 历届;


public class 数列求值 {
	
	private static int a;
	private static int b;
	private static int c;
	private static int d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a = 1;
		b = 1;
		c = 1;
		int i = 0;
		while (++i <= 20190321) {
			d = (a + b + c) % 10000;
			a = b % 10000;
			b = c % 10000;
			c = d % 10000;
		}
		System.out.println(d % 10000);
	}

}
