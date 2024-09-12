import java.util.Scanner; // Importing Scanner class from util package
public class Fibonacci {
    public static void main(String[] args) { // Main function starts here
        int limit, first=0, second=1,next;// Necessary variable declaration with initialization
        System.out.print("Enter Term: ");
        Scanner sc = new Scanner(System.in); // Creation of object of scanner class
        limit = sc.nextInt(); // Taking input
        for(int i=1;i<=limit;i++){ // Necessary operations
            System.out.print(first + " ");
            next = first+second;
            first = second;
            second = next;
        }
        sc.close(); // Closing the object of scanner class to avoid overflow
    }
}
