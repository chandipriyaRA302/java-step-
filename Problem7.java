import java.util.*;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative!");
            }

            if (age >= 18) {
                System.out.println("You are eligible to vote ✅");
            } else {
                System.out.println("You are NOT eligible to vote ❌");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a number.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
