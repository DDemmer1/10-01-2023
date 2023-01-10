package de.demmer.dennis;

public class Item implements Comparable<Item> {

	int id;
	double price;
	String name;

	public Item(int id, double d, String name) {
		this.id = id;
		this.price = d;
		this.name = name;
	}

	
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", price=" + price + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Item otherItem) {
		
		System.out.println(id);
		System.out.println(otherItem.id);
		
		
		
		return 0;
	}
	
	
	
	

}
