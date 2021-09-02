/*
 *  UCF COP3330 Fall 2021 Assignment 1 exercise02 Solution02
 *  Copyright 2021 Juan Guarnizo
 */


/*
 * Pseudocode
 *
 * create string sentence.
 * create int length.
 * Print message: "Please type any sentence you like".
 *
 * scan for user input.
 * save input on sentence variable.
 *
 * set length variable to be equal to the length of sentence.
 * print message: " sentence has length characters".
 *
 * */


import java.util.Scanner;

public class Solution02 {

    public static void main(String[] args) {

        String sentence;
        int length;
        System.out.println("Please type any sentence you like:\n");

        Scanner input = new Scanner(System.in);
        sentence = input.nextLine();

        length = sentence.length();
        System.out.println( sentence + " has " + length + " characters\n");


    }
}
