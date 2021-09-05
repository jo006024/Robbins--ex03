package Exercise03;

/*
Scanner set up obj = new system.in;
Enter quote input "Enter a quote:";
string str1 for quote;
Enter who said quote "Who said it?:";
String str2 for who said it input;
println(Str2+ "said" "\""+str1"\"")
Will print the "who" said " 'quote' ";
 */

import java.util.Scanner;

public class Solution03 {

    public static void main(String[] args){
        /*
         *  UCF COP3330 Fall 2021 Assignment 1 program 2 solution
         *  Copyright 2021 Jonathan Robbins
         */

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a quote: ");
        String str1 = myObj.nextLine();

        System.out.println("Who said it?: ");
        String str2 = myObj.nextLine();

        System.out.println(str2+ " said: ");
        System.out.println("\"" +str1 +"\"");
    }

}
