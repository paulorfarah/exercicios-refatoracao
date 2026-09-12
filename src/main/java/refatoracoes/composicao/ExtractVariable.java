package refatoracoes.composicao;

public class ExtractVariable {
	
	public void renderBanner(String platform, String browser, int resize) {

        boolean isIE = browser.toUpperCase().contains("IE");
		boolean isMac = platform.toUpperCase().contains("MAC");
        boolean isInitialized = this.wasInitialized();
        boolean hasResize = resize > 0;

		if (isMac && isIE && isInitialized && hasResize) {
            // do something
        }
	}

	private boolean wasInitialized() {
        return false;
    }
}
