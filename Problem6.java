import java.util.*;

public class Problem6 {
    public static String manualTrim(String str) {
        int start = 0, end = str.length() - 1;

        // remove leading spaces
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        // remove trailing spaces
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return (start > end) ? "" : str.substring(start, end + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();

        System.out.println("Manual Trim: [" + manualTrim(input) + "]");
        System.out.println("Built-in Trim: [" + input.trim() + "]");

        sc.close();
    }
}
