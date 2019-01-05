package com.vamsi;

import java.util.Scanner;

/**
 * 
 */

/**
 * @author STE681
 *
 */
public class Fibonacci {
	public static void main(String[] args) {
		int fib1= 0;
		int fib2= 1;
		int fib = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the count of numbers need to be printed:");
		int count = input.nextInt();
		System.out.println(fib1);
		System.out.println(fib2);
		for(int i = 2 ; i < count ; i++){
		
		fib = fib1 + fib2;
		fib1= fib2;
		fib2 = fib;
		System.out.println(fib);
		}
		
	}

}
