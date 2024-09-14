import java.util.Scanner;

public class LowestCommonMultiple{
    public static void main(String[] args) {
        int n1,n2; // Variables to store inputs

        System.out.print("Enter first number : ");
        Scanner sc = new Scanner(System.in); // Creating instance of scanner class
        n1 = sc.nextInt(); // first input
        System.out.print("Enter second number : ");
        n2 = sc.nextInt(); // second input

        int lcm = (n1>n2) ? n1 : n2 ; // finding highest out of both number

        while(true){
            if(lcm%n1 == 0 && lcm%n2 == 0){
                System.out.print("LCM f entered numbers : " + lcm);
                break;
            }
            ++lcm;
        }

        sc.close();



    }
}