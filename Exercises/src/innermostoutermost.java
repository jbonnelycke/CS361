
public class innermostoutermost { // 9.14.20: determine whether Java evaluates recursion w/ innermost or outermost
	public static void main(String[] args) {
		System.out.println(innerOuter(1, 1)); // Java is innermost!
	}
	
	public static int innerOuter(int n, int m) {
		if (n == 0)
			return 0;
		else
			return innerOuter(n-1, innerOuter(n, m));
	}
}
