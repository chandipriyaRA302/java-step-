import java.util.*;

public class TextProcessor {
    // Clean and validate input
    public static String cleanInput(String input) {
        return input.trim().replaceAll("\\s+", " ");
    }

    // Analyze text
    public static void analyzeText(String text) {
        String[] words = text.split("\\s+");
        int wordCount = words.length;
        int charCount = text.replace(" ", "").length();
        int sentenceCount = text.split("[.!?]").length;

        // Find longest word
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // Most common character
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : text.toCharArray()) {
            if (c != ' ') {
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }
        }
        char mostCommon = ' ';
        int max = 0;
        for (var entry : freq.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                mostCommon = entry.getKey();
            }
        }

        System.out.println("\n--- TEXT ANALYSIS ---");
        System.out.println("Words: " + wordCount);
        System.out.println("Sentences: " + sentenceCount);
        System.out.println("Characters (excluding spaces): " + charCount);
        System.out.println("Longest Word: " + longestWord);
        System.out.println("Most Common Character: " + mostCommon);
    }

    // Get sorted words
    public static String[] getWordsSorted(String text) {
        String cleaned = text.replaceAll("[^a-zA-Z ]", "");
        String[] words = cleaned.split("\\s+");
        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);
        return words;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== TEXT PROCESSOR ===");
        System.out.print("Enter a paragraph: ");
        String paragraph = scanner.nextLine();

        // 1. Clean input
        String cleaned = cleanInput(paragraph);

        // 2. Analyze
        analyzeText(cleaned);

        // 3. Show words sorted
        String[] sortedWords = getWordsSorted(cleaned);
        System.out.println("\n--- SORTED WORDS ---");
        for (String word : sortedWords) {
            System.out.println(word);
        }

        // 4. Search for word
        System.out.print("\nEnter a word to search: ");
        String searchWord = scanner.nextLine();
        boolean found = Arrays.asList(sortedWords).contains(searchWord);
        System.out.println("Word found? " + found);

        scanner.close();
    }
}
