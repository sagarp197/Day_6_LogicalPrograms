package com.bridgelabz;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Please enter Number to Fibonacci Series :");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();

        System.out.println("Fibonacci Series till " + num + " terms:");

        for (int i = 1; i <= num; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }



}
