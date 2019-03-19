package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        String username;
        int usernumber;
        int pickedNumber;
        keyboard = new Scanner(System.in);

	pickedNumber = (int)(Math.random()*100);
	System.out.println(pickedNumber);
	System.out.println("Can you guess the number, 1 to 100, that I am thinking of?");
	usernumber = keyboard.nextInt();

	if (usernumber<pickedNumber){

	    System.out.println("My number is greater than yours");

    }
        usernumber = keyboard.nextInt();
    if (usernumber>pickedNumber){
	    System.out.println("My number is less than yours");
    }
        usernumber = keyboard.nextInt();
    if (usernumber==pickedNumber){
	    System.out.println("You got it right!");
    }
    }

}
