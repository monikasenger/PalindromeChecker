import java.util.Scanner;
/**
 * starting point of  palindrome checker application.
 * condition to allows users to perform multiple palindrome check.
 */
public class PalindromeChecker_Main {

    static Scanner sc = new Scanner(System.in);  //  scanner instance for input
    static PalindromeChecker check = new PalindromeChecker();  // call PalindromeChecker class method
    static char ans;  // // to store user's response for contiue the loop

    public static void main(String[] args) {
        // display the initial message indicating the start of the palindrome checker
        System.out.println("\n***************PALINDROME CHECKER*************** ");

        // loop to allow checking more than one word or phrase for palindrome
        do {
            check.display();  // Call the display method from the PalindromeChecker class
            System.out.println("\nDo you want to check more palindromes  : Y/N  ");
            ans = sc.next().charAt(0);  // get the user's response (Y/N)
            sc.nextLine();  // consume the newline character left over from the char input
        } while (ans == 'y' || ans == 'Y');  // repeat the loop if the user enters 'y' or 'Y'

        //after exiting the loop, thank the user for using the palindrome checker
        System.out.println("\nThank You :) ");
    }
}

