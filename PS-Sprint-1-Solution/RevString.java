public class RevString {
    public static void main(String[] args) {
        String str = "abcdef";
        String revChar = "";
        char ch;
        
        for(int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            revChar = ch + revChar;
        }

        System.out.println("Reverse String is: " + revChar);

    }
}
