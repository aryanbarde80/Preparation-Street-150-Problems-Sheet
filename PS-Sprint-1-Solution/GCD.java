import java.util.Scanner; // Importing necessary package

public class GCD{
    public static void main(String[] args) { // Main Method starts here
        int a,b; // Two Variables
        int g = 0; // this integer will hold the greates divisor
        Scanner sc = new Scanner(System.in); // Object of scanner class creation
        System.out.print("Enter first number: ");
        a = sc.nextInt(); // Taking input one
        System.out.print("Enter second number: ");
        b = sc.nextInt(); // Taking input two
        for(int i=1;i<=a;i++){ // For loop with logic
            if(a%1 == 0 && b%i==0){
                g = i;
            }
        }
        System.out.println("GCD = " + g); // Printing result
        sc.close(); // Scanner object close
    }
}