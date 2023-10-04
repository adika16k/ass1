// Singleton Design Pattern
class TextAnalyzerSingleton {
    private static TextAnalyzerSingleton instance;
    private String text;
    private AnalysisStrategy analysisStrategy;

    private TextAnalyzerSingleton() {
        text = "";
        analysisStrategy = null;
    }

    public static TextAnalyzerSingleton getInstance() {
        if (instance == null) {
            instance = new TextAnalyzerSingleton();
        }
        return instance;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnalysisStrategy(AnalysisStrategy strategy) {
        this.analysisStrategy = strategy;
    }

    public String performAnalysis() {
        if (analysisStrategy != null) {
            return analysisStrategy.analyze(text);
        } else {
            return "No analysis strategy set.";
        }
    }
}
