public class ParserDemo {

	public static void main(String[] args) {

		// Change the path!
		TokenStream tStream = new TokenStream(
				"D:\\Important\\School\\Git\\CS361\\hw6\\src\\prog2.jay");

		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		Program p = cSyntax.program();
		System.out.println(p.display());
		System.out.println("test");

	}

}