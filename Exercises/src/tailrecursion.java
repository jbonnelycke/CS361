
public class tailrecursion { // 9.16.20: transfer tailfact to iterative
	public static void main(String[] args) {
		System.out.println(tail2Iterative(4, 1));
	}
	
	public static int tail2Iterative(int n, int x) {
		int y1 = n;
		int y2 = x;
		while (y1 != 0) {
			y2 = y2 * y1;
			y1 = y1 - 1;					
		}
		return y2;
	}
}
