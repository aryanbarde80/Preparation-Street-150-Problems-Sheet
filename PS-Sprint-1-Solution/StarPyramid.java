public class StarPyramid { 

    // Main Method starts here
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the pyramid
        
        // Main Loop
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
