package refatoracoes.composicao;

public class ExtractVariable {
	void renderBanner(String platform, String browser, int resize) {
        boolean isMacOs = platform.toUpperCase().indexOf("MAC") > -1;
        boolean isIE = browser.toUpperCase().indexOf("IE") > -1;
        boolean isResized = resize > 0;

        if (isMacOs && isIE && wasInitialized() && isResized) {
            // do something
        }
    }

	private boolean wasInitialized() {
		// TODO Auto-generated method stub
		return false;
	}
}
