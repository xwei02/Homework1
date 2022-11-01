import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        String inputStr = "was it a cat I saw";
        String lowerStr = inputStr.toLowerCase(Locale.ROOT);
        String newStr = lowerStr.replaceAll(" ","");
        boolean palindrome = true;
        for (int i = 0; i < newStr.length()/2; i++) {
            int j =newStr.length()-1-i;
            if (newStr.charAt(i) != newStr.charAt(j)){
                palindrome = false;
                break;
            }

        }
        if (palindrome){
            System.out.println(inputStr + " is palindrome");
        }else {
            System.out.println(inputStr + " isn't palindrome");
        }
    }
}
