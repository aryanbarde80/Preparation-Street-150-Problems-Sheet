import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ask the user for the number of elements they want to enter
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        // Initialize the array with the given size
        int arr[] = new int[n];

        // Taking input
        System.out.println("Enter " + n + " numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Bubble Sort Logic
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { // j should start from i + 1
                if (arr[j] < arr[i]) { // Swap to sort in ascending order
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("\nSorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        sc.close();
    }
}
