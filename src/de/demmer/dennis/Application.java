package de.demmer.dennis;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {
	
	public static void main(String[] args) {
		
		int[] intArr = {1,4,5,6};
		
		Arrays.sort(intArr);
		
//		System.out.println(Arrays.toString(intArr));
		
		
		
		//------------------------------------------
		
		
		Item i1 = new Item(9999541, 255.55, "Montior");
		Item i2 = new Item(751641, 50.50, "Tasse");
		Item i3 = new Item(8423, 99.88, "Headset");
		Item i4 = new Item(7832, 10.70, "Maus");
		Item i5 = new Item(9153666, 2.50, "Kabel");

		Item[] itemArray = {i1, i2, i3, i4, i5};
	
		
		System.out.println(Arrays.toString(itemArray));
		
		Arrays.sort(itemArray);
		
		System.out.println(Arrays.toString(itemArray));

//		System.out.println(i1.compareTo(i5));
	
		

		
	}

}
