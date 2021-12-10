/*
* This is a program that finds the largest run in the string.
*
* @author  Ryan Chung
* @version 1.0
* @since   2021-12-09
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* This program calculates the largest run of a character in a user-inputted
* string.
*/
final class MaxRun {

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private MaxRun() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This function calculates the maxRun and returns it.
    *
    * @param userInput is the user-inputted String
    * @return the highest run of characters
    */
    public static int maxRun(String userInput) {

        int count = 0;
        int maxCount = 0;
        char previous = ' ';

        // Counts how many consecutive occurences for every character in
        // userInput
        for (char character : userInput.toCharArray()) {

            if (character == previous) {
                count++;
            } else {
                count = 1;
                previous = character;
            }

            if (count > maxCount) {
                maxCount = count;
            }
        }

        return maxCount;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        final String userInput;
        final int maxRun;

        try {
            // User input
            System.out.print("Enter a string: ");

            userInput = new BufferedReader(
                new InputStreamReader(System.in)
            ).readLine();

            // Calls maxRun() to get the max run
            maxRun = maxRun(userInput);

            // Outputs it to the user
            System.out.println("Max Run: " + maxRun);
        } catch (IOException exception) {
            System.out.println("Please enter a string.");
        } finally {
            System.out.println("\nDone.");
        }
    }
}

