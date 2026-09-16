package refatoracoes.composicao;

public class ExtractVariable {
	void renderBanner(String platform, String browser, int resize) {
		boolean isMac = platform.toUpperCase().indexOf("MAC") > -1;
		boolean isIE = browser.toUpperCase().indexOf("IE") > -1;
		boolean initialized = wasInitialized();
		boolean resized  = resize > 0;

		  if (isMac && isIE && initialized && resized)
		  {
		    // do something
		  }
		}

	private boolean wasInitialized() {
		// TODO Auto-generated method stub
		return false;
	}
}
