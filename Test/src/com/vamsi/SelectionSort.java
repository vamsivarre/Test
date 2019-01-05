package com.vamsi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SelectionSort {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	List<Integer> sortList = new ArrayList<Integer>();
	System.out.println("Enter count of numbers to be sort :");
	int count = input.nextInt();
	System.out.println("Enter" +count+ "numbers to be sort :");
	for(int i = 0; i < count; i++){
		sortList.add(input.nextInt());
	}
	System.out.println("collected elements and displaying now before sorting: ");
	for(int i = 0; i < count ; i++){
		System.out.print(sortList.get(i));
		System.out.print((i==count-1)? ".":",");
	}
	for(int i =0; i < count-1 ; i++){
		for(int j = 1; j < count; j++){
			
		}
	}
}
}
