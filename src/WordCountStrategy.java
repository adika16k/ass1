public class WordCountStrategy implements AnalysisStrategy {
    @Override
    public String analyze(String text) {
        String[] words = text.split("\\s+");
        return "Word Count: " + words.length;
    }
}