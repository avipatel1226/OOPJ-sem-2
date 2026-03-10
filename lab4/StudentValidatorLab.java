import java.util.*;
import java.util.regex.*;

public class StudentValidatorLab {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // =====================================================
        // PART 1 — NAME VALIDATION (String + Regex)
        // =====================================================

        // STEP 1:
        // Ask user to enter full name
        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine();

        // STEP 2:
        // Validate name
        // Only letters and spaces allowed
        // Use regex with matches()
        if (fullName.matches("[A-Za-z ]+")) {
            System.out.println("Valid name");
        } else {
            System.out.println("Invalid name");
        }

        // =====================================================
        // PART 2 — STUDENT ID VALIDATION
        // Format: S-1234
        // =====================================================

        // STEP 3:
        // Ask user to enter student ID
        System.out.print("Enter student ID (S-1234): ");
        String studentId = scanner.nextLine();

        // STEP 4:
        // Validate format using regex
        if (studentId.matches("S-\\d{4}")) {
            System.out.println("Valid student ID");
        } else {
            System.out.println("Invalid student ID");
        }

        // =====================================================
        // PART 3 — EMAIL VALIDATION
        // =====================================================

        // STEP 5:
        // Ask user to enter email
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        // STEP 6:
        // Validate email format
        if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }

        // =====================================================
        // PART 4 — SENTENCE PROCESSING
        // =====================================================

        // STEP 7:
        // Ask user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // STEP 8:
        // Count vowels using Character class
        int vowelCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = Character.toLowerCase(sentence.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Vowel count: " + vowelCount);

        // STEP 9:
        // Reverse sentence using StringBuilder
        String reversed = new StringBuilder(sentence).reverse().toString();
        System.out.println("Reversed sentence: " + reversed);

        // STEP 10:
        // Replace all digits in sentence with '*'
        String replaced = sentence.replaceAll("\\d", "*");
        System.out.println("Digits replaced: " + replaced);

        // =====================================================
        // PART 5 — TOKENIZING
        // =====================================================

        // STEP 11:
        // Create string: "Math,Science,Java,English"
        // Split using comma
        // Print each course
        String courses = "Math,Science,Java,English";
        String[] courseList = courses.split(",");

        System.out.println("Courses:");
        for (String course : courseList) {
            System.out.println(course);
        }

        // =====================================================
        // PART 6 — PATTERN & MATCHER
        // =====================================================

        // STEP 12:
        // Create string: "Invoice number is 4567 and total is 890"
        // Use Pattern and Matcher to extract all numbers

        scanner.close();
    }
}