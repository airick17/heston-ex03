/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Eric Heston
 */

/*
    create a program
    prompt the user to input a quote
    get the quote from user
    ask user for who says the quote
    get input from user
    print out the users quote with quotations using string escape

    import a scanner, so we can get input
    declare new scanner in the class that uses system.in (keyboard) for input
    use a print statement to prompt the user for quote
    create a new string and give it the value from scanner (user input)
        -nextLine()
    now prompt the user for the name of who said it using print statement
    create another string and give it a value from scanner (user input)
        -nextLine()
    final print statement displaying the quote and who said the quote
        -in order to use quote character use backslash to escape ---> "\""
 */

import java.util.Scanner;

public class Solution03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is the quote? ");
        String quote = input.nextLine();
        System.out.print("Who said it? ");
        String who = input.nextLine();
        System.out.println(who + " says, " + "\"" + quote + "\"");

    }
}
