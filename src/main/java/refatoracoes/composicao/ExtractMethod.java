package refatoracoes.composicao;

public class ExtractMethod {
	void printOwing(String name) {
		  printBanner();
		  printDetails(name);
	}

	private void printDetails(String name) {
		System.out.println("name: " + name);
		System.out.println("amount: " + getOutstanding());
	}
	
	private int getOutstanding() {
		return 100;
	}

	private void printBanner() {
		System.out.println("-- banner --");
	}

}
