import java.util.Scanner;

public class IT24104085Lab7Q1B {
 
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {
            System.out.println("Student " + student);
            System.out.print("Enter marks: ");
            
            // Read input for four subjects
            String[] input = scanner.nextLine().split(" ");
            int[] marks = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                marks[i] = Integer.parseInt(input[i]);
            }

            // Calculate the average
            double average = 0;
            for (int mark : marks) {
                average += mark;
            }
            average /= marks.length;

            // Determine the grade
            String grade;
            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            // Output the results
            System.out.printf("Average is: %.2f\n", average);
            System.out.println("Overall Grade is: " + grade);
            System.out.println();
        }

        scanner.close();
    }
}