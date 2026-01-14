import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Input student grades
        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            int grade = sc.nextInt();
            grades.add(grade);
        }

        // Initialize variables
        int total = 0;
        int highest = grades.get(0);
        int lowest = grades.get(0);

        // Calculate total, highest, and lowest
        for (int grade : grades) {
            total += grade;

            if (grade > highest) {
                highest = grade;
            }

            if (grade < lowest) {
                lowest = grade;
            }
        }

        double average = (double) total / n;

        // Display summary report
        System.out.println("\n----- Student Grade Summary -----");
        System.out.println("Total Students : " + n);
        System.out.println("Average Score  : " + average);
        System.out.println("Highest Score  : " + highest);
        System.out.println("Lowest Score   : " + lowest);

        sc.close();
    }
}
