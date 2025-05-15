package PalindromeNumber;


public class PalindromeFinder {
    public boolean isPalindrome(int x) {
        String string = String.valueOf(x);  //"converting" it into a new String variable, in background: integer x still exists in storage, the value gets copied & assigned to another data type (String)
        String reversed = new StringBuilder(string).reverse().toString(); //reversing the string and assigning it to a variable
        return string.equals(reversed); //simple comparison of value equality (no identity check!)
    }
}
