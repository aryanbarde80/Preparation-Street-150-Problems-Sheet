import java.util.Scanner; // Importing scanner class from util package

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number; // Variable declaration
        Scanner sc = new Scanner(System.in); // Object of scanner class created
        System.out.print("Enter a number: ");
        number = sc.nextInt(); // Taking input in variable

        System.out.println("Is Armstrong number: " + isArmstrong(number)); // Printing desired output

        sc.close(); //Closing object of scanner class
    }

    // Declaration of a static method
    static boolean isArmstrong(int n) {
        int temp = n, sum = 0, digits = 0; // Necessary variable declarations

        // Calculate the number of digits
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }

        System.out.println("Number of digits: " + digits); // Printing the no. of digits

        temp = n;
        // Calculate the sum of the powers of the digits
        while (temp > 0) {
            int lastdigit = temp % 10;
            sum += Math.pow(lastdigit, digits);
            temp = temp / 10;
        }

        // Check if the sum is equal to the original number
        return sum == n;
    }
}
