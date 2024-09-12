import java.util.Scanner; // Importing scanner class from util package

public class ValidateLeapYear {
    public static void main(String[] args) { // Main method starts here
        int year; // First variable
        boolean leap = false; // Check variable
        System.out.print("Enter the year to be checked: ");
        Scanner sc = new Scanner(System.in); // Scanner Object creation
        year = sc.nextInt(); // Input in variable

        // Leap Year Logic
        if(year%4 == 0){
            if(year%100==0){
                if(year%400==0){
                    leap = true;
                }
                else{
                    leap = false;
                }
            }
            leap = true;
        }
        else leap = false;

        System.out.println(year + " is a leap year? - " + leap); // Printing result

        sc.close(); // Scanner object close

    }
}
