import java.util.Scanner;

/**
 * class to check the palindrome of word and phases.
 */
public class PalindromeChecker {

    static Scanner sc = new Scanner(System.in);  //  scanner instance for input
    static String word;  // word variable to store the input word or phrase for  check the palindrome

    // method to display the process of checking if a word or phrase is a palindrome
    public static void display() {
        System.out.println("\nEnter a word or phrase: ");
        word = sc.nextLine();  // prompt the word or phrase from the user

        // clean the input by removing spaces, punctuation, and converting it to lowercase
        String cleanedInput = cleanInput(word);

        // condition for check if the cleaned input is a palindrome by calling the isPalindrome method
        if (isPalindrome(cleanedInput)) {
            // If it's a palindrome, display that the input is a palindrome
            System.out.println("\"" + word + "\" is a palindrome.");
        } else {
            // If it's not a palindrome, display that it's not a palindrome
            System.out.println("\"" + word + "\" is not a palindrome.");
        }
    }

    // method to clean the input string by removing non-alphanumeric characters
    public static String cleanInput(String input) {
        StringBuilder clean = new StringBuilder();  // StringBuilder to hold the cleaned input

        // iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // condition to check if the character is a letter or digit
            if (Character.isLetterOrDigit(ch)) {
                // convert the character to lowercase and append it to the cleaned string
                clean.append(Character.toLowerCase(ch));
            }
        }

        // return the cleaned string that contains only lowercase letters and digits
        return clean.toString();
    }

    // method to check if the cleaned string is a palindrome
    public static boolean isPalindrome(String str) {
        int length = str.length();  // Get the length of the cleaned string

        // compare characters from both ends of the string
        for (int i = 0; i < length / 2; i++) {
            // condition to check characters at positions i and (length-i-1) match or not
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;  // return false if characters don't match
            }
        }

        // return true if the word or phrase is a palindrome (all characters matched)
        return true;
    }
}
