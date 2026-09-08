package refatoracoes.composicao;

public class ExtractVariable {
    void renderBanner(String platform, String browser, int resize) {
        boolean isMacOs = platform.toUpperCase().contains("MAC");
        boolean isInternetExplorer = browser.toUpperCase().contains("IE");
        boolean wasResized = resize > 0;

        if (isMacOs && isInternetExplorer && wasInitialized() && wasResized) {
            // do something
        }
    }

    private boolean wasInitialized() {
        return false;
    }
}
