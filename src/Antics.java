/**
 * Description
 * @author Asma Klai (isPalindrome and isAbecedarian)
 * @author Ashley Prasad (isPangram and capitalizeFirstLetter)
 * @since 03/16/2025
 */
public class Antics {
    /**
     * Method tests if inputted text can be spelled the same backwards, returns true if it can
     * @param text is a String type user input
     * @return a true or false depending on if the text can be spelled the same backwards
     */
    public static boolean isPalindrome(String text) {
         text = text.toLowerCase();
        int left = 0, right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    /**
     * Method tests if inputted text is spelled in alphabetical order, returns true if it is
     * @param text is a String type user input
     * @return a true or false depending on if the text is spelled in alphabetical order
     */
    public static boolean isAbecedarian(String text) {
        text = text.toLowerCase();
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) > text.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
    /**
     * Method tests if inputted text contains all 26 letters in the alphabet at least once, returns true if it does
     * @param text is a String type user input
     * @return a true or false depending on if the text contains all 26 letters
     */
    public static boolean isPangram(String text) {
        int count = 0;
        text = text.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) {
            int check = text.indexOf(c);
            if (check >= 0) {
                count++;
            }
        }
        if (count == 26) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * Method capitalizes the first letter only of the inputted text while the rest are lower case
     * @param text is a String type user input
     * @return text with only the first character capitalized
     */
    public static String capitalizeFirstLetter(String text) {
        text = text.toLowerCase();
        text = Character.toUpperCase(text.charAt(0)) + text.substring(1);
        return text;
    }
}

 public static void main(String[] args) {
     /**
     *Test isPalindrome
     */
        System.out.println("Palindrome Test:");
        System.out.println("Racecar: " + isPalindrome("Racecar")); // true
        System.out.println("Hello: " + isPalindrome("Hello")); // false
      /**
        *Test isAbecedarian
        */
        System.out.println("\nAbecedarian Test:");
        System.out.println("Access: " + isAbecedarian("access")); // true
        System.out.println("World: " + isAbecedarian("world")); // false

