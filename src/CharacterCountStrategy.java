class CharacterCountStrategy implements AnalysisStrategy {
    @Override
    public String analyze(String text) {
        String textWithoutSpaces = text.replaceAll("\\s", "");
        return "Character Count (excluding spaces): " + textWithoutSpaces.length();
    }
}
