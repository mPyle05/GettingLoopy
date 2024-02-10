import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit;
        boolean validInput;

        do {
            System.out.print("Enter the temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid temperature.");
                validInput = false;
                in.next(); // Clear the invalid input from the scanner buffer
            }
        } while (!validInput);

        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
