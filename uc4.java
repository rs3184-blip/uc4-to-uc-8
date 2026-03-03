
public class uc4 {

    public static void main(String[] args) {

        // 1. Array Creation – Create empty String array to hold banner lines
        String[] banner = new String[5];

        // 2. Array Population – Populate array using String.join()
        banner[0] = String.join("   ", "OOOOO", "OOOOO", "PPPPP", "SSSSS");
        banner[1] = String.join("   ", "O   O", "O   O", "P   P", "S");
        banner[2] = String.join("   ", "O   O", "O   O", "PPPPP", "SSSSS");
        banner[3] = String.join("   ", "O   O", "O   O", "P", "    S");
        banner[4] = String.join("   ", "OOOOO", "OOOOO", "P", "SSSSS");

        System.out.println("Using normal for loop:\n");

        // 3. Java for loop – Iterate using index
        for (int i = 0; i < banner.length; i++) {
            System.out.println(banner[i]);
        }

        System.out.println("\nUsing enhanced for loop:\n");

        // 4. Enhanced For Loop – Cleaner traversal
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
