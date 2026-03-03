
import java.util.*;

public class uc7 {

    public static void main(String[] args) {

        String input = "OOPS";
        displayBanner(input);
    }

    public static void displayBanner(String input) {

        StringBuilder[] bannerLines = new StringBuilder[5];

        for (int i = 0; i < 5; i++) {
            bannerLines[i] = new StringBuilder();
        }

        for (char ch : input.toCharArray()) {

            CharacterPatternMap patternObj = CharacterPatternMap.getPattern(ch);

            if (patternObj != null) {
                String[] pattern = patternObj.getPattern();

                for (int i = 0; i < pattern.length; i++) {
                    bannerLines[i].append(pattern[i]).append("  ");
                }
            }
        }

        for (StringBuilder line : bannerLines) {
            System.out.println(line);
        }
    }

    // ===============================
    // Static Inner Class (UC7 Core)
    // ===============================
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        private static final Map<Character, CharacterPatternMap> patternMap = new HashMap<>();

        // Static Block to Initialize Patterns
        static {

            patternMap.put('O', new CharacterPatternMap('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
            }));

            patternMap.put('P', new CharacterPatternMap('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
            }));

            patternMap.put('S', new CharacterPatternMap('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
            }));
        }

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public String[] getPattern() {
            return pattern;
        }

        // Retrieve Pattern Object
        public static CharacterPatternMap getPattern(char character) {
            return patternMap.get(Character.toUpperCase(character));
        }
    }
}
