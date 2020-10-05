public class scope {

	public static int i = 30;

	public static int foo() {
		return i;
	}

	public static int bar() {
		i = 40;
		return foo();
	}

	public static void main(String[] args) {
		System.out.println(bar());
	}
}