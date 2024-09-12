import java.util.Scanner;// Importing Scanner class

public class DigitSum {
    public static void main(String[] args) { // Main method starts here
        int n,r,sum = 0;// Necessary Variables declaration
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in); // Creating object of scanner class
        n = sc.nextInt(); // Taking input in variable
        while(n>0){ 
            r = n % 10; // Extracting last digit
            sum = sum + r; // Adding sum
            n = n / 10; // Removing last digit
        }

        System.out.print("Sum of digits " + sum); // Printing the result

        sc.close(); // Closing the object of scanneer class
    }
    
}
