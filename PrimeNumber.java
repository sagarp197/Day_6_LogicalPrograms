package com.bridgelabz;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        int i,m=0,flag=0;
        System.out.println("Please enter Number to check prime or not :");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();

        m= num/2;
        if(num==0||num==1){
            System.out.println(num +" is not prime number");
        }else
        {
            for(i=2;i<=m;i++)
            {
                if(num%i==0){
                    System.out.println(num + " is not prime number");
                    flag=1;
                }
            }
            if(flag==0)
            {
                System.out.println(num + " is prime number");
            }
        }
    }
}
