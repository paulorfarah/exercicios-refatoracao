package refatoracoes.composicao;

public class ExtractMethod {

    public void printOwing(String name) {
        printBanner();
        printDetails(name);
    }

    private void printBanner() {
        System.out.println("-- banner --");
    }

    private void printDetails(String name) {
        System.out.println("name: " + name);
        System.out.println("amount: " + 100);
    }
}