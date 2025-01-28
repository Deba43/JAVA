import java.util.Scanner;

public class GraderDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read score from the user
        System.out.print("Enter the score (0-100): ");
        int score = scanner.nextInt();

        // Validate the score
        if (score < 0 || score > 100) {
            System.out.println("Invalid score. Please enter a value between 0 and 100.");
        } else {
            // Create Grader object
            Grader grader = new Grader(score);

            // Get and print the letter grade
            System.out.println("The letter grade is: " + grader.letterGrade());
        }

        scanner.close();
    }
}

// Grader class
class Grader {
    private int score;

    // Constructor
    public Grader(int score) {
        this.score = score;
    }

    // Method to return letter grade
    public String letterGrade() {
        if (score >= 90) {
            return "O"; // Outstanding
        } else if (score >= 80) {
            return "E"; // Excellent
        } else if (score >= 70) {
            return "A"; // Very Good
        } else if (score >= 60) {
            return "B"; // Good
        } else if (score >= 50) {
            return "C"; // Satisfactory
        } else {
            return "F"; // Fail
        }
    }
}
