package cyphers;

import java.util.Scanner;

public class Caesar {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("sentence to encrypt");
		String sentence = in.nextLine();
		char[] chA = sentence.toCharArray();
		int[] encChain = new int[chA.length];
		
		for(int i = 0;i<encChain.length;i++) {
			System.out.println("index transformer "+i);	
			encChain[i] = in.nextInt();
		}
		for(int i = 0;i<chA.length;i++) {
			chA[i]+=encChain[i];
		}
		String result = chA.toString().replace("[", "").replace("]", "").replace(", ", "");
		System.out.println(result);
		
		
		
		
		in.close();
	}

}
