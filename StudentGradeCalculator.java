import java.util.*;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numSubjects = 5;
        int[] marks = new int[numSubjects];
        System.out.println("Enter marks for " + numSubjects + " subjects (out of 100):");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + " marks: ");
            marks[i] = sc.nextInt();
        }

        int totalMarks = 0;
        for (int i = 0; i < numSubjects; i++) {
            totalMarks += marks[i];
        }
        double averagePercentage = (double) totalMarks / numSubjects;

        String grade = "";
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B+";
        } else if (averagePercentage >= 60) {
            grade = "B";
        } else if (averagePercentage >= 50) {
            grade = "C";
        } else {
            grade = "F";
        }

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        sc.close();
    }
}
