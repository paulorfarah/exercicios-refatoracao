package refatoracoes.composicao;

public class ExtractVariable {

    void renderBanner(String platform, String browser, int resize) {

        boolean isMac = platform.toUpperCase().indexOf("MAC") > -1;
        boolean isIE = browser.toUpperCase().indexOf("IE") > -1;
        boolean initialized = wasInitialized();
        boolean hasResize = resize > 0;

        if (isMac && isIE && initialized && hasResize) {


        }
    }

    private boolean wasInitialized() {

        return false;

    }

}