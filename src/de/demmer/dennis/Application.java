package de.demmer.dennis;

import java.util.Arrays;

public class Application {
	
	public static void main(String[] args) {
		
		int[] intArr = new int[5];
		
		intArr[0] = 9;
		intArr[1] = 8;
		intArr[2] = 1;
		intArr[3] = 3;
		intArr[4] = 8;

		Arrays.sort(intArr);
		
		System.out.println(Arrays.toString(intArr));
		
		

		
	}

}
