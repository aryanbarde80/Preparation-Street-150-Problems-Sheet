// Importing the package
import java.util.*;

// Creating a class
public class PrimeChecker {

    // Main method starts here
    public static void main(String[] args) {

        // Print statement to let user know to enter a number
        System.out.print("Enter a number to check: ");

        // Creating an object of scanner class
        Scanner sc = new Scanner(System.in);

        // Taking integer input in variable with nextInt() mathod
        int input = sc.nextInt();

        // Checking for negative
        if(input<=1){
            System.out.println("Not a prime number");
        } 
        
        // Operations for positive
        else{

            // Declaration of bolean cheack variable
            boolean isPrime = true;
            
            // Loop goes from number to square root of number, it is done for optimization of code as after sqare rot the values do repeats
            for(int i=2; i<=Math.sqrt(input); i++){

                // For any value in range, checking divisibility
                if(input % i == 0){

                    // If divisible, set false and break 
                    isPrime = false;
                    break;
                }
            }

            // Printing for prime
            if(isPrime){
                System.out.println(input + " is a prime number");
            }
            
            // Printing for non prime
            else{
                System.out.println(input + " is not a prime number");
            }
            
        }

        // Closing the object of scanner class
        sc.close();

    }
}