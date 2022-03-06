package org.howard.edu.lsp.assignment2;

import java.util.ArrayList;  
import java.util.Arrays;
import java.util.Scanner;

public class tobechanged {
	
	public static int sum = 0, product = 1;
	public static ArrayList<Integer> tokens = new ArrayList<Integer>();
	
	public static void scanTokens(String input) {
	
		int token, index, beginIndex = 0;
		
		while(true) {
		
			index = input.indexOf(' ');
			
			if(index == -1)
			
			break;
			
			else {
			
				token = Integer.parseInt(input.substring(beginIndex, index));
				addToken(token);
				
				input = input.substring(index + 1, input.length());
				
			}
			
		}

		token = Integer.parseInt(input);
		addToken(token);
	
	}
	
	public static void addToken(Integer token) {
		tokens.add(token);
		sum += token;
		product *= token;
	}
	
	public static void printResults() {
		System.out.println("Tokens:");
		for (Integer token: tokens) {
	         System.out.println(token);
	      }
		System.out.println("Sum: " + sum);
		System.out.println("Product: " + product);
	}
	
	public static void resetResults() {
		tokens = new ArrayList<Integer>();
		sum = 0;
		product = 1;
	}
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
		
			System.out.println("String?");
			
			String input = in.nextLine();
			
			if(input.startsWith("Goodbye")) {
				break;
			} else {
				scanTokens(input);
				printResults();
				resetResults();
			}
		
		}
		
		in.close();
	
	}

}


