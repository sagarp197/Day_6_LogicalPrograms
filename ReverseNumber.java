package com.bridgelabz;
import java.util.Scanner;
public class ReverseNumber {

    public static void main(String[] args) {
        int i=1;
        System.out.println("Please enter Number :");
        Scanner n = new Scanner(System.in);
        int number = n.nextInt();
        int reverse = 0;

        while(i <= number )
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);

    }
}
