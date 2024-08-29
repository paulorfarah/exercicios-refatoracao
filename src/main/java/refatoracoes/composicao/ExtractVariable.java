package refatoracoes.composicao;

public class ExtractVariable {
	void renderBanner(String platform, String browser, int resize) {
		  if ((platform.toUpperCase().indexOf("MAC") > -1) &&
		       (browser.toUpperCase().indexOf("IE") > -1) &&
		        wasInitialized() && resize > 0 )
		  {
		    // do something
		  }
		}

	private boolean wasInitialized() {
		// TODO Auto-generated method stub
		return false;
	}
}
