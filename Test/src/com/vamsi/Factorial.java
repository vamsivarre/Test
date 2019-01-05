package com.vamsi;

import java.util.Scanner;

/**
 * 
 */

/**
 * @author STE681
 *
 */
public class Factorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to find factorial:");
		int factorial = input.nextInt();
		int f = factorial;
		int result =1;
		for(int i =0;  i<f; i++){
			result = factorial * result;
			factorial = factorial-1;
		}
		System.out.println("Factorial for "+f+ " is: "+result);
	}

}
