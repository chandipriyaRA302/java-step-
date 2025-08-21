import java.util.*;

public class Problem3 {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) { str.charAt(count); count++; }
        } catch (Exception e) {}
        return count;
    }

    public static String[] manualSplit(String str) {
        List<String> words = new ArrayList<>();
        StringBuilder current = new StringBuilder();

        for (int i = 0; i < findLength(str); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                if (current.length() > 0) {
                    words.add(current.toString());
                    current.setLength(0);
                }
            } else {
                current.append(c);
            }
        }
        if (current.length() > 0) words.add(current.toString());
        return words.toArray(new String[0]);
    }

    // Return 2D array with words and their lengths
    public static String[][] wordLengthTable(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = manualSplit(input);
        String[][] table = wordLengthTable(words);

        System.out.println("\nWord\tLength");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }

        sc.close();
    }
}
