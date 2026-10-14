import java.util.Scanner;
public class IT24102711Lab7Q1A{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int numSubjects = 4;

        // Get marks for 4 subjects
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter Subject Mark " + i + ": ");
            int mark = scanner.nextInt();
            totalMarks += mark;
        }

        // Calculate average
        double average = (double) totalMarks / numSubjects;
        System.out.println("\nAverage is : " + average);

        // Determine grade
        String grade;
        if (average >= 75 && average <= 100) {
            grade = "Distinction";
        } else if (average >= 50 && average < 75) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        System.out.println("Overall Grade is : " + grade);

        scanner.close();
    }
}
