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

	// Nach id sortiert mit if-else

	@Override
	public int compareTo(Item otherItem) {

		if (id > otherItem.id) {
			return 1;
		}

		if (id < otherItem.id) {
			return -1;
		}

		return 0;
	}

	// -------------------------

	// Nach id sortiert mit Rechnung

//		@Override
//		public int compareTo(Item otherItem) {
	//
//			return id - otherItem.id;
//		}

	// -------------------------

	// Nach price sortiert mit if-else

//	public int compareTo(Item otherItem) {
//
//		if(price > otherItem.price) {
//			return 1;
//		}
//
//		if(price < otherItem.price) {
//			return -1;
//		} 
//		
//		return 0;
//	}

// -------------------------

// Nach price sortiert mit Rechnung
//	public int compareTo(Item otherItem) {
//
//		return (int)(price - otherItem.price);
//	}

// -------------------------

	// Nach name sortiert

//	@Override
//	public int compareTo(Item otherItem) {
//
//	return name.compareTo(otherItem.name);
//	}

}
