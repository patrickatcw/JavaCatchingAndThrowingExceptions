package com.me;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int result = divide();
        System.out.println(result);
    }

    private static int divide() {
        int x, y;  //declaration
        //step 2
        try {
            x = getInt();   //defining
            y = getInt();
        } catch(NoSuchElementException e) {         //catch block catching exceptions
            throw new ArithmeticException("no suitable input");  //throwing exception
        }
        System.out.println("x is " + x + ", y is " + y);
        try {
            return x / y;
        } catch(ArithmeticException e) {   //catching
            throw new ArithmeticException("attempt to divide by zero");   //throwing
        }
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");

        //step 1 catching the error
        while(true) {
            try {
                return s.nextInt();  //if valid
            } catch(InputMismatchException e) {
                // go round again.  Read past the end of line in the input first
                s.nextLine();
                System.out.println("Please enter a number using only the digits 0 to 9 "); //if other than int
            }
        }

    }

}
