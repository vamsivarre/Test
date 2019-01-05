package com.vamsi;

import java.util.Scanner;


public class Prime {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int isPrimeCount=0;
	System.out.println("enter the number to check for prime:");
	int isPrime = input.nextInt();
	int isPrimeActual = isPrime;
	if((isPrime % 2) != 0){
		isPrime = (int) ((isPrime / 2) + 0.5);  
	}
	else{
		isPrime = isPrime / 2;
	}
	for(int i = 2; i <= isPrime; i++){
		if(isPrimeActual % i == 0){
			System.out.println(isPrimeActual + " is not a prime number");
			isPrimeCount = isPrimeCount +1;
			break;
		}
	}
	if(isPrimeCount == 0){
		System.out.println(isPrimeActual+ " is a prime number");
	}
}
}
