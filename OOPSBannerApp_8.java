import java.util.HashMap;
import java.util.Map;

public class BannerApp {

    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Centralized Pattern Map
    static class CharacterPatternMap {
        private static final Map<Character, CharacterPattern> patternMap = new HashMap<>();

        static {
            patternMap.put('O', new CharacterPattern('O', new String[] {
                    " ***** ",
                    "*     *",
                    "*     *",
                    "*     *",
                    " ***** "
            }));

            patternMap.put('P', new CharacterPattern('P', new String[] {
                    " ***** ",
                    "*     *",
                    " ***** ",
                    "*      ",
                    "*      "
            }));

            patternMap.put('S', new CharacterPattern('S', new String[] {
                    " ***** ",
                    "*      ",
                    " ***** ",
                    "      *",
                    " ***** "
            }));
        }

        public static CharacterPattern getPattern(char ch) {
            return patternMap.get(ch);
        }
    }

    public static void main(String[] args) {

        String word = "OOPS";
        int height = 5;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                CharacterPattern cp = CharacterPatternMap.getPattern(ch);

                if (cp != null) {
                    line.append(cp.getPattern()[row]).append("   ");
                }
            }

            System.out.println(line);
        }
    }
}