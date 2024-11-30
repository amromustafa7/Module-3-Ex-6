import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        // Prompt the user to enter their height in feet
        System.out.print("Enter feet: ");
        int feet = input.nextInt();

        // Prompt the user to enter their height in inches
        System.out.print("Enter inches: ");
        int inches = input.nextInt();

        // Convert height to inches (1 foot = 12 inches)
        int totalInches = feet * 12 + inches;

        // Compute BMI (BMI = weight in pounds / (height in inches)^2) * 703
        double bmi = (weight / (totalInches * totalInches)) * 703;

        // Display the BMI
        System.out.println("BMI is " + bmi);

        // Interpret the BMI value
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        // Close the scanner
        input.close();
    }
}
