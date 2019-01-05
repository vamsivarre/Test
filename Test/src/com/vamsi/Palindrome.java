package com.vamsi;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author STE681
 *
 */
public class Palindrome {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number to check the palindrome:");
	int isPalindrome = input.nextInt();
	int isPalindromeForDisplay =isPalindrome;
	long reverseNumber =0L;
	long reverseResult = 0L;
	//String isPalindromeString[]=null;
	List<String> isPalindromeString = new ArrayList<String>();
	//int index = 0;
	while(true){
		
		isPalindromeString.add(String.valueOf(isPalindrome % 10))  ;
		//index = index +1;
		isPalindrome = isPalindrome / 10;
		if(isPalindrome == 0){
			break;
		}
	}
	//System.out.println(isPalindromeString.size());
	for(int i = 0 ; i < isPalindromeString.size();i++){
		long palindromePlace= 1L;
		for(int j = i+1 ; j < isPalindromeString.size();j++){
			palindromePlace = 10 * palindromePlace;
			
		}
		
		reverseNumber = Long.valueOf(isPalindromeString.get(i)) * palindromePlace;
		reverseResult = reverseNumber +reverseResult;
	}
if(reverseResult == isPalindromeForDisplay){
	System.out.println(isPalindromeForDisplay+ " is palindrome");
}else{
	System.out.println(isPalindromeForDisplay+ " is not palindrome");
}
}
}
