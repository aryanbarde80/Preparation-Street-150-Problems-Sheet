import java.util.Scanner;

public class SmallAndLarge {
    public static void main(String[] args) {
        // Scanner class to take input
        Scanner sc = new Scanner(System.in);
        int[] myarray = new int[5]; // Declare and initialize the array to hold 5 numbers
        System.out.println("Enter 5 numbers: ");
        
        // Read user input and store it in the array
        for (int i = 0; i < 5; i++) {
            myarray[i] = sc.nextInt();
        }
        
        int greatest = myarray[0];
        int smallest = myarray[0];

        // Loop through the array to find the greatest and smallest elements
        for (int i = 1; i < myarray.length; i++) {
            if (greatest < myarray[i]) {
                greatest = myarray[i];
            }
            if (smallest > myarray[i]) {
                smallest = myarray[i];
            }
        }
        
        // Print the results
        System.out.println("Greatest Element is : " + greatest);
        System.out.println("Smallest Element is : " + smallest);
        sc.close();
    }
    
}
