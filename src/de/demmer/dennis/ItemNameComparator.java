package de.demmer.dennis;

import java.util.Comparator;

public class ItemNameComparator implements Comparator<Item>{

	@Override
	public int compare(Item item1, Item item2) {
		
		return item1.name.compareTo(item2.name);
	}
	
	
	

}
