package com.vamsi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BubbleSort {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	List<Integer> beforeSort = new ArrayList<Integer>();
	System.out.println("Enter the count of number to sort: ");
	int count = input.nextInt();
	System.out.println("Enter the elements need to sort:");
	for(int i = 0; i < count ; i++){
		beforeSort.add(input.nextInt());
	}
	System.out.println("collected elements and displaying now before sorting: ");
	for(int i = 0; i < count ; i++){
		System.out.print(beforeSort.get(i));
		System.out.print((i==count-1)? ".":",");
	}
	
	for(int i = 0 ; i < count-1 ; i++){
		for(int j = 1 ; j<count ; j++){
			if(beforeSort.get(j-1)>beforeSort.get(j)){
				int replace_for_I = beforeSort.get(j);
				int replace_for_J = beforeSort.get(j-1);
				beforeSort.set(j-1, replace_for_I);
				beforeSort.set(j, replace_for_J);
				
			}
		}
	}
	System.out.println();
	System.out.println("Displaying now after sorting: ");
	for(int i = 0; i < count ; i++){
		System.out.print(beforeSort.get(i));
		System.out.print((i==count-1)? ".":",");
	}	
}
}
