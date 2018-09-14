package examples;

import java.util.*;

enum days {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumSetExample {
	public void enumSetExampleDays() {

		Set<days> set = EnumSet.allOf(days.class);

		Iterator<days> itr = set.iterator();

		System.out.println("Weekends :");

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public void enumSetExampleBooks() {
		EnumMap<Key, Book> map = new EnumMap<Key, Book>(Key.class);
		// Creating Books
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
		// Adding Books to Map
		map.put(Key.One, b1);
		map.put(Key.Two, b2);
		map.put(Key.Three, b3);
		// Traversing EnumMap
		for (Map.Entry<Key, Book> entry : map.entrySet()) {
			Book b = entry.getValue();
			System.out.println(entry.getKey() + " - " + b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}
}

enum Key {
	One, Two, Three
};
