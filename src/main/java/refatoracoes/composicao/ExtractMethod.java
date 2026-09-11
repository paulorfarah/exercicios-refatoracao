package refatoracoes.composicao;

public class ExtractMethod {
	void printOwing(String name) {
		printBanner();
		printDetails(name, getOutstanding());
	}
	
	private int getOutstanding() {
		return 100;
	}

	private void printBanner() {
		System.out.println("-- banner --");
	}

	private void printDetails(String name, int outstanding) {
		System.out.println("name: " + name);
		System.out.println("amount: " + outstanding);
	}
}
