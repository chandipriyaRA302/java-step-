import java.util.*;

public class Problem2 {
    // Find length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    // Split words manually using charAt()
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
        if (current.length() > 0) {
            words.add(current.toString());
        }
        return words.toArray(new String[0]);
    }

    // Compare two arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] manual = manualSplit(input);
        String[] builtin = input.split(" ");

        System.out.println("Manual Split: " + Arrays.toString(manual));
        System.out.println("Built-in Split: " + Arrays.toString(builtin));

        System.out.println("Are they same? " + compareArrays(manual, builtin));

        sc.close();
    }
}
