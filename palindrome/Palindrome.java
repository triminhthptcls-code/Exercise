package palindrome;

public class Palindrome {
    public boolean palindrome(String str) {
        str = str.toLowerCase().replaceAll("\\s+", "");
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return str.equals(reverse);
    }
}
