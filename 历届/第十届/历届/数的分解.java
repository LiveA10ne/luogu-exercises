package 历届;

public class 数的分解 {
	
	private static int ans = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 2019; i++) {
			for (int j = i + 1; i + j < 2019; j++) {
				for (int k = j + 1; i + j + k <= 2019; k++) {
					if (!contain(i) && !contain(j) && !contain(k) && i + j + k == 2019) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}
	
	private static boolean contain(int x) {
		int d;
		while (x > 0) {
			d = x % 10;
			if (d == 2 || d == 4) {
				return true;
			}
			x = x / 10;
		}
		return false;
	}

}
