package refatoracoes.composicao;

public class ExtractVariable {
	void renderBanner(String platform, String browser, int resize) {
                  String plat = platform.toUpperCase();
                  String brow = browser.toUpperCase();
                  
                  boolean ehPlat = plat.indexOf("MAC") > -1;
                  boolean ehBrow = brow.indexOf("IE") > -1;
		  boolean ehResize = resize > 0;
                  
                  if(wasInitialized() && ehResize) {
                    if ( ehPlat && ehBrow) {
                      // do something
                    }
                  }
        }

	private boolean wasInitialized() {
		// TODO Auto-generated method stub
		return false;
	}
}
