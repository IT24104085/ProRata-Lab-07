import java.util.Scanner;

public class IT24104085Lab7Q1A {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] marks = new double[4];
        double total = 0;

    System.out.println("Enter marks for four Subjects: ");
        //four subjects input marks
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter Subject Mark" + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
            total += marks[i];
        }

        // Calculate average marks
        double average = total / 4;

        // Determine grade based on average marks
        String grade = findGrade(average);

        // Display the average and grade
       System.out.println();
        System.out.println("Average is: "+ average);
        System.out.println("Overall Grade is: " + grade);

        scanner.close();
    }

    // grade and average marks
    public static String findGrade(double average) {
        if (average >= 75 ) {
            return "Distinction";
        } else if (average >= 50 && average < 75) {
            return "Credit";
        } else {
            return "Fail";
        }
    }
}

