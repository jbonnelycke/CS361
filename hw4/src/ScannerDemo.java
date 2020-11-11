
/**
 * @author scharffc
 * 
 */
public class ScannerDemo {

	private static String file1 = "D:\\Important\\School\\Git\\CS361\\hw4\\src\\tester.jay";
	private static int counter = 1;

	public static void main(String args[]) {
		TokenStream ts = new TokenStream(file1);
		System.out.println(file1);
		Token tk;
		int i = 0;
		while (i < 100) {
			tk = ts.nextToken();
			System.out.println("Token " + counter++ + " - Type: " + tk.getType() + " - Value: " + tk.getValue());
			i++;
		}
	}
}