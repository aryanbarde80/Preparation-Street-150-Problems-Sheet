// Write a program to check whether a number is even or odd.

// Importing the package
import java.util.*;

// Creating the class
public class EvenOddChecker{

    // Main method starts here
    public static void main(String[] args) {

        // Print statement to let user know the to enter a number
        System.out.print("Enter a number: ");

        // We want input in runtime, so creating an object of scanner class, object refrence is sc
        Scanner sc = new Scanner(System.in);

        // Taking input and storing in input variable using nextInt() method
        int input = sc.nextInt();

        // Even Check
        if(input % 2 == 0){
            System.out.println("Number is even");
        }

        // Odd
        else{
            System.out.println("Number is odd");
        }

        // Closing the object of scanner class
        sc.close();
    }
}