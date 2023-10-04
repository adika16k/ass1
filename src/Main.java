import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TextAnalyzerSingleton analyzer = TextAnalyzerSingleton.getInstance();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text for analysis:");
        String userInput = scanner.nextLine();

        analyzer.setText(userInput);

        AnalysisStrategy charCountStrategy = new CharacterCountStrategy();
        AnalysisStrategy wordCountStrategy = new WordCountStrategy();

        analyzer.setAnalysisStrategy(charCountStrategy);
        System.out.println(analyzer.performAnalysis());

        analyzer.setAnalysisStrategy(wordCountStrategy);
        System.out.println(analyzer.performAnalysis());

        scanner.close();
    }
}