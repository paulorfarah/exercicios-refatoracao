package refatoracoes.composicao;

public class ExtractVariable {
	void renderBanner(String platform, String browser, int resize) {
        boolean Plataforma = platform.toUpperCase().indexOf("MAC") > -1;
        boolean Browser = browser.toUpperCase().indexOf("IE") > -1;
        boolean Resize = resize > 0;
	if (Plataforma && Browser && wasInitialized() && resize > 0 ){
                // do something
        }
    }

    private boolean wasInitialized() {
        // TODO Auto-generated method stub
        return false;
    }
}
