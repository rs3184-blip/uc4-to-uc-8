
import java.util.HashMap;
import java.util.Map;

public class uc8 {

    // Centralized Pattern Storage (UC8 Core)
    private static final Map<Character, String[]> PATTERN_MAP = new HashMap<>();

    // Static Block to Initialize Patterns
    static {

        PATTERN_MAP.put('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });

        PATTERN_MAP.put('P', new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        });

        PATTERN_MAP.put('S', new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        });
    }

    public static void main(String[] args) {
        renderBanner("OOPS");
    }

    // Render Function (Separation of Logic)
    public static void renderBanner(String word) {

        int height = 5;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = PATTERN_MAP.get(Character.toUpperCase(ch));

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                } else {
                    line.append("     ").append("  "); // blank space for undefined letters
                }
            }

            System.out.println(line);
        }
    }
}
