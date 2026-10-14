import java.util.Scanner;

public class IT24102711Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudents = 3;
        int numSubjects = 4;

        for (int i = 1; i <= numStudents; i++) {
            System.out.println("\nStudent " + i);
            System.out.print("Enter marks: ");

            // Read the entire line and split it into an array
            String[] marksStr = scanner.nextLine().split(" ");
            int totalMarks = 0;

            for (String mark : marksStr) {
                totalMarks += Integer.parseInt(mark);
            }

            // Calculate average
            double average = (double) totalMarks / numSubjects;
            System.out.println("Average is : " + average);

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
        }

        scanner.close();
    }
}
