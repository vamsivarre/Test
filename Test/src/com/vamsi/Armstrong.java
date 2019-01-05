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
public class Armstrong {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number to check for Amrstrong: ");
	int isAmrstoring = input.nextInt();
	int amrstrong = isAmrstoring;
	int isAmrstrongResult=0;
	List<String> amrstrongList = new ArrayList<String>();
	
	while(true){
		amrstrongList.add((isAmrstoring%10)+"");
		isAmrstoring = isAmrstoring/10;
		if(isAmrstoring == 0){
			break;
		}
	
	}
	for(int i =0; i<amrstrongList.size();i++){
		isAmrstrongResult = Integer.valueOf(amrstrongList.get(i))
				*Integer.valueOf(amrstrongList.get(i))
				*Integer.valueOf(amrstrongList.get(i))
				+isAmrstrongResult;
	}
	
	String result =(amrstrong == isAmrstrongResult)? amrstrong+" is amrstrong":amrstrong+" is not amrstrong";
	System.out.println(result);
}
}
