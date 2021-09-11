/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 * Copyright 2021 Noah Taylor
 */

package org.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        char quote = '"';

        System.out.println("What is the quote?");
        String userQuote = input.nextLine();

        System.out.println("Who said it?");
        String userAuthor = input.nextLine();

        System.out.println(userAuthor + " says, " + quote + userQuote + quote);
    }
}
