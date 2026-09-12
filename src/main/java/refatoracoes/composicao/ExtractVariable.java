package refatoracoes.composicao;

public class ExtractVariable {
	void renderBanner(String platform, String browser, int resize) {

		boolean isMac = platform.toUpperCase().indexOf("MAC") > -1;
		boolean isIE = platform.toUpperCase().indexOf("IE") > -1;
		boolean initialized = wasInitialized();
		boolean validResize = resize > 0;

		if (isMac && isIE && initialized && validResize) {
		    // do something
		  }
		}

	private boolean wasInitialized() {
		// TODO Auto-generated method stub
		return false;
	}
}
