package refatoracoes.composicao;

public class ExtractVariable {
	void renderBanner(String platform, String browser, int resize) {
		final boolean isMac = platform.toUpperCase().contains("MAC");
		final boolean isIE = browser.toUpperCase().contains("IE");
		final boolean isResized = resize > 0;

		if(isMac && isIE && wasInitialized() && isResized) {
		    // do something
		}
	}

	private boolean wasInitialized() {
		// TODO Auto-generated method stub
		return false;
	}
}
