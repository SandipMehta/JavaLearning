package examples;

import java.util.*;

public class MapInterfaceExample {
	public void hashMapExample() {
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		map.put(99, "Sam");

		// Using For Loop
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// Using Iterator

		Set set = map.entrySet();
		Iterator itr = set.iterator();

		while (itr.hasNext()) {
			// System.out.println(itr.next());
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println("Key :" + entry.getKey() + "  Value : " + entry.getValue());
		}
	}

	public void hashMapBookExample() {

		//Map<Integer, Book> map = new HashMap<Integer, Book>();
		
		//LinkedHashMap<Integer, Book> map = new LinkedHashMap<Integer, Book>();
		
		//TreeMap<Integer, Book> map = new TreeMap<Integer, Book>();
		
		Hashtable<Integer,Book> map=new Hashtable<Integer,Book>();   

		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b3 = new Book(103, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b2 = new Book(102, "Operating System", "Galvin", "Wiley", 6);

		map.put(1, b1);
		map.put(3, b3);
		map.put(2, b2);

		for (Map.Entry<Integer, Book> entry : map.entrySet()) {
			int key = entry.getKey();
			Book b = entry.getValue();
			System.out.println(key + " Details:");
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}
}
