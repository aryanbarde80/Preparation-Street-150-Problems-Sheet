import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        int count = 0;
        int vCount = 0;
        int cCount = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:- ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        for(int i = 0; i < str.length() ; i++) {

            if (str.charAt(i)!= ' ') {
                count++;
            }
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ){
                vCount++;
            }
            else if(str.charAt(i) > 'a' && str.charAt(i) <'z'){
                cCount++;
            }
        }
        System.out.println("Total Characters :- " + count);
        System.out.println("Total Vowels :- " + vCount);
        System.out.println("Total Consonants :- " + cCount);

        sc.close();
    }
    
}