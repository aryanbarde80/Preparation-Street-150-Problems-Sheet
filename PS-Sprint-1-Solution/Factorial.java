public class Factorial {
    public static void main(String[] args) { // Main function starts here
        int num = 5; int fact = 1; // Necessary variable declaration and initialization
        for(int i = 1;i<=num;i++){
            fact *= i; // shorthand way
        }
        System.out.println(num + "!= " + fact); // Final print statement
    }
}
