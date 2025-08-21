import java.util.Scanner;

public class StringLengthFinder {
    // Method to find length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // will throw exception at end
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // when charAt(count) goes out of range, loop stops
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Call our method
        int customLength = findLength(input);

        // Call built-in method for comparison
        int builtInLength = input.length();

        // Display results
        System.out.println("Custom Length Calculation: " + customLength);
        System.out.println("Built-in Length: " + builtInLength);

        sc.close();
    }
}
