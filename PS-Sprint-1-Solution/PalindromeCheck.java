import java.util.Scanner; // Scanner class importing
public class PalindromeCheck {
    public static void main(String[] args) { // Main method starts here
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in); // Creation of object of scanner class
        int num = sc.nextInt(); // Input number
        int rev = 0; // Initialized variable
        int backupNum = num; // Copying value
        while(num>0){ // Logical check
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        if(backupNum == rev) System.out.println("Palindrome");
        else System.out.println("Not a palindrome");
        sc.close(); // Scanner object close
    }
}
