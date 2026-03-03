
public class uc5 {

    public static void main(String[] args) {

        // Inline Initialization: Declare, initialize, and populate array in single statement
        String[] banner = {
            String.join("   ", " OOO ", " OOO ", " PPP ", " SSS "),
            String.join("   ", "O   O", "O   O", "P   P", "S    "),
            String.join("   ", "O   O", "O   O", "P   P", " SSS "),
            String.join("   ", "O   O", "O   O", " PPP ", "    S"),
            String.join("   ", "O   O", "O   O", "P    ", "    S"),
            String.join("   ", "O   O", "O   O", "P    ", "S   S"),
            String.join("   ", " OOO ", " OOO ", "P    ", " SSS ")
        };

        // Enhanced For Loop: Traverse and print each banner line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
